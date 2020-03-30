import java.util.Scanner;  // Import the Scanner class

class Main {

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


        int number = inputField("Enter The Number:  ");

        if(number % 2 == 0)
        {
            System.out.println("The given number "+number+" is Even ");
        }
        else
        {
            System.out.println("The given number "+number+" is Odd ");
	      }



  }
}
