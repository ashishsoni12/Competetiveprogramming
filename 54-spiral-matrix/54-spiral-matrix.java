class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        ArrayList<Integer> result=new ArrayList<>();
        int x=0,y=0;
        while(r>x && c>y)
        {
            for(int i=y;i<c;i++)
            {
                result.add(matrix[x][i]);
            }
            x++;
            for(int i=x;i<r;i++)
            {
                result.add(matrix[i][c-1]);
            }
            c--;
            if(x<r)
            {
                for(int i=c-1;i>=y;i--)
                {
                    result.add(matrix[r-1][i]);
                }
                r--;
            }
            if(y<c)
            {
                for(int i=r-1;i>=x;i--)
                {
                    result.add(matrix[i][y]);
                }
                y++;
            }
            
            
        }
        return result;
        
    }
}