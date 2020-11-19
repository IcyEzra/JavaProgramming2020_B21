package day_23_NestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java is a programming language, I like to learn Java";
        String word = "Java";

        int count = 0;
        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, ""); // replace first will replace java each time its counted, replaceFirst is used so the same Java isn't counted again
            count++;
        }
        System.out.println("Frequency: " + count);
    }
}
