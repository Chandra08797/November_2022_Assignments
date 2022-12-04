package com.cb.yash.java8_steam_api.test4;

import com.sun.security.jgss.GSSUtil;

public class StringGarbage {
    String s2;
    public StringGarbage(String s1, String s2){
        this.s2 = s2;
        StringBuilder s = new StringBuilder(s1);
        s.append(s2);
        s2 = null;
    }

    @Override
    protected void finalize(){
        System.out.println(this.s2+ " finalize method called");
        System.out.println();
    }
}
