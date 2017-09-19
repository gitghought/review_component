package com.simple.gh.myapplication.utils;

import java.util.Random;

/**
 * Created by gh on 2017-09-19.
 */

public class MyStringGenerateUtility {
    public static final String strsource = "" +
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" +
            "";

    public static String getStr () {
        Random ran = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++)  {
            sb.append( strsource.charAt(ran.nextInt(strsource.length())));
        }

        return sb.toString();
    }
}
