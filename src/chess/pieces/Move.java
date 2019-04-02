package chess.board;

public class Move {
    private int deltaCol;
    private int deltaRow;
    private MoveKind moveKind;
    private boolean moveOver;

    public Move(int deltaCol, int deltaRow, MoveKind moveKind, boolean moveOver) {
        this.deltaCol = deltaCol;
        this.deltaRow = deltaRow;
        this.moveKind = moveKind;
        this.moveOver = moveOver;
    }

    public int getDeltaCol() {
        return deltaCol;
    }

    public int getDeltaRow() {
        return deltaRow;
    }

    public MoveKind getMoveKind() {
        return moveKind;
    }

    public boolean isMoveOver() {
        return moveOver;
    }
}