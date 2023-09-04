package Matrix;

public class LeetCode999 {
    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}};
        int row= 0;
        int col = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i][j] == 'R'){
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        int count = 0;
        boolean b = false;
        for (int i = 0; i < 8; i++) {
            if(board[i][col] == '.'){
                continue;
            }else if(board[i][col] == 'B'){
                b = false;
            }else if(board[i][col] == 'p'){
                b = true;
            }

            if(i == row && b == true){
                count++;
            }
            if(i >= row && board[i][col] == 'B'){
                break;
            }else if(i >= row && board[i][col] == 'p'){
                count++;
                break;
            }
        }
        b = false;
      for (int i = 0; i < 8; i++) {
            if(board[row][i] == '.'){
                continue;
            }else if(board[row][i]=='B'){
                b = false;
            }else if(board[row][i]=='p'){
                b = true;
            }

            if(i == col && b == true){
                count++;
            }
            if(i >= col && board[row][i]=='B'){
                break;
            }else if(i >= col && board[row][i]=='p'){
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
