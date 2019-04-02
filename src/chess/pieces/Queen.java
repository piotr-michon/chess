package chess.board;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece {
    private ImageView image;
    private PieceColor color;
    private final Image whiteQueen = new Image("file:resources/white_pieces/white_queen.png");
    private final Image blackQueen = new Image("file:resources/black_pieces/black_queen.png");

    public Queen(PieceColor color) {
        this.color = color;
        if (color == PieceColor.WHITE) {
            image = new ImageView(whiteQueen);
        } else {
            image = new ImageView(blackQueen);
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
            result.add(new Move(-i, -i, MoveKind.ANY, false));
            result.add(new Move(+i, -i, MoveKind.ANY, false));
            result.add(new Move(+i, +i, MoveKind.ANY, false));
            result.add(new Move(-i, +i, MoveKind.ANY, false));
        }
        return result;
    }

    @Override
    public ImageView getImage() {
        return image;
    }
}