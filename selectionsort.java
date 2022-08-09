public class selectionsort {
    public static void selection(int arr[]){
        int i,j,swap;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap=arr[j];
                    arr[j]=arr[i];
                    arr[i]=swap;
                }
            }
        }
        System.out.println("The Sorted array is : ");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,10,12,2,13,8,45};
        int i;
        System.out.println("The Unsorted array is ");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        selection(arr);
    }
}
