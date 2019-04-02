package chess.board;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {
    private ImageView image;
    private PieceColor color;
    private final Image whitePawn = new Image("file:resources/white_pieces/white_pawn.png");
    private final Image blackPawn = new Image("file:resources/black_pieces/black_pawn.png");

    public Pawn(PieceColor color) {
        this.color = color;
        if (color == PieceColor.WHITE) {
            image = new ImageView(whitePawn);
        } else {
            image = new ImageView(blackPawn);
        }
    }

    @Override
    public PieceColor getPieceColor() {
        return color;
    }

    @Override
    public List<Move> getPossibleMoves() {
        List<Move> result = new ArrayList<>();
        if (color == PieceColor.WHITE) {
            result.add(new Move(0, -1, MoveKind.NO_CAPTURE, false));
            result.add(new Move(-1, -1, MoveKind.CAPTURE, false));
            result.add(new Move(1, -1, MoveKind.CAPTURE, false));
        } else {
            result.add(new Move(0, +1, MoveKind.NO_CAPTURE, false));
            result.add(new Move(+1, +1, MoveKind.CAPTURE, false));
            result.add(new Move(+1, +1, MoveKind.CAPTURE, false));
        }
        return result;
    }

    @Override
    public ImageView getImage() {
        return image;
    }
}