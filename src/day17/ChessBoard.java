package day17;

public class ChessBoard {
    private ChessPiece[][] arr;

    public ChessBoard(ChessPiece[][] arr) {
        this.arr = arr;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j].getName());
            }
            System.out.println();
        }
    }
}
