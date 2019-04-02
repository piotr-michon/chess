package chess.board;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class King implements Piece {
    private ImageView image;
    private PieceColor color;
    private final Image whiteKing = new Image("file:resources/white_pieces/white_king.png");
    private final Image blackKing = new Image("file:resources/black_pieces/black_king.png");

    public King(PieceColor color) {
        this.color = color;
        if (color == PieceColor.WHITE) {
            image = new ImageView(whiteKing);
        } else {
            image = new ImageView(blackKing);
        }
    }

    @Override
    public PieceColor getPieceColor() {
        return color;
    }

    @Override
    public List<Move> getPossibleMoves() {
        List<Move> result = new ArrayList<>();
        result.add(new Move(0, -1, MoveKind.ANY, false));
        result.add(new Move(-1, -1, MoveKind.ANY, false));
        result.add(new Move(+1, -1, MoveKind.ANY, false));
        result.add(new Move(+1, 0, MoveKind.ANY, false));
        result.add(new Move(+1, +1, MoveKind.ANY, false));
        result.add(new Move(0, +1, MoveKind.ANY, false));
        result.add(new Move(-1, +1, MoveKind.ANY, false));
        result.add(new Move(-1, 0, MoveKind.ANY, false));
        return result;
    }

    @Override
    public ImageView getImage() {
        return image;
    }
}