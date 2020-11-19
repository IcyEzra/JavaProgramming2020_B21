package library;

public class StringUtility {

//  takes a sentence and word, then returns the frequency of the word
    public static int frequencyOfWord(String sentence, String word) {
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            frequency++;
        }

        return frequency;
    }
}