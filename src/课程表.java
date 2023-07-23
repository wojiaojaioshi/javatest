import java.util.ArrayList;
import java.util.List;

public class 课程表 {
    List<List<Integer>>edges=new ArrayList<>();
    int visited[];
    boolean flat=true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < prerequisites.length; i++) {
            edges.add(new ArrayList<>());
        }
        visited=new int[numCourses];
        for (int []x:prerequisites) {
            edges.get(x[1]).add(x[0]);
        }
        for (int i = 0; i < numCourses&&flat; i++) {
            if(visited[i]==0)
                dfs(i);
        }
        return flat;
    }
    void dfs(int x)
    {
        visited[x]=1;
        for (int v:edges.get(x)) {
            if(visited[v]==0)
            {
                dfs(v);
                if(!flat)return;
            }
            else if(visited[v]==1)
            {
                flat=false;
                return ;
            }
        }
        visited[x]=2;
    }

}
