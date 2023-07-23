public class 有效的字母异味词 {
    public boolean isAnagram(String s, String t) {
        int []temp=new int[128];
        for (Character x:s.toCharArray()) {
            temp[x]++;
        }
        for (Character x:t.toCharArray()) {
            temp[x]--;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]!=0)return false;
        }
        return true;
    }
}
