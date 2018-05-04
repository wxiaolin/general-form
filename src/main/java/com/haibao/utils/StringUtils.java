package com.haibao.utils;

/**
 * Created on 2018/4/5.
 *
 * @author haibao
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str == null) {
            return false;
        }
        if ("".equals(str.trim())) {
            return false;
        }
        return true;
    }

    /**
     * 校验字符串是否符合手机号码规则
     * @param str
     * @return
     */
    public static boolean isMobileNumber(String str) {
        String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";
        return str.matches(regex);
    }
}
