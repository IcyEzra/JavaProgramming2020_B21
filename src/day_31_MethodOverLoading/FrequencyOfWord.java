package day_31_MethodOverLoading;

import library.StringUtility;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "Today is a shit day, today we are learning java. Today we have java class";
        int count = StringUtility.frequencyOfWord(str, "today");
        System.out.println(count);

        String str2 = "java JAVA jAvA c# C# c# java java";
        int countJava = StringUtility.frequencyOfWord(str2,"java");
        int countCSharp = StringUtility.frequencyOfWord(str2,"c#");

        System.out.println("countJava = " + countJava);
        System.out.println("count C# =  " + countCSharp);
        System.out.println("===================================================");
        // replt task with frequency of cat and dog and whether if they occur the same amount of time
        String sentence = "dog dog dog dog dog dog cat cat cat cat";
        int countDog = StringUtility.frequencyOfWord(sentence,"dog");
        int countCat = StringUtility.frequencyOfWord(sentence,"cat");
        System.out.println("Count of dog: " + countDog);
        System.out.println("Count of cat: " + countCat);

        System.out.println(countCat == countDog);


    }

       public static int frequencyOfWord(String sentence, String word){
           sentence = sentence.toLowerCase();
           word = word.toLowerCase();

           int frequency = 0;

           while(sentence.contains(word)){
               sentence = sentence.replaceFirst(word, "");
               frequency++;
           }

           return frequency;
        }




}
/*
warmup tasks:
    Task1:
        1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequency(str, word) ==>  3
 */