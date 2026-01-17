import java.util.Arrays;
import java.lang.System;
class arraybasics {
    public static void main(String args[]) {
        int[] arr = {10,20,30,50,70,90,100,40};
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
        
    }
}