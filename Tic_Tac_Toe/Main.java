package Tic_Tac_Toe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        char[][] board = new char[3][3];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = ' ';
            }
        }
        int draw  = 9;
        boolean gameOver = false;
        loop :
        while (!gameOver){
            print(board);
            System.out.println("Player " + player + "enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(board[row][col]  == ' '){
                board[row][col] = player;
                draw--;
                gameOver = haveWon(board,player);
                if(gameOver){
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    print(board);
                    System.out.println("player " + player + " is won");
                    break;
                }else{
                    player = player=='X' ? 'O' : 'X';
                }
            }else{
                System.out.println("Invalid Move Try again!");
                continue loop;
            }
//            print(board);
            if(draw <= 0){
                System.out.println("Draw! Play one more");
                break ;
            }
        }



    }

    private static boolean haveWon(char[][] board, char player) {
        for(int i=0; i<3; i++){
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player)return true;
        }

        for(int i=0; i<3; i++){
            if(board[0][i] == player && board[1][i] == player && board[2][i] == player)return true;
        }

        if(board[0][0] ==player &&  board[1][1] == player && board[2][2] == player)return true;
        if(board[0][2] ==player &&  board[1][1] == player && board[2][0] == player)return true;
        return false;
    }

    static void print(char[][] board){
//        System.out.println("---------");
        for(int i=0; i<board.length; i++){
//            System.out.println();
            System.out.print( "|");
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " |");
            }
            System.out.println();
//            System.out.print("---------");
        }
        System.out.println();
    }
}
