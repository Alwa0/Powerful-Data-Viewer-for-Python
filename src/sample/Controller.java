package sample ;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;

public class Controller {

    //--------------inputs-----------------
    @FXML
    private TextField csv, python;

    @FXML
    void pressButton() throws IOException {
        Stage stage1 = new Stage();
        stage1.setTitle("Test");
        final Group rootGroup = new Group();
        String py;

        if (python.getText().equals(""))
            py = "python";
        else py = python.getText();

        Process p = Runtime.getRuntime().exec(py + " take_data.py " + csv.getText());
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = in.readLine();
        int v = 25;
        while(line != null){
            Text text = new Text(25, v, line);
            rootGroup.getChildren().add(text);
            line = in.readLine();
            v = v + 25;
        }

        ScrollPane sp = new ScrollPane();
        sp.setContent(rootGroup);
        Scene scene = new Scene(sp, 1500, 1500);
        stage1.setScene(scene);


        stage1.show();
    }
}
