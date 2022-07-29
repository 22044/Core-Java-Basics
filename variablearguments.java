public class variablearguments {
    
        // static int sum(int a,int b){
        //     return a+b;
        // }
        // static int sum(int a,int b,int c){
        //     return a+b+c;
        // }
        // static int sum(int a,int b,int c,int d){
        //     return a+b+c+d;
        // }


        static  int sum(int  ...arr){
            // Available as int [] arr;
            for(int a:arr)
            {
                result +=a;
            }
            return result;

        }
        public static void main(String[] args) {
        System.out.println("welcome to Varargs tutorial");
        System.out.println("the sum of 4 and 5 is "+ sum(...sum(4,5)));
        System.out.println("the sum of 4,3 and 5  is "+ sum(a:4, b:3, c:5)); 
        System.out.println("the sum of 2,4,3 and 5  is "+ sum(a:2,b:4,c:3,d:5)); 
    }
}
