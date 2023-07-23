import java.util.*;

public class 阿里6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] features = new long[n];
        for(int i = 0; i < n; i++){
            features[i] = sc.nextLong();
        }

        Arrays.sort(features);

        // 从中间和最左边开始取，这样每次取的之间距离是相同的
        // 这样特征值相差最平均
        int mid = n / 2, i = 0;
        int j = mid;
        ArrayList<Long> seats = new ArrayList(n);
        long res = 0;
        while(i < mid && j < n){
            seats.add(features[j]);
            seats.add(features[i]);
            i++;
            j++;
        }
        if(j < n){
            seats.add(features[j]);
        }
        //计算差值和
        for(i = 1; i < n; i++){
            res += Math.abs(seats.get(i) - seats.get(i - 1));
        }
        res += Math.abs(seats.get(0) - seats.get(seats.size() - 1));
        System.out.println(res);
        for(Long s : seats){
            System.out.print(s + " ");
        }
    }
}


