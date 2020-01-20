package cn.sitedev.interpreter;

import java.util.HashMap;

// 减法解释器
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	// 求出left和right表达式相减后的结果
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}

}
