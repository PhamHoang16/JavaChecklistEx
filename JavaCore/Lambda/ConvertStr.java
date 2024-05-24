package Lambda;

public class ConvertStr {
    public static void main(String[] args) {
        IConvertStr iConvertStr = (str, isUpper) -> {
            if (isUpper) return str.toUpperCase();
            return str.toLowerCase();
        };
        System.out.println(iConvertStr.convert("hhaaha", true));
    }
}
interface IConvertStr {
    public String convert(String str, boolean isUpper);
}