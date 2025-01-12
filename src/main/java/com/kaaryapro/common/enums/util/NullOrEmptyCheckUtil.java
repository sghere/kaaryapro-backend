package com.kaaryapro.common.enums.util;

import java.util.List;
import java.util.Map;

public class NullOrEmptyCheckUtil {

    public static boolean isStringNotNullOrEmpty(String string) {
        return string != null && !string.isEmpty();
    }

    public static boolean isObjectNotNullOrEmpty(Object object) {
        return object != null;
    }

    public static boolean isLongNotNullOrEmpty(Long num) {
        return num!= 0;
    }

    public static boolean isCollectionNotNullOrEmpty(List list) {
        return list!= null && !list.isEmpty();
    }

    public static boolean isObjectArrayNullOrEmpty(Object[] array) {
        return array!= null && array.length != 0;
    }

    public static boolean isCollectionNotNullOrEmpty(Map map) {
        return map!= null && !map.isEmpty();
    }

    public static boolean isValidObject(String type, List list1) {

        if (isStringNotNullOrEmpty(type)) {
            return isCollectionNotNullOrEmpty(list1);
        }

        return false;
    }

    public static boolean isValidObject(String type, Object object) {

        if (isStringNotNullOrEmpty(type)) {
            return isObjectNotNullOrEmpty(object);
        }

        return false;
    }

    public static boolean isValidObject(String type, List list1, List list2) {

        if (isStringNotNullOrEmpty(type)) {
            return isCollectionNotNullOrEmpty(list1)
                    || isCollectionNotNullOrEmpty(list2);
        }

        return false;
    }

    public static boolean isValidObject(List list1, List list2) {

        return isCollectionNotNullOrEmpty(list1)
                || isCollectionNotNullOrEmpty(list2);
    }

    public static boolean isValidObject(String type, Map map) {

        if (isStringNotNullOrEmpty(type)) {
            return isCollectionNotNullOrEmpty(map);
        }

        return false;
    }

}