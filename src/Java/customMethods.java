package Java;

import java.util.Arrays;

public class customMethods <T> {

    public void print (T [] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }



    public static void main(String[] args) {

        int arr1[] = {10, 20, 30};
        Integer arr2[] = {10, 20, 30, 40};
        int arr3[] = {100, 20, 30, 40, 50};

        //  arrayPrint(arr1);
        //  arrayPrint(arr2);
        arrayPrint(arr3);
        System.out.println(maxno(arr3));
        customMethods<Integer> method = new customMethods<Integer>();
        method.print(arr2);
    }

    public static void arrayPrint(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }
    public static int maxno (int [] array) {
        Arrays.sort(array);
       return array[array.length-1];
    }

    public static double maxno (double [] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }
// Method Overloading
    // 1. possible w all methods
}

