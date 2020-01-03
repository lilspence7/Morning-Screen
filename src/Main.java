import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public Stage stage = new Stage();

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage stage) throws Exception {
        stage = this.stage;
        stage.setTitle("Good Morning");
        Parent root = FXMLLoader.load(getClass().getResource("/Fxml/MorningScreen.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
}
