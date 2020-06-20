package sample;

import java.util.Scanner; //program : print many tables upto desired numbers
public class Main
{
    public static void main(String[]arg){
        System.out.println("Enter your a number where you wants to print tables");
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=20 ; i++) {
           int tableof = i;
            for (int j = 1; j <= 10; j++) {
                System.out.println( tableof * j + " ");
            }
            System.out.println();

        }
    }
}

