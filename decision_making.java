// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

public class decision_making {
      public static void foree(int n){
         if(n%2==1){
            System.out.println("Weird"); 
        }
        else if(n>=2 && n<=5){
            if(n%2==0){
                System.out.println("Not Wiered");
            }
        }
        else if(n>=6 && n<=20){
            if(n%2==0){
                System.out.println("Wierd");
            }
        }
        else if(n%2==0){
            System.out.println("Not Weird");
        }
    }
    public static void main(String[] args) {

        foree(15);
    }
}
