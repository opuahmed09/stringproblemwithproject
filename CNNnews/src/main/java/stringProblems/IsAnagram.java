package stringProblems;

import java.util.Arrays;

public class IsAnagram {


    public static void main(String[] args) {

        boolean name = false;

        System.out.println((name) ? "Its True" : "Its False");

        String s = "My Name Is Jewal";
        String s1 = "My Name Is Jewal";
        int i = s.compareTo(s1);
        System.out.println(i);

        boolean anagram=isAnagram("M    ad    am","maa dm");
        System.out.println((anagram) ? "it's an Anagram":"it's not an Anagram");

    }


    /**
     * Is ANAGRAME METHOD
     */

    public static boolean isAnagram(String name, String name1) {


        String a = name.replace(" ", "").toLowerCase();
        String b = name1.replace(" ", "").toLowerCase();

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        if (Arrays.equals(charA,charB)){
            return true;
        }else {
            return false;
        }


    }

}
