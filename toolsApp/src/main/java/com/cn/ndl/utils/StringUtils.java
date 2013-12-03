/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cn.ndl.utils;

import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class StringUtils {

    public static boolean isChinese(String s) {
        if ("".equals(s)) {
            return false;
        }

        return Pattern.matches("[\\u4E00-\\u9FBF]+", s.trim());
    }
}
