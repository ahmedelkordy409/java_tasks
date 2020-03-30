import java.util.Scanner;  // Import the Scanner class


/*
Write a java program that calculates the modulus of two numbers‏
*/



public class SecondTask {


/*************************************************
*
*
*
*************************************************/
 static int getModulus(int x, int y) {

    return x % y;
  }


/*************************************************
*
*
*
*************************************************/
 static int inputField(String message){

    Scanner input = new Scanner(System.in);  
    System.out.println(message);
    int userInput = input.nextInt(); 
    return userInput;
  }






  public static void main(String[] args) {

     int firstNumber , sceoundNumber , modulus;


     firstNumber = inputField("Enter First Number: ");
     sceoundNumber = inputField("Enter Sceound Number: ");


     modulus = getModulus(firstNumber, sceoundNumber);

     System.out.println("The nodulus is: " + modulus);


  }
}