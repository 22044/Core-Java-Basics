public class foreachloops {
    public static void main(String[] args) {
        int [] marks={98,45,79,99,80};
        float [] mark={98.01f,45.7f,78.89f,98.17f,56.06f};
        String [] students={"Harry","Shyam","Harshil","deep","Om"};
        System.out.println(marks.length);
        System.out.println(mark[4]);
        System.out.println(students[2]);
        // Display the Array (Naive Way/ Simple Way)
        System.out.println("Displaying Array in Easy Way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // we use for Loop To Display Array
        System.out.println("Printing Using For Loop");
        
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("In Reverse Order");
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Printing Using for-each Loop");
        for(int element: marks){
            System.out.println(element);
        }


    }
}
