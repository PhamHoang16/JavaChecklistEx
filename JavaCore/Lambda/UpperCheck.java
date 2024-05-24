package Lambda;

public class UpperCheck {
    public static void main(String[] args) {
        IUpperCheck iUpperCheck = s -> {
            if (s.equals(s.toUpperCase())) return "Is Uppercase";
            else if (s.equals(s.toLowerCase())) return "Is Lowercase";
            else return "Is Mixedcase";
        };
        System.out.println(iUpperCheck.checkStr("haHahah"));
    }
}
interface IUpperCheck {
    public String checkStr(String s);
}
