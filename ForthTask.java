import java.util.Scanner; 

//Write a Java program that determines if an integer is even or odd‏


//problem solving:

      // we will get the Modulus number%2
      // we choose 2 becouse it is the smallest even number
      // and we check the resulte of Modulus 
      // if it is 0 then the number is even 
      // else the number is odd 




class ForthTask {

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
            System.out.println("This number "+number+" is Even ");
        }
        else
        {
            System.out.println("This number "+number+" is Odd ");
	      }

  }
}




