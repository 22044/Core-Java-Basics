package p1;

public class s {

    int stack[] =new int[5]; 
    int top=0;
    public void push(int data)
    {
         stack[top]=data;
         top++;
    }

    public void show()
    {
        for(int n : stack){
           System.out.println(n +" ");
        }
    }

}
