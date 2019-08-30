package stringProblems;

import io.restassured.RestAssured;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class StringClass {

    public static void main(String[] args) {

        /**
         *
         * Reversing String
         */
        String s = "Hello World today";
        printFirstCharEach(s.trim());

        StringBuffer st = new StringBuffer(s);
        System.out.println(st.reverse());

        int size = s.length();

        String rev = "";

        for (int i = size - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        /**
         *
         * Called Regular Expressions in java String
         */
        String s1 = "^%%*&*$%$#% hello $$*&&%$$&^(*&(* world %*&^*&^ to 86987 all";

        String str = s1.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str);

        System.out.println("********************************\n");
        int number = 1234567890;

        StringBuilder sb = new StringBuilder(String.valueOf(number));
        System.out.println(sb.reverse());


        /**
         *    Revarsing Integer Value
         */
        int num = 12334456;
        int rev1 = 0;

        while (num != 0) {
            rev1 = rev1 * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev1);

        int num1 = 123456;
        /**
         *    Same way Reversing Integer
         */
        StringBuffer br = new StringBuffer(String.valueOf(num1));
        //  String str2 = br.reverse().toString();
        System.out.println(br.reverse());


        /**
         * Missing Integer in the array
         */
        int array[] = {1, 2, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        int sum1 = 0;
        for (int j = 1; j <= 10; j++) {
            sum1 = sum1 + j;
        }

        System.out.println(sum1 - sum);


        /**
         * Finding maching String
         *
         */
        String[] arrystr = {"java", "C", "Python", "JavaScript", "java"};

        for (int i = 0; i < arrystr.length; i++) {


            for (int j = i + 1; j <= arrystr.length - 1; j++) {

                if (arrystr[i].equalsIgnoreCase(arrystr[j])) {
                    System.out.println("Repeted String is = " + arrystr[i]);
                }
            }
        }

        /**
         * Largest Number
         * And
         * Smallest Numbers
         */

        int arr[] = {5, 3, 9, 768, -575, 0, 12, 1, 54};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
                Arrays.sort(arr);
            }
        }
        System.out.println("largest = " + largest);
        System.out.println("smallest = " + smallest);

        /**
         *   Char Occurrence
         */
        System.out.println("********************************************\n");
        String strins = "Theis is not a string numbers ";
        System.out.println(strins.indexOf("s", strins.indexOf("s") + 1));

        int index = strins.indexOf("s", strins.indexOf("s", strins.indexOf("s", strins.indexOf("s") + 1) + 1) + 1);
        System.out.println(index);

        /**
         *
         * Swiping with out temp
         *
         */
        int num4 = 30;
        int num5 = 20;

        num4 = num5 + num4;
        num5 = num4 - num5;
        num4 = num4 - num5;

        System.out.println("num4 =  " + num4 + "  num5 =  " + num5);

        String s2 = "Today is the best day ever i have had ";
//        StringBuilder brd = new StringBuilder(s2);
//        String s3 = brd.reverse().toString();
//        System.out.println(s3);
        int s4 = s2.length();

        String s3 = "";

        for (int i = s4 - 1; i >= 0; i--) {
            s3 = s3 + s2.charAt(i);
        }
        System.out.println(s3);
//
//        Scanner sc = new Scanner(System.in);
//        String s5 = sc.next();
//        System.out.println(s5 + "Console outPut is = ");


        String nanme = "Java is Java And Other is Other and th ih hhs dh i   cdjs i";

        StringBuilder stbd = new StringBuilder(nanme);
        System.out.println(stbd.reverse());

        String reverse = "";

        for (int i = nanme.length() - 1; i >= 0; i--) {
            reverse = reverse + nanme.charAt(i);
        }

        System.out.println(reverse);

        /**
         * First Two String char
         */

        String myname = "JewalAhmed";
        System.out.println(myname.substring(0, 2));

        /**
         * Integer to String
         */

        int num0 = 7576;
        Integer.toString(num0);


        /**
         * Place all the vowel replace with *
         *
         */
        String s5 = "A1B2C3";



        String s6 = s5.replaceAll("[123456789]", "A");
        System.out.println("\n" + s6);

        int[] numbere = {2, 4, 1, -22, 66, 755, 4352, 65, -666};

        int largestNum = numbere[0];
        int smallestNum = numbere[0];

        for (int i = 0; i < numbere.length; i++) {
            if (numbere[i] > largestNum) {
                largestNum = numbere[i];
            } else if (numbere[i] < smallestNum) {
                smallestNum = numbere[i];
            }
        }
        System.out.println(largestNum + "\n");
        System.out.println(smallestNum + "\n");

        String myName = "Jewal";
        String myName1 = "Jyewal";
        int num10 = myName.compareTo(myName1);
        System.out.println("********************************************************" + num10);

        System.out.println("\n\n\n\n ********** ++++++  **********");
        /**  NAVEEN's String Problems
         *
         */

        String str5 = "The rains have starts here";
        String str6 = "The rains have starts here";


        int legth = str5.length();
        str5.charAt(5);
        str5.concat(" But its ok");
        str5.indexOf("s", str5.indexOf("s", str5.indexOf("s") + 1) + 1);
        str5.indexOf("have");
        str5.indexOf("Hello");   // will return -1
        str5.equals(str6);
        str5.equalsIgnoreCase(str6);

        System.out.println(str5.substring(0, str5.indexOf("s")));
        //str5.replace(" ","");


    }

    //  @Test
    public void f_btest() {
        RestAssured.baseURI = "https://en-gb.facebook.com/";

        given().auth().preemptive().basic("abu.t.juwel", "717240")
                .when()
                .get("login/")
                .then()
                .assertThat()
                .statusCode(200).log().headers()
                .and()
                .header("X-Frame-Options", "DENY")
                .and();
    }


    public static void printFirstCharEach(String name) {
        String modi = name.trim();
        System.out.println(modi);

        String[] arrayName = modi.split(" ");

        for (int i = 0; i < arrayName.length; i++) {

            char[] s = arrayName[i].trim().toUpperCase().toCharArray();
            for (int j = 0; j <= s.length; j++) {

                if (j == 0) {
                    System.out.println(s[j]);
                }
            }


        }
    }


}