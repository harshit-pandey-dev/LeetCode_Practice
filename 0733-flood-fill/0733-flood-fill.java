class pair{
    int first;
    int second;
    pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {

    public void bfs(int row,int col,int[][] image,int Ocolor,int color,boolean[][] vis){
        int n = image.length;
        int m = image[0].length;

        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(row,col));
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.poll();

        for(int delrow=-1;delrow<=1;delrow++){
            for(int delcol=-1;delcol<=1;delcol++){
                int frow = r+delrow;
                int fcol = c+delcol;

                if(frow>=0 && frow<n && fcol>=0 && fcol<m &&
                !(Math.abs(delrow)==1 && Math.abs(delcol)==1)&&
                  image[frow][fcol]==Ocolor && vis[frow][fcol]==false){
                    vis[frow][fcol]=true;
                    q.offer(new pair(frow,fcol));
                    image[frow][fcol]=color;
                  }
            }
        }
    }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        boolean[][] vis = new boolean[n][m];
        int w = image[sr][sc];

        bfs(sr,sc,image,w,color,vis);
        return image;
    }

}