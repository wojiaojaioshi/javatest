public class CC {
        static final int MOD = (int) 1e9 + 7;

        public int peopleAwareOfSecret(int n, int delay, int forget) {
            int[] f = new int[n];
            f[0] = 1;
            int cntA = 0;
            for (int i = 0; i < n; ++i) {
                if (i + delay >= n) cntA = (cntA + f[i]) % MOD;
                for (int j = i + delay; j < Math.min(i + forget, n); ++j)
                    f[j] = (f[j] + f[i]) % MOD;
            }
            return (cntA + f[n - 1]) % MOD;
        }
}
