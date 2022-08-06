/**
Given an array of ints, 
return the sum of the first 2 elements in the array. If the array length is less than 2, 
just sum up the elements that exist, returning 0 if the array is length 0. */


public class arropsum {

    public static void add(int arr[]){
        int sum ;
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        else if(arr.length==0){
            System.out.println("Size cannot be empty");
        }
        else{
            sum=arr[0]+arr[1];
        System.out.println(sum);
        }


    }
    public static void main(String[] args) {
        int arr[] ={10,20,30,45};
        add(arr);
    }
}
