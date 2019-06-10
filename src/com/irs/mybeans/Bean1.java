package com.irs.mybeans;

import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 10.06.2010
 * Time: 14:33:34
 * To change this template use File | Settings | File Templates.
 */
public class Bean1 {
    private String b1str1;
    private boolean b1bool;
    private String b1str2;
    private Properties b1prop;
    public String sss;

    public Bean1(String arg){
        this.sss = arg;
    }
    public void setB1str1(String b1str1) {
        this.b1str1 = b1str1;
    }

    public String getB1str1() {
        return b1str1;
    }

    public void setB1bool(boolean b1bool) {
        this.b1bool = b1bool;
    }

    public boolean getB1bool() {
        return b1bool;
    }

    public String getB1str2() {
        return b1str2;
    }

    public void setB1str2(String b1str2) {
        this.b1str2 = b1str2;
    }

    public void setB1prop(Properties b1prop) {
        this.b1prop = b1prop;
    }

    public Properties getB1prop() {
        return b1prop;
    }

    
}
