
import java.util.Arrays;
import java.util.Scanner;

public class 转盘寿司 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxPrice = Arrays.stream(price).max().orElse(Integer.MIN_VALUE);
        int minPrice = Arrays.stream(price).min().orElse(Integer.MAX_VALUE);
        int[] newPrice = new int[price.length];
        for (int i = 0; i < price.length; i++) {
            if (price[i] == minPrice) {
                newPrice[i] = price[i];
                continue;
            }
            for (int j = i; j < i + newPrice.length; j++) {
                int k = j;
                if (j >= newPrice.length) {
                    k -= newPrice.length;
                }
                if (price[k] < price[i]) {
                    newPrice[i] = price[i] + price[k];
                    break;
                }
            }
        }
        for (int i = 0; i < newPrice.length; i++) {
            System.out.print(newPrice[i]+" ");
        }

    }
}
