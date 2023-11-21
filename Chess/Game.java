package Chess;

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Game {
    private Board board;
    private float timeWhite;
    private float timeBlack;
    private Pane layout;

    public Game(){
        Long startTime, split1, endTime;
        layout = new Pane();

        board = new Board();
        
        Rectangle banner = new Rectangle(0, 0, board.getWidth(), 60);
        banner.setFill(Color.LIGHTBLUE);

        StackPane blackPlayer = new StackPane(banner);
        blackPlayer.setLayoutX(board.getInitialX());
        blackPlayer.setLayoutY(board.getInitialY() - 60);

        layout.getChildren().add(blackPlayer);
    }

    public Pane display(){
        layout.getChildren().add(board.display(200, 200, 500, 500));
        return layout;
    }

    public Pane getLayout(){
        return layout;
    }
}
