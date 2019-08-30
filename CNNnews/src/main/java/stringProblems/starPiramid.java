package stringProblems;

public class starPiramid {


    public static void main(String[] args) {


//    piramidPattern(8);

        pramid(9);
        space(9);
        starPeramid(9);
    }


    public static void piramidPattern(int num){


        for(int i = 0 ; i < num ; i ++){

            for (int j = num; j >=0 ; j --){
                System.out.print(" ");
            }

            for (int k = i ; k <= num ;  k++){
                System.out.print("*");
            }

            for (int l = 2 ; l < num ; l++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void pramid(int num){

        for (int i = 0 ; i <num ; i++){

            for (int  j = 0 ; j <num-i ; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println();

        }

//        System.out.println("         ||");
//        System.out.println("         ||");
//        System.out.println("         ||");
//        System.out.println("         ||");

    }


    public static void space(int num){

        System.out.println();
        for (int i = num ; i >= 0 ; i--){
            System.out.print(" ");
        }


        System.out.println("Today is the best day ");
    }

    public static void starPeramid(int num){

        for (int i = 0 ; i < num ; i ++){

            for (int k = num ; k >= i ; k --){
                System.out.print(" ");
            }
            for (int j = 1 ; j < (i*2) ; j ++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


}
