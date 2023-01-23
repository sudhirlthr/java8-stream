package hackerrank;

import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(Arrays.asList(1,1,0, -1,-1));
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        AtomicInteger plus = new AtomicInteger(0);
        AtomicInteger minus = new AtomicInteger(0);
        AtomicInteger zero = new AtomicInteger(0);
        arr.forEach(i -> {
            if(i > 0) plus.getAndIncrement();
            else if(i < 0) minus.getAndIncrement();
            else zero.getAndIncrement();
        });
        System.out.println(new Formatter().format("%.6f", plus.floatValue()/ arr.size()).toString());
        System.out.println(new Formatter().format("%.6f", minus.floatValue()/ arr.size()).toString());
        System.out.println(new Formatter().format("%.6f", zero.floatValue()/ arr.size()).toString());
    }
}
