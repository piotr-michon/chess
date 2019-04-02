package chess;

import chess.board.*;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Chessboard extends Application {
    private Board board = new Board();
    private Image boardImg = new Image("file:resources/chess_board.png");
    private int selectedCol = -1;
    private int selectedRow = -1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(boardImg, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setBackground(background);
        for (int i = 0; i < 8; i++) {
            grid.getColumnConstraints().add(new ColumnConstraints(101));
        }
        for (int i = 0; i < 8; i++) {
            grid.getRowConstraints().add(new RowConstraints(101));
        }

        board.initBoard();
        board.drawBoard(grid);

        grid.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
            int col = (int)e.getX() / 101;
            int row = (int)e.getY() / 101;
            doClick(grid, col, row);
        });

        Scene scene = new Scene(grid, 800, 800);

        primaryStage.setTitle("Chess");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void doClick(GridPane grid, int col, int row) {
        System.out.println("1");
        if (selectedCol < 0) {
            System.out.println("2");
            selectedCol = col;
            selectedRow = row;
        } else {
            System.out.println("3");
            board.move(selectedCol, selectedRow, col, row);
            selectedCol = -1;
            selectedRow = -1;
        }
        board.drawBoard(grid);
        board.highlightSelectedPiece(grid, col, row);
        //board.highlightPossibleMoves(grid, col, row);
    }
}