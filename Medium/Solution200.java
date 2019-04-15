/**  
* @Title: Solution200.java����
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��14�� ����3:54:19
* @version V1.0  
*/
package MiddleCode_01;

/**
* @ClassName: Solution200��������ĸ�����FloodFill�㷨��Ӧ�ã�
* @Description: TODO����һ���� '1'��½�أ��� '0'��ˮ����ɵĵĶ�ά���񣬼��㵺���������
* һ������ˮ��Χ����������ͨ��ˮƽ�����ֱ���������ڵ�½�����Ӷ��ɵġ�����Լ���������ĸ��߾���ˮ��Χ��
* @author msdumin@gmail.com
* 
����:
11110
11010
11000
00000

���: 1
* @date 2019��4��14�� ����3:54:19
*/
public class Solution200 {
	public int m,n;
	public boolean[][] isVisited;
	//ƫ����
	public int[][] d = {{-1,0} , {0,1} , {1,0} , {0,-1}};
	
	//�ж��������Ƿ�Խ��
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
