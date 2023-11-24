import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(MyGame.class, args);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mon Jeu");

        StackPane root = new StackPane();
        Button button = new Button("Cliquez-moi !");
        root.getChildren().add(button);

        button.setOnAction(e -> {
            System.out.println("Bouton cliqué !");
            // Ajoutez ici la logique de jeu en réponse au clic
        });

        primaryStage.setScene(new Scene(root, 300, 250));

        primaryStage.show();
    }
}
