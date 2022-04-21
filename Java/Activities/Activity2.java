package activities;

public class Activity2 {

    public static boolean result(int[] value){
        int sum = 0;
        boolean status;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == 10) {
                sum = sum + value[i];
            }
        }
        if (sum == 30) {
            status = true;
        }
        else{
            status = false;
        }
        return status;
    }
    public static void main(String[] arg){
        int[] value = {10, 77, 10, 54, -11, 10};
       boolean result = Activity2.result(value);
       System.out.println(result);
    }
}
