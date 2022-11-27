package com.cb.yash.opp.task7;

public class MyStringCompare implements CompareString{

    @Override
    public String compare(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int count=0;

        if(s1Length!=s2Length)
        return "both strings are not equals";
        else{
            for(int i=0; i<s1Length;i++){
                if(s1.charAt(i)==s2.charAt(i))
                    count++;
            }

            if(count==s1Length)
                return "both are equals";
            else
                return "both are not equals";
        }
    }
}
