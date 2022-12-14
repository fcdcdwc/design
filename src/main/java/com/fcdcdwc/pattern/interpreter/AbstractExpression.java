package com.fcdcdwc.pattern.interpreter;

/**
 * @version v1.0
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式类
 * @Author: fcdcdwc
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
