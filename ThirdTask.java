
/*
Write a Java program that defines a function that calculates the following equation; then call it for 1,2,3,4,5‏

*/



class ThirdTask {

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
