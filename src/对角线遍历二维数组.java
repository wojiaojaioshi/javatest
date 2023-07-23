import java.util.ArrayList;
import java.util.List;

public class 对角线遍历二维数组 {
    private Integer[] t;
    public int[] findDiagonalOrder2()
    {
          int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
          int len=arr.length*arr[0].length;
          int mat[][]=new int[2*arr.length][2*arr[0].length+1];
        List<Integer>res=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                mat[i][j]=arr[i][j];
            }
        }
          int i=0,j=0;
          while (i!= arr.length-1||j!=arr[0].length-1)
          {
              if(i==0)
              {
                  if(mat[i][j]!=0){
                      System.out.println(mat[i][j]);
                      res.add(mat[i][j]);
                  }
                  if(res.size()==len) return new int[0];
                  j++;
                  while (j!=0)
                  {
                      if(mat[i][j]!=0){
                          System.out.println(mat[i][j]);
                          res.add(mat[i][j]);
                      }
                      i++;
                      j--;

                      if(res.size()==len) return new int[0];
                  }
              }
              if(j==0)
              {
                  if(mat[i][j]!=0){
                      System.out.println(mat[i][j]);
                      res.add(mat[i][j]);
                  }
                  if(res.size()==len) return new int[0];
                  i++;

                  while (i!=0)
                  {
                      if(mat[i][j]!=0){
                          System.out.println(mat[i][j]);
                          res.add(mat[i][j]);
                      }
                      i--;
                      j++;
                      if(res.size()==len) return new int[0];
                  }
              }
          }
          t=res.toArray(new Integer[res.size()]);
        return new int[0];
    }
    public int[] findDiagonalOrder(int[][] mat) {
         findDiagonalOrder(mat);
         int[]res=findDiagonalOrder2();
         return res;
    }
}
