class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        

        char [][] arr = new char[m][n];

        for(int pl =0; pl< guards.length; pl++){
            int i = guards[pl] [0];
            int j= guards[pl][1];

             arr[i] [j] = 'G';
        }

        for(int pl =0; pl< walls.length; pl++){
            int i = walls[pl] [0];
            int j= walls[pl][1];

             arr[i] [j] = 'W';
        }


        for(int k=0; k<guards.length; k++){
            int i = guards[k] [0];
            int j = guards[k][1];

        //  right
            for(int col=j+1; col<n; col++){
                if(arr[i][col] == 'G' || arr[i][col]== 'W')
                    break;
                else
                    arr[i][col] = 'R';
            }
        

// left
         for(int col=j-1; col>=0; col--){
                if(arr[i][col] == 'G' || arr[i][col]== 'W')
                    break;
                else
                    arr[i][col] = 'R';
            }
        

        //  top
    
        for(int row=i-1; row>=0; row--){
                if(arr[row][j] == 'G' || arr[row][j]== 'W')
                    break;
                else
                    arr[row][j] = 'R';
            }
        

// bottom
         for(int row=i+1; row<m; row++){
                if(arr[row][j] == 'G' || arr[row][j]== 'W')
                    break;
                else
                    arr[row][j] = 'R';
            }
        
        }


        int count =0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == '\u0000')
                    count++;
            }
        }

        return count;



    }
}