package Lambda;

public class CheckString {
    public static void main(String[] args) {
        CheckStr checkStr = string -> string.isEmpty();
        System.out.println(checkStr.strIsEmpty(""));
    }
}

interface CheckStr {
    public boolean strIsEmpty(String string);
}
