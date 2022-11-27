package com.cb.yash.array_string;

public class StringTask_5 {
    public static void stringBufferVsBuilder() {

        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("chandrabhan");
        StringBuilder stringBuilder = new StringBuilder("chandrabhan");

        for (int i = 0; i < 10000000; i++) {
            stringBuffer.append("chakrawarty");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            stringBuilder.append("chakrawarty");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

class StringTask5Test{

    public static void main(String[] args) {
        StringTask_5.stringBufferVsBuilder();
    }
}
