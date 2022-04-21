package activities;

public class Activity4 {
    public static void sortArray(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr.length-1;j++)
            {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Sorting:");
        for(int num : arr)
        {
            System.out.println(num);
        }
    }

    public static void main(String[] arg){
        int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
        System.out.println("Before Sorting: ");
        for(int num : arrNumbers)
        {
            System.out.println(num);
        }
        Activity4.sortArray(arrNumbers);
    }
}
