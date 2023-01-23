package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class MinSumMaxSum {
    public static void main(String[] args) {
        printMinMaxSum(Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625));
    }

    private static void printMinMaxSum(List<Integer> arr) {
        long sum = arr.stream().flatMapToLong(LongStream::of).sum();
        Integer min = arr.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        Integer max = arr.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println((sum-max)+" "+(sum-min));
    }
}
