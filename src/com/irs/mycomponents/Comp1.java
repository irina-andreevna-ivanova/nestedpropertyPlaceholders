package com.irs.mycomponents;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 11.06.2010
 * Time: 16:32:24
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Comp1 {

    private String myStr;

    @Value("${${key1}.val}")
    public void setMyStr(String myStr) {
        this.myStr = myStr;
    }

    public String getMyStr(){
       return myStr;
    }
    
}
