package chess.board;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Knight implements Piece {
    private ImageView image;
    private PieceColor color;
    private final Image whiteKnight = new Image("file:resources/white_pieces/white_knight.png");
    private final Image blackKnight = new Image("file:resources/black_pieces/black_knight.png");

    public Knight(PieceColor color) {
        this.color = color;
        if (color == PieceColor.WHITE) {
            image = new ImageView(whiteKnight);
        } else {
            image = new ImageView(blackKnight);
        }
    }

    @Override
    public PieceColor getPieceColor() {
        return color;
    }

    @Override
    public List<Move> getPossibleMoves() {
        List<Move> result = new ArrayList<>();
        result.add(new Move(+1, -2, MoveKind.ANY, true));
        result.add(new Move(+2, -1, MoveKind.ANY, true));
        result.add(new Move(+2, +1, MoveKind.ANY, true));
        result.add(new Move(+1, +2, MoveKind.ANY, true));
        result.add(new Move(-1, +2, MoveKind.ANY, true));
        result.add(new Move(-2, +1, MoveKind.ANY, true));
        result.add(new Move(-2, -1, MoveKind.ANY, true));
        result.add(new Move(-1, -2, MoveKind.ANY, true));
        return result;
    }

    @Override
    public ImageView getImage() {
        return image;
    }
}