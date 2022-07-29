import java.util.Scanner;

public class conditionaloperator {
    public static void main(String[] args) {
        // Programme to find Decision thats why we use Conditional operators.
          
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc.nextInt();

        //int age=6;
          
          if(age>18){
              System.out.println("You Can Drive");

          }
          else{
              System.out.println("You Can't");
          }
    }
}
