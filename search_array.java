import java.util.Scanner;


public class search_array {
    public static void main(String[] args) 
    {
        int n,x,flag=0,i=0;                                                             //declaring variables
        Scanner s=new Scanner(System.in);                                               //scanning user inputs
        System.out.println("Enter no of Elements you want in array :");              //asking user to give input
        n=s.nextInt();                                                                  //scans the users input
        int a[]=new int[n];                                                             // stored it into an Array
        System.out.println("Enter all Elements :");                                  //asking user to give the input of the number that he have to find
        for(i=0;i<n;i++)
        {                                                                               //using for loop we stored every element in array
            a[i]=s.nextInt();                                                           //scans the number in array 
        }

        System.out.println("Enter the number you want to search in array");
        x=s.nextInt();                                                                  //assigned user input as x
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("Element is found at position "+(i+1));
        }
        else
        {
            System.out.println("Element not found in an array");
        }

    }    
}
