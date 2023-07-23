import java.util.Arrays;

public class 救生艇 {
    public int numRescueBoats(int[] people, int limit) {
        int ans=0,sum=0;
        Arrays.sort(people);
        for(int i=0;i<people.length;i++)
        {
            if(sum==limit)
            {
                ans++;
                sum=0;
            }
            if(sum>limit)
            {
                sum-=people[i-1];
                ans++;
                sum+=people[i-1];
            }
            sum+=people[i];
        }
        if(sum!=0)ans++;
        return  ans;
    }
}
