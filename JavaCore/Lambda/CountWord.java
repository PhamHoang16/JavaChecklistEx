package Lambda;

public class CountWord {
    public static void main(String[] args) {
        ICountWord iCountWord = sentence -> {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') count++;
            }
            return count + 1;
        };
        String sentence = "write a java program";
        System.out.println(iCountWord.countSentence(sentence));
    }
}

interface ICountWord {
    public int countSentence(String sentence);
}
