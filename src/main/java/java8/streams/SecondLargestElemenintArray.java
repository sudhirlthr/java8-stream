package java8.streams;

import java.util.Arrays;

public class SecondLargestElemenintArray {
    /*
       *
       * Write a Java Program to find the second-highest number in an array.
       int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
       Output:
       Second largest number is:94
       * */
    public static void main(String[] args) {
        Integer arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        //System.out.println(getSecondLargestNumber(arr));
        System.out.println(Arrays.asList(arr).stream().sorted(Integer::compareTo).skip(arr.length-2).findFirst().get());
    }
}
