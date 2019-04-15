/**  
* @Title: Solution200.java——
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月14日 下午3:54:19
* @version V1.0  
*/
package MiddleCode_01;

/**
* @ClassName: Solution200——岛屿的个数（FloodFill算法的应用）
* @Description: TODO给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。
* 一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
* @author msdumin@gmail.com
* 
输入:
11110
11010
11000
00000

输出: 1
* @date 2019年4月14日 下午3:54:19
*/
public class Solution200 {
	public int m,n;
	public boolean[][] isVisited;
	//偏移量
	public int[][] d = {{-1,0} , {0,1} , {1,0} , {0,-1}};
	
	//判断做标书是否越界
	private boolean isInArea(int x , int y){
		return x >=0 && x < m && y >= 0 && y < n;
	}
	
	private void bfs(char[][] table , int x , int y) {
		
		isVisited[x][y] = true;
		for(int i = 0 ; i < 4 ; i ++) {
			int newx = x + d[i][0];
			int newy = y + d[i][1];
			if(isInArea(newx, newy) && table[newx][newy] == '1' && !isVisited[newx][newy]) {
				bfs(table, newx, newy);
			}
		}
		return ;
	}
    public int numIslands(char[][] grid) {
        if(grid.length == 0)
        	return 0;
        m = grid.length;
        n = grid[0].length;
        int res = 0;
        isVisited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(grid[i][j] == '1' && !isVisited[i][j]) {
					res ++;
					bfs(grid , i , j);
				}
			}
		}
        return res;
    }
}
