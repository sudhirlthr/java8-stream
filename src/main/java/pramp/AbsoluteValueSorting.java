package pramp;

import java.util.Arrays;
import java.util.Comparator;

public class AbsoluteValueSorting implements Comparator<Integer>{
    public static void main(String[] args) {
        int[] array = new int[]{2, -7, -2, -2, 0};
        System.out.println(Arrays.toString(getAbsoluteSortedArray(array)));
        System.out.println(Arrays
                .toString(getAbsoluteSortedArrayOptimized(Arrays.stream(array).boxed().toArray(Integer[]::new))));
    }

    private static Integer[] getAbsoluteSortedArrayOptimized(Integer[] array) {
        Arrays.sort(array, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) < Math.abs(o2)) return -1;
                if (Math.abs(o1) > Math.abs(o2)) return 1;
                if (o1< o2) return -1;
                if (o1>o2) return 1;
                return 0;
            }
        });
        return array;
    }

    // TC: O(N^2)
    private static int[] getAbsoluteSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (Math.abs(array[j]) == Math.abs(array[i])){
                    if(array[j] < array[i]){
                        int temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
                else if (Math.abs(array[j]) < Math.abs(array[i])){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        if (Math.abs(o1) < Math.abs(o2)) return -1;
        if (Math.abs(o1) > Math.abs(o2)) return 1;
        if (o1 < o2) return -1;
        if (o1 > o2) return 1;
        return 0;
    }
}