import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        /*
        * Find the longest word within the string.
        Example String s = "Monjin interviews"
        Expected Output : interviews
        * */
        String str = "Monjin interviews";
        System.out.println(getLongestWord(str));


        /*
        *
        * Write a Java Program to find the second-highest number in an array.
        int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        Output:
        Second largest number is:94
        * */
        Integer arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        //System.out.println(getSecondLargestNumber(arr));
        System.out.println(Arrays.asList(arr).stream().sorted(Integer::compareTo).skip(arr.length-2).findFirst().get());
    }

    private static Integer getSecondLargestNumber(int[] arr) {
        if (arr.length == 0) return -1;
        if (arr.length == 1) return arr[0];

        Integer min = Integer.MIN_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if(min < arr[i] && arr[i] < max) min = arr[i];
        }
        return min;
    }

    private static String getLongestWord(String str) {
        if (str == null) return "";
        String[] split = str.split("\\s+");
        int len = 0, index = 0;
        for (int i = 0; i < split.length; i++) {
            if (len < split[i].length()) {
                len = split[i].length();
                index = i;
            }
        }
        return split[index];
    }
}
