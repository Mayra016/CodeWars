public class CheckTicTacToe {

    public static int isSolved(int[][] board) {
        int x = 0;
        int o = 0;
        int empty = 0;
      
      
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {

            if (board[0][0] == 1 || board[0][0] == 2) {
              return board[0][0];
            }
        }   
                
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {

            if (board[0][2] == 1 || board[0][2] == 2) {
              return board[0][2];
            }
        }                   
                
        for (int i = 0; i < 3; i++) {
          if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {

            if (board[i][0] == 1 || board[i][0] == 2) {
              return board[i][0];
            } 

          }
                
          if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
            
            if (board[0][i] == 1 || board[0][i] == 2) {
              return board[0][i];
            }
          }
          
          if (empty == 0) {
            if (board[0][i] == 0) {
                empty++;
            }
            if (board[1][i] == 0) {
                empty++;
            }
            if (board[2][i] == 0) {
                empty++;
            }
          }
        }

        return empty == 0 ? 0 : -1;
    }

}

