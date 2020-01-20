package cn.sitedev.interpreter;

import java.util.HashMap;

// 变量的解释器
public class VarExpression extends Expression {
	private String key; // key=a, key=b, key=c

	public VarExpression(String key) {
		super();
		this.key = key;
	}

	// var就是{a=10,b=20}
	// intercepter根据变量名称, 返回对应值
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
