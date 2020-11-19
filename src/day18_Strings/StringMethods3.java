package day18_Strings;

import java.util.Scanner;

public class StringMethods3 {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is cool";
        sentence = sentence.replace("Java", "Python"); // Python is fun, Python is cool, new string is created so you have to reassign the string
        System.out.println(sentence);

        String email = "cybertekschool@gmail.com";
        email = email.replace("gmail", "yahoo");
        System.out.println(email);

        String essay = "Batch 20 is cool, Batch 20 is the best, Batch 20 students are awesome";
        essay = essay.replace("Batch 20", "Batch 21");
        System.out.println(essay);
        System.out.println("==================================");
        // stringName.replaceFirst(original, change) method, only changes one value instead of all (.replace())
        String r = "Cat is friendly, Cat is cute";
               r  = r.replaceFirst("Cat", "Dog");
        System.out.println(r); // prints: Dog is friendly, Cat is cute

        String t = "I like to learn Java, because Java is cool, Java is powerful";
        t = t.replaceFirst("Java is", "Python is").replaceFirst("Java ", "C# ");
        //I like to learn Java, because Python is cool, C# is powerful
        System.out.println(t);

        String a = "Yesterday was Monday, Today is Monday, Tomorrow will be Monday";
        a = a.replaceFirst("was Monday", "was Sunday").replaceFirst("be Monday", "be Tuesday");
        System.out.println(a);

        System.out.println("===========================================");

        String emailAddress = "Cybertek_School@gmail.com";

        int beginningIndex = emailAddress.indexOf("@")+1;
        int endingIndex = emailAddress.indexOf(".com");
        String domain = emailAddress.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        String p = "I like to watch movies and reading books";
        String word2 = p.substring(p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);

        String y = "I like to learn Java, Java is cool, I like to watch Jumanji";
        int n1 = y.indexOf(", J")+2;  // index number of first J
        System.out.println(n1);

        int n2 = y.lastIndexOf("J"); // index number of last J in string
        System.out.println(n2);

        String name = "My name is Muhatar";

        String result = name.substring(name.lastIndexOf("M") );
        System.out.println(result); // prints Muhtar


    }
}
