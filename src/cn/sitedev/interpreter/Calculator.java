package cn.sitedev.interpreter;

import java.util.HashMap;
import java.util.Stack;

// 计算器
public class Calculator {

	// 定义表达式
	private Expression expression;

	// 构造方法传参, 并解析
	public Calculator(String expStr) { // expStr = a+b
		// 安排运算先后顺序
		Stack<Expression> stack = new Stack<>();
		// 表达式拆分成字符数组
		char[] charArray = expStr.toCharArray(); // [a,+,b]

		Expression left = null;
		Expression right = null;

		// 遍历我们的字符数组, 即遍历[a,+,b]
		// 针对不同的情况, 做处理
		for (int i = 0, j = charArray.length; i < j; i++) {
			switch (charArray[i]) {
			case '+':
				left = stack.pop(); // 从stack中取出left => "a"
				right = new VarExpression(String.valueOf(charArray[++i])); // 取出右表达式"b"
				stack.push(new AddExpression(left, right)); // 然后根据得到的left和right构建AddExpression, 加入到stack中
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				// 如果是一个Var, 就创建VarExpression对象, 并push到stack
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		// 当遍历完整个charArray数组后, stack就得到了最后的Expression
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
		// 最后将表达式a+b和var={a=10,b=20}
		// 然后传递给express的interpreter进行解释执行
		return this.expression.interpreter(var);
	}

}
