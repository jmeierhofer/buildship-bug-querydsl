package library.commons;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class CommonsLibClient {
    // eclipse showed some errors when not using e(fx)clipse
    private BorderPane parent = new BorderPane();
    private Button cancelButton = new Button("translation");
    
    public CommonsLibClient() {
        parent.getChildren().add(cancelButton);
    }
}
