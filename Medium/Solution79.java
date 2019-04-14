/**  
* @Title: Solution79.java——
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月14日 下午2:34:20
* @version V1.0  
*/
package MiddleCode_01;


/**
* @ClassName: Solution79——单词搜索  (递归回溯法) 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
* @Description: TODO
* board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
给定 word = "ABCCED", 返回 true.
给定 word = "SEE", 返回 true.
给定 word = "ABCB", 返回 false.
* @author msdumin@gmail.com
* @date 2019年4月14日 下午2:34:20
*/
public class Solution79 {
	
	int m,n;
	public boolean[][] visited;
	//二维table表的上下左右查找（偏移量数组）
	public int[][] d = {{-1,0} , {0,1} , {1,0} , {0,-1}};
	//判断startx/starty是否越界
	private boolean isInArea(int startx , int starty){
		return startx >=0 && startx < m && starty >=0 && starty < n;
	}
	
	//从table的[startx][starty]这个位置开始寻找word[index...word.length]
	private boolean searchWord(char[][] table , String word , int index , int startx , int starty){
		//递归结束条件
		if(index == word.length() - 1)
			return table[startx][starty] == word.charAt(index);
		
		if(table[startx][starty] == word.charAt(index)){
			visited[startx][starty] = true;
			for(int i = 0 ; i < 4 ; i ++ ) {
				int newstartx = startx + d[i][0];
				int newstarty = starty + d[i][1];
				//newstartx/newstarty不能越界
				if(isInArea(newstartx, newstarty) && !visited[newstartx][newstarty] &&
					searchWord(table, word, index + 1, newstartx, newstarty))
					return true;
			}
			visited[startx][starty] = false;
		}
		return false;
	}
    public boolean exist(char[][] board, String word) {
    	if(board.length == 0)
    		return false;
    	m = board.length;
    	n = board[0].length;
    	visited = new boolean[m][n];
    	
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(searchWord(board, word, 0, i, j))
					return true;
			}
		}
        return false;
    }
}
