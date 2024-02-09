package Chapter4oop_basics;

import java.util.Scanner;

public class Lesson8ReturnIf {

    import java.util.Scanner;

    public static void main(String[] args) {


    static String validate(){
        System.out.println("Enter your age");
        //int userInput = new Scanner(System.in).nextInt();
        Scanner scanner=new Scanner(System.in);
        int userInput=scanner.nextInt();

        if(userInput > 18){
            return " can ";
        }
            return " can't ";
    }

}
