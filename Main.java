import java.util.Scanner;  // Import the Scanner class

class Main {

/*************************************************
*
*
*
*************************************************/
 static int getEquation(int x) {

    return (x^3)+(2*x^2)+(7*x)-(15);
  }




  public static void main(String[] args) {


    for (int x = 1; x < 6; x++) {

     int result = getEquation(x);

     System.out.println("The equation result is: " + result);

    }
  }
}
