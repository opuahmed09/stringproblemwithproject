package stringProblems;

public class StringClass1 {

    public static void main(String[] args) {
        String string = "ABCDEF";

        // System.out.println(string.replaceAll("[123456789]","*"));
        permutation("", string.concat("D"));
    }

    public static void permutation(String prifix, String remaining) {

        if (remaining.isEmpty()) {
            System.out.println(prifix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            permutation(prifix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));
        }
    }
}