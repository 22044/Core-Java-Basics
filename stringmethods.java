public class stringmethods {
    public static void main(String[] args) {
       
        //H-0 a-1 r-2 s-3 h-4 i-5 l-6

        // String "Specific Name"="Define String";
        // System.out.println("Specific Name");

         String name="Harshil";
         System.out.println(name);
         //-----------------------------------
         int value=name.length();
         System.out.println(value);
         //-----------------------------------
         String toLowerCase =name.toLowerCase();
         System.out.println(toLowerCase);
         //-----------------------------------
         String toUpperCase =name.toUpperCase();
         System.out.println(toUpperCase);
         //-----------------------------------
          String nonTrimmedString="   Harry   ";
          System.out.println(nonTrimmedString);
          String  trimmedString;
          System.out.println(nonTrimmedString.trim()); 
          //-----------------------------------
          //Prints out the substring after the entered index Number
          System.out.println(name.substring(1));
          //-----------------------------------
          // name.substring(int start,int end)--->Note that index Starts From 0
          System.out.println(name.substring(0, 6));  

          //----------------------------------
          System.out.println(name.replace("l","d"));
          //   name.replace(target, replacement)

          //------------------------------------
          System.out.println(name.startsWith("Har"));
          System.out.println(name.endsWith("iol"));

        //   -------------------------------------

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("rs",4));
        System.out.println(name.lastIndexOf("il"));
        System.out.println(name.lastIndexOf("il",4));

        //------------------------------------------

     System.out.println(name.equals("arshil")); //because Harshil is Match with New String Harshil 
     System.out.println(name.equalsIgnoreCase("Hareshil"));  //Mai to sirf Value Milaunga upar 7 char hai idhar bhi 7 char honi chahiye .
 

    //  To add Any sequence of characters in String 
    // we use / (Backslash) Ex:
    
     System.out.println("Hello World \\ ");
     System.out.println("Hello World \" ");
     System.out.println("Hello World \t hii "); 

     // Visit official oracle site to find out more amount of escape Characters.






         
    }
}
