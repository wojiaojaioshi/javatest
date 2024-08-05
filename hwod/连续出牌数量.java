import java.util.Arrays;
import java.util.Scanner;

public class 连续出牌数量 {

    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] colors = sc.nextLine().split(" ");

        System.out.println(getResult(nums, colors));
    }

    static class Card {
        int num;
        char color;

        public Card(int num, String color) {
            this.num = num;
            this.color = color.charAt(0);
        }
    }

    public static int getResult(int[] nums, String[] colors) {
        int n = nums.length;
        Card[] cards = new Card[n];
        for (int i = 0; i < n; i++) cards[i] = new Card(nums[i], colors[i]);


        boolean[] used = new boolean[n];
        dfs(cards, used, null, 0);
        return ans;
    }

    //cards是牌组，used是牌是否使用，last是上一张牌的信息，count是能出的最大牌数量，ans是
    public static void dfs(Card[] cards, boolean[] used, Card last, int count) {
        if (count > ans) {
            ans = count;
        }
        for (int i = 0; i < cards.length; i++) {
            if (used[i]) continue;
            else {
                if (last == null || last.color == cards[i].color || cards[i].num == last.num) {
                    used[i] = true;
                    dfs(cards, used, cards[i], count + 1);
                    used[i] = false;
                }
            }
        }
    }
}
