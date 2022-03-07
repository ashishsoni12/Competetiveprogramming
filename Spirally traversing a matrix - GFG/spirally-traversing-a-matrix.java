// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
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
