package com.irs.mybeans;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 11.06.2010
 * Time: 12:15:55
 * To change this template use File | Settings | File Templates.
 */
public class Bean2 {
    private Bean1 bean1;

    public String getDefString() {
        return defString;
    }

    private String defString;

    public Bean1 getBean1() {
        return bean1;
    }

    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
    }

    public void setDefString(String defString) {
        this.defString = defString;
    }
}
