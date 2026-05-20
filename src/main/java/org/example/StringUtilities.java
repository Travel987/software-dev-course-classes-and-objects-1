package org.example;

public class StringUtilities {

    public static boolean shortString(String str) {
        return str.length() < 5;
    }

    public static char firstLetter(String str) {
        return str.charAt(0);
    }

    public static String censorAsparagus(String str) {
        return str.replace("asparagus", "****");
    }

    public static String bigger(String str1, String str2) {
        if (str1.length() >= str2.length()) {
            return str1;
        } else {
            return str2;
        }
    }
}