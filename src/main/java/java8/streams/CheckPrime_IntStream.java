package java8.streams;

import java.util.stream.IntStream;

public class CheckPrime_IntStream {
    public static void main(String[] args) {
        int number = 17;
        System.out.println("isPrime for:  "+number+", "+isPrime(number));
    }

    private static boolean isPrime(int nextInt) {
        return nextInt > 1 && IntStream.range(2, nextInt).noneMatch(value -> nextInt % value == 0);
    }
}
