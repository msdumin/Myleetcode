/**  
* @Title: Solution79.java����
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��14�� ����2:34:20
* @version V1.0  
*/
package MiddleCode_01;


/**
* @ClassName: Solution79������������  (�ݹ���ݷ�) ����һ����ά�����һ�����ʣ��ҳ��õ����Ƿ�����������С�
* @Description: TODO
* board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
���� word = "ABCCED", ���� true.
���� word = "SEE", ���� true.
���� word = "ABCB", ���� false.
* @author msdumin@gmail.com
* @date 2019��4��14�� ����2:34:20
*/
public class Solution79 {
	
	int m,n;
	public boolean[][] visited;
	//��άtable����������Ҳ��ң�ƫ�������飩
	public int[][] d = {{-1,0} , {0,1} , {1,0} , {0,-1}};
	//�ж�startx/starty�Ƿ�Խ��
	private boolean isInArea(int startx , int starty){
		return startx >=0 && startx < m && starty >=0 && starty < n;
	}
	
	//��table��[startx][starty]���λ�ÿ�ʼѰ��word[index...word.length]
	private boolean searchWord(char[][] table , String word , int index , int startx , int starty){
		//�ݹ��������
		if(index == word.length() - 1)
			return table[startx][starty] == word.charAt(index);
		
		if(table[startx][starty] == word.charAt(index)){
			visited[startx][starty] = true;
			for(int i = 0 ; i < 4 ; i ++ ) {
				int newstartx = startx + d[i][0];
				int newstarty = starty + d[i][1];
				//newstartx/newstarty����Խ��
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
