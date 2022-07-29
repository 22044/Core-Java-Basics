import java.util.Scanner;
public class Boardpercentage {
    public static void main(String[] args) {
        System.out.println("Enter your marks Subject Wise");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks of Physics:");
        int a=sc.nextInt();
        System.out.print("Enter Marks of Maths:");
        int b=sc.nextInt();
        System.out.print("Enter Marks of English:");
        int c=sc.nextInt();
        System.out.print("Enter Marks Of S.S:");
        int d=sc.nextInt();
        System.out.print("Enter Marks of Gujarati:");
        int e=sc.nextInt();
        System.out.print("Enter Marks of Science:");
        int f=sc.nextInt();
      

        int sum=a+b+c+d+e+f;
        System.out.print("Total Marks:");
        System.out.println(sum);
        
        int div=(sum/6);
        System.out.print("Percentage :");
        System.out.println(div);

    }
}
