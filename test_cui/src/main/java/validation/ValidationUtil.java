package validation;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

public class ValidationUtil {

    private static final String HANKAKU_KANA_LIST = "ｶｷ";

    public static boolean matchRegexp(String value, String regexp) {
        if (StringUtils.isEmpty(value)) {
            return true;
        }
        if (regexp == null || regexp.length() <= 0) {
            return false;
        }
        return value.matches(regexp);
    }

    protected static boolean isHankakuKana(char c) {
        return HANKAKU_KANA_LIST.indexOf(c) >= 0;
    }

    protected static boolean isHankaku(char c) {
        return (c <= '\u00ff') || isHankakuKana(c);
    }

    protected static boolean zenhankakuDistinguish(Function<Character, Boolean> function, String value) {

        if (StringUtils.isEmpty(value)) {
            return true;
        }
        char[] chars = value.toCharArray();
        for (char c : chars) {
            if (!function.apply(c)) {
                return false;
            }
        }
        return true;
    }
}
