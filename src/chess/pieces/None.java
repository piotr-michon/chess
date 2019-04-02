package chess.board;

import javafx.scene.image.ImageView;

import java.util.List;

public class None implements Piece {
    @Override
    public ImageView getImage() {
        return null;
    }

    @Override
    public PieceColor getPieceColor() {
        return PieceColor.NONE;
    }

    @Override
    public List<Move> getPossibleMoves() {
        return null;
    }
}
