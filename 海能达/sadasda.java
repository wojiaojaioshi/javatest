public class sadasda {
    public String ReverseSentence(String str) {
        String []arr=str.split(" ");
        int i=0,j=arr.length-1;
        while(i<j)
        {
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        String  ans="";
        for (int k = 0; k < arr.length-1; k++) {
            ans+=arr[k];
            ans+=" ";
        }
        ans+=arr[arr.length-1];
        return ans;
    }
}
