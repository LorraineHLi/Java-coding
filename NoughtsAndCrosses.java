public class NoughtsAndCrosses {
    int[][] board;
    int won;

    public NoughtsAndCrosses(int[][] board) {
        this.board = board;
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                won = board[i][1];
                return false;
            }
            else if (board[0][i] != 0 && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                won = board[1][i];
                return false;
            }
        }
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            won = board[1][1];
            return false;
        }
        else if (board[0][2] != 0 && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            won = board[1][1];
            return false;
        }
        return true;
    }

    public int whoWon() {
        if (isDraw()) return 0;
        else return won;
    }

}
