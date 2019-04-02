package chess.board;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Bishop implements Piece {
    private ImageView image;
    private PieceColor color;
    private final Image whiteBishop = new Image("file:resources/white_pieces/white_bishop.png");
    private final Image blackBishop = new Image("file:resources/black_pieces/black_bishop.png");

    public Bishop(PieceColor color) {
        this.color = color;
        if (color == PieceColor.WHITE) {
            image = new ImageView(whiteBishop);
        } else {
            image = new ImageView(blackBishop);
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