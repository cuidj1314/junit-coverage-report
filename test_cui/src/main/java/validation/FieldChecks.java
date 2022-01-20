package validation;

public class FieldChecks {

    /**
     * 为了测试而做成的javadoc
     * @param value String
     * @return 结果
     */
    public static boolean hankakuKanaString(String value) {
        return ValidationUtil.zenhankakuDistinguish(x->{
            return ValidationUtil.isHankaku(x);
        }, value);
    }

    public static boolean hankakuString(String value){
        return ValidationUtil.zenhankakuDistinguish(ValidationUtil::isHankaku,value);
    }
}
