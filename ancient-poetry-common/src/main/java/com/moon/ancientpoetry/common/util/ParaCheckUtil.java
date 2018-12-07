package com.moon.ancientpoetry.common.util;

import java.util.Collection;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

public class ParaCheckUtil {


    /**
     * 判断集合是否为NULL或空
     * @param collection 集合
     * @return 如果此collection为null或不包含元素，则返回 true
     */
    public static boolean isNullOrEmpty(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 判断MAP是否为NULL或空
     * @param map MAP
     * @return 如果此map为null或不包含元素，则返回 true
     */
    public static boolean isNullOrEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    /**
     * 判断字符串是否为NULL或空
     * @param s 字符串
     * @return 如果此map为null或空，则返回 true
     */
    public static boolean isNullOrEmpty(String s) {
        return StringUtils.isBlank(s);
    }

    /**
     * 判断Object是否为NULL
     * @param obj Object
     * @return true/false
     */
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    /**
     * 判断字符串数组是否为NULL或空
     * @param s 字符串数组
     * @return 如果此map为null或空，则返回 true
     */
    public static boolean isNullOrEmptys(String[] s) {
        return s == null || s.length == 0;
    }


}
