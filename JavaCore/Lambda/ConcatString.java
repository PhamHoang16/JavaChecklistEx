package Lambda;

public class ConcatString {
    public static void main(String[] args) {
        String s1 = "hoang";
        String s2 = "Pham";
        IConcatString iConcatString = (str1, str2) -> str1.concat(str2);
        System.out.println(iConcatString.concatStr(s1, s2));
    }
}
interface IConcatString {
    public String concatStr(String str1, String str2);
}
