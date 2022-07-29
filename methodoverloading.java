public class methodoverloading {
    static void foo(){
        System.out.println("Good Morning Foo!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning"+a+"bro!");
        System.out.println("Good Morning"+b+"bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning"+a+"bro!");
    }

    static void change(int a){
        a=98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }
    static void telljoke(){
        System.out.println("I Invented a New Word !\n"+"plagiarism");
    }

//Program ka Execution always Main Method se Start Hota Hai
public static void main(String[] args) {
  //  telljoke();
  
  


  //case1: changing the integer.
//   int x=45;
//   change(x);
//   System.out.println("The Value of  x after running change is "+x);

//changing the Array
// int [] marks={52,73,77,89,98,94};
// change2(marks);
// System.out.println("The Value od X after running is :"+marks[0]);

//Method Overloading
foo();  //arguments are actual!

}
}
