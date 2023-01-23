package exception.capillary;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 7 ,9 ,11, 10, 13, 15, 8, 12, 17, 16, 15};
        System.out.println(getDaysOfBuyingAndSellingStocks(arr));
    }

    private static List<List<Integer>> getDaysOfBuyingAndSellingStocks(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length, min = 0, max = 0;
        for (int i = 1; i < n; i++) {
            List<Integer> currentIndexs = new ArrayList<>();
           if (arr[i] < arr[max]) {
               if (min < max){
                   currentIndexs.add(min);
                   currentIndexs.add(max);
                   min = i;
               }else {
                   min++;
               }
           }else {
               max = i;
           }
            if (currentIndexs.size() > 0) result.add(currentIndexs);
        }
        return result;
    }
}
