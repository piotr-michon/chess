package chess.board;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Rook implements Piece {
    private ImageView image;
    private PieceColor color;
    private final Image whiteRook = new Image("file:resources/white_pieces/white_rook.png");
    private final Image blackRook = new Image("file:resources/black_pieces/black_rook.png");

    public Rook(PieceColor color) {
        this.color = color;
        if (color == PieceColor.WHITE) {
            image = new ImageView(whiteRook);
        } else {
            image = new ImageView(blackRook);
        }
    }

    @Override
    public PieceColor getPieceColor() {
        return color;
    }

    @Override
    public List<Move> getPossibleMoves() {
        List<Move> result = new ArrayList<>();
        for (int i = 1; i < 8; i++) {
            result.add(new Move(0, -i, MoveKind.ANY, false));
            result.add(new Move(0, +i, MoveKind.ANY, false));
            result.add(new Move(-i, 0, MoveKind.ANY, false));
            result.add(new Move(+i, 0, MoveKind.ANY, false));
        }
        return result;
    }

    @Override
    public ImageView getImage() {
        return image;
    }
}