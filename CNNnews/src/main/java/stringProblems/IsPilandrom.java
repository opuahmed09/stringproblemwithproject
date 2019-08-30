package stringProblems;

public class IsPilandrom {


    public static void main(String[] args) {
       boolean pilandrom =  isPilandrom("MOM");

        System.out.println((pilandrom) ? "it's a Pilandrom Word":"it's Not a Pilandrom Word");
    }

    public static boolean isPilandrom(String pilandrom){

        String rev = "";

        for (int i = pilandrom.length()-1; i >=0 ; i--){
            rev = rev + pilandrom.charAt(i);
        }

        if (pilandrom.equalsIgnoreCase(rev)){
            return true;
        }else {
            return false;
        }
    }
}
