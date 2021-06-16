package MasterMind.MasterMind;

import java.io.IOException;

import MasterMind.GameRunner.GameRunner;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
    private static Stage stage;

    @Override
    public void start(@SuppressWarnings("exports") Stage s) throws IOException {
        stage=s;
        setRoot("primary","");
    }

    static void setRoot(String fxml) throws IOException {
        setRoot(fxml,stage.getTitle());
    }

    static void setRoot(String fxml, String title) throws IOException {
       	stage.setTitle("Master Mind");
		stage.setResizable(false);
		stage.show();
        new GameRunner(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
