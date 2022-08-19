import java.util.*;
import java.io.*;
public class stack {
    
    static void s_push(Stack <Integer> stack){
        System.out.println("Current Elements inside stack ");
            for(int i=0;i<5;i++){
                stack.push(i);
                System.out.println(i);
            }
    }

    static void s_pop(Stack<Integer> stack){
        System.out.println("Poping each elemnt in LIFO manner :");

        for(int i=0;i<5;i++){
            Integer y=(Integer) stack.pop();
            System.out.println(y);
        }
    }

    public static void main(String []args){
        Stack<Integer> stack=new Stack<Integer>();

        s_push(stack);
        s_pop(stack);


    }
}
