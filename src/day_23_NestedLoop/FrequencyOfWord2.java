package day_23_NestedLoop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence = "Java Java Java Java";
        String word = "java";

        String temp = sentence.toLowerCase();
        int count = 0;

        while(temp.contains(word)){
            temp = temp.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);

    }
}
