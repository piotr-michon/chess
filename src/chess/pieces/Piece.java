package chess.board;

import javafx.scene.image.ImageView;

import java.util.List;

public interface Piece {
    ImageView getImage();
    PieceColor getPieceColor();
    List<Move> getPossibleMoves();
}