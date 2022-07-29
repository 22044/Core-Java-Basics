public class methods {   // A Method is aFunction written iside a class
      static void telljoke(){
          System.out.println("I Invented a New Word !\n"+"plagiarism");
      }
      // jab aapko Method se Kuch return Nahi Karvana Hota Tab Aap Void Return karvate Ho
      static int logic(int x,int y){ //Method
            int z;
            if(x>y){
                z=x+y;
            }
            else{
                z=(x+y)*5;
            }
            return z;
        }

        // static nahi kiya to object Banana Hi Paedga
        // Stattic likh diya then Dirct call kar Paoge using logic(a,b)
        public static void main(String[] args){ //components
        int a=5;
        int b=7;
        int c;
        //Method invocation using Object Creation
        //methods obj=new methods(); -->object banaya 
        //c= obj.logic(a,b);         -->Method ko call kiya usi object ki madad se  
        
        c=logic(a,b);
        System.out.println(c);
        int a1=5;
        int b1=7;
        int c1;
        //Method invocation using Object Creation
        // method.obj=new methods();
        // c1=obj.logic(a1,b1); 
        c1=logic(a1,b1);
        System.out.println(c1);
        }        
    }


