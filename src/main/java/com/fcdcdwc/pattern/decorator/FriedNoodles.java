package com.fcdcdwc.pattern.decorator;

/**
 * @version v1.0
 * &#064;ClassName:  FriedNoodles
 * &#064;Description:  炒面(具体的构件角色)
 * &#064;Author:  fcdcdwc
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12,"炒面");
    }

    public float cost() {
        return getPrice();
    }
}
