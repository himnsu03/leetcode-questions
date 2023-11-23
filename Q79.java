class Solution {
    public boolean exist(char[][] board, String word) {
        boolean exist = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (word.charAt(0) == board[i][j]) {
                    exist = exists(board, word, i, j);
                    if (exist) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean exists(char [][] board, String word , int r , int c){
        if(word.isEmpty()){
            return true;
        }
        if(r<0||r>=board.length || c<0 ||c>=board[0].length || board[r][c]!=word.charAt(0) ){
            return false;
        }
        char temp = board[r][c];
      board[r][c]= '#';
       boolean result = exists(board, word.substring(1), r, c + 1) ||
                         exists(board, word.substring(1), r + 1, c) ||
                         exists(board, word.substring(1), r, c - 1) ||
                         exists(board, word.substring(1), r - 1, c);
      board[r][c]=temp;
              return result;
}
}
