/**
 * Copyright (C), 2015-2020
 * FileName: gameOfLife_289
 * Author:   924905699
 * Date:     2020/4/2 13:33
 * Description:
 * History:
 */

/**
 * 〈〉
 *
 * @author 924905699
 * @create 2020/4/2
 * @since 1.0.0
 */
class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null||board.length==0) return ;
        int m=board.length;
        int n=board[0].length;
        int[] temp={0,-1,1};
        int[][] initial=new int[m][n];
        for (int i=0;i<m;i++){
            initial[i]=board[i].clone();
        }
        for (int row=0;row<m;row++){
            for (int col=0;col<n;col++){
                int live=0;
                for (int i=0;i<3;i++){
                    for (int j=0;j<3;j++){
                        if(!(temp[i]==0&&temp[j]==0)){
                            //排除自身状态
                            int r=row+temp[i];
                            int c=col+temp[j];
                            if ((r < m && r >= 0) && (c < n && c >= 0) && (initial[r][c] == 1)) live++;
                        }
                    }
                }
                if ((initial[row][col] == 1) && (live < 2 || live > 3)) {
                    board[row][col] = 0;
//                    System.out.println("规则1或3");
                }
                // 规则 4
                if (initial[row][col] == 0 && live == 3) {
                    board[row][col] = 1;
//                    System.out.println("规则4") ;
                }
            }
        }
    }
}