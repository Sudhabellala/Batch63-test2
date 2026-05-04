package com.InnerClassesEnums;

enum Size {
    SMALL, MEDIUM, LARGE
}

public class EnumMethods {
    public static void main(String[] args) {
        Size s = Size.MEDIUM;

        System.out.println(s.ordinal());       // 1
        System.out.println(Size.valueOf("SMALL"));
    }
}