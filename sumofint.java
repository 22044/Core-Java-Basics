public class sumofint {
    public static void main(String[] args) {
        System.out.println("\nPrinting sum of int greater than 100 nd less than 200\n");
        int i=100;
        int sum=0;
        do{
           i++;
           if(i%7==0){
            sum=sum+i;
          //  System.out.println(sum);
           }
        }while(i<200);
        System.out.println(sum);
    }
}
