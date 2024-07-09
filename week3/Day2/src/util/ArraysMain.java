package util;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        System.out.println("----------------CopyOfRange----------------");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 = Arrays.copyOfRange(arr, 1, 4);

        int[] arr2 = Arrays.copyOfRange(arr, 1, 1);

//        int[] arr3 = Arrays.copyOfRange(arr, 1, 0); -> 런타임 에러

//        int[] arr4 = Arrays.copyOfRange(arr, -1, 0); -> 런타임 에러

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------fill----------------");
        Integer[] integers = new Integer[13];
        Arrays.fill(integers, 7);

        System.out.println(Arrays.toString(integers));

        System.out.println("----------------sort----------------");
        Integer[] integers1 = {3,2,5,16,27,37,2,3,231};
        System.out.println("before sort : " + Arrays.toString(integers1));

        Arrays.sort(integers1);
        System.out.println("after sort : " + Arrays.toString(integers1));

        System.out.println("----------------binarySearch----------------");
        System.out.println("after binarySearch : " + Arrays.binarySearch(integers1, 16));
    }
}
