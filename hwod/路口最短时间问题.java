//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class 路口最短时间问题 {
//    static int minTime = Integer.MAX_VALUE;
//    static int timePreRoad;
//    static int rowStart;
//    static int colStart;
//    static int rowEnd;
//    static int colEnd;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[][] lights = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                lights[i][j] = sc.nextInt();
//            }
//        }
//        timePreRoad = sc.nextInt();
//
//        rowStart = sc.nextInt();
//        colStart = sc.nextInt();
//
//        rowEnd = sc.nextInt();
//        colEnd = sc.nextInt();
//
//    }
//
//    static void dfs(int[][] lights, int x, int y, ArrayList<int[]>path) {
//        if (x == rowEnd && y == colEnd) {
//            if (timeSum < minTime) {
//
//
//            }
//        }
//    }
//    static int getTimeSum(ArrayList<int[]>path,int [][]lights){
//        int sum=0;
//
//        if(path.size()==2)return 60;
//        else {
//            for (int i = 1; i < path.size(); i++) {
//              int posX=path.get(i)[0]-path.get(i-1)[0];
//              int posY=path.get(i)[1]-path.get(i-1)[1];
//
//            }
//        }
//    }
//}
