import java.util.Scanner;  // Import the Scanner class

/*
Write a Java program that accepts two numbers and adds them‏
*/


public class FirstTask {


/*************************************************
*
*
*
*************************************************/
 static int getSum(int x, int y) {
    return x + y;
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

     int firstNumber , sceoundNumber , numberSum;


     firstNumber = inputField("Enter First Number......");
     sceoundNumber = inputField("Enter Sceound Number....");


     numberSum = getSum(firstNumber, sceoundNumber);

     System.out.println("The Sum is: " + numberSum);


  }
}
