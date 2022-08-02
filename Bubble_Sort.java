/*Bubble sort Algorithm */

public class Bubble_Sort {
    static void bubble(int arr[]){
        int i,j;
        int swap;
        for(i=0;i<arr.length;i++){
            for(j=1;j<=arr.length-1;j++){
                if(arr[j-1]>arr[j]){
                    swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                }
            }
        }
        System.out.println("The Sorted array is : ");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={15,12,3,18,158,156};
        System.out.println("Array Before Bubble Sort");     
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
         bubble(arr);
    }
}
