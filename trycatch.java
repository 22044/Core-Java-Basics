public class trycatch {
    public static void main(String[] args) {
        int a =6000;
        int b = 98;
        try{
            int c=a/b;
            System.out.println("The Result is "+c);
        }
        catch(Exception e){
            System.out.println("We fetch the error as :"+e);
        }      
    }
}
