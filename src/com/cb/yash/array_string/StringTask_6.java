package com.cb.yash.array_string;

public class StringTask_6 {

    public static void stringMemory(){
        String s1 = "chandrabhan";
        String s2 = "chandrabhan";
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3 =  new String("chandrabhan");
        String s4 =  new String("chandrabhan");
        System.out.println(s3 == s4);
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s1==s3);

        String s5 = new String("chakrawarty");
        String s6 = "chakrawarty";
        System.out.println(s5==s6);
        System.out.println(s5.hashCode());
        System.out.println(s6.hashCode());

    }
}

class StringTask6Test{
    public static void main(String[] args) {
        StringTask_6.stringMemory();
    }
}