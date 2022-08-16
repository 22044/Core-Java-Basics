public class Fizzbuzz {
    public static void fizzBuzz(int n) {
        for(int i=0;i<n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0){
                System.out.println("Fiz");
            }
            else if(i%3!=0 && i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        fizzBuzz(15);
    }
}
