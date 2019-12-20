package com.hans.array;

/**
 * Reverse String
 */
public class ReverseWord {

    public static void main(String[] args) {
        String a = "JavaBlock";
        String reverse = "";
        for(int i = a.length()-1;i>0;i--){
            reverse = reverse+a.charAt(i);
        }
        System.out.println(reverse);
        usingBuffer(a);
    }

    //using StringBuffer
    static void usingBuffer(String name){
        StringBuffer stringBuffer = new StringBuffer(name);
        System.out.println("Using Buffer "+ stringBuffer.reverse());
    }

}
