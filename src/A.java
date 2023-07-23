public class A {
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 1; i <=2020; i++) {
            String s = String.valueOf(i);
            if (s.contains("2")) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j)=='2') {
                        count++;
                        System.out.println(s);
                    }

                }
            }
        }
        System.out.println(count); //624
    }
}
