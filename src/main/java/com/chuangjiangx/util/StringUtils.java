package com.chuangjiangx.util;

/**
 * @author Tzhou on 2017/8/20.
 */
public class StringUtils {

    /**
     * 去掉字符串中的引号
     *
     * @param quotedString 字符串
     * @return 字符串
     */
    public static String replaceQuotes(String quotedString) {
        if (quotedString == null) {
            return null;
        }
        return quotedString.replaceAll("\"", "");
    }

    /**
     * 是否为空
     */
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for (int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    /**
     * 对多行注释信息进行按行切分
     */
    public static String[] linesSplit (String comment) {
        if (isBlank(comment)) {
            return null;
        }
        int index = comment.indexOf("\n");
        if (index == -1){
            return new String[]{comment};
        }
        return new String[]{comment.substring(0,index),comment.substring(index+1)};
    }

}
