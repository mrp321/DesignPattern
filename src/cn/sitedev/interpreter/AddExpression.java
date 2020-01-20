package cn.sitedev.interpreter;

import java.util.HashMap;

// 加法表达式
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	// 求出left和right表达式相加后的结果
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
