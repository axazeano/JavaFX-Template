import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;


public class MainApp extends Application {
	private Controller controller;
	private Stage primaryStage;
	private AnchorPane rootLayout;
	private static String fxmlPath = "ui.fxml";

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Load a FXML file
		this.primaryStage  = primaryStage;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainApp.class.getResource(fxmlPath));
		this.rootLayout = (AnchorPane) loader.load();

		Scene scene = new Scene(this.rootLayout);
		this.primaryStage.setScene(scene);
		controller = loader.getController();
		controller.setMainApp(this);
		primaryStage.show();
	}
}
