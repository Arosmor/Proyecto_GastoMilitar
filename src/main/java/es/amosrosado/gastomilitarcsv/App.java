package es.amosrosado.gastomilitarcsv;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        ArrayList<String> lista = new ArrayList();
        lista.add("Nombre Pais");
        lista.add("Codigo");
        lista.add("Año");
        lista.add("Gasto");
        
//        GastoMilitar gastoMilitar1 = new GastoMilitar();
//        gastoMilitar1.setNombrePais("España");
//        root.getChildren().add(FicheroGastoMilitar);
        
        // Crear un ComboBox con el contenido de la lista
        ComboBox<String> comboBox = new ComboBox(FXCollections.observableList(lista));
        root.getChildren().add(comboBox);

        // Añadir un label en el que se mostrará el elemento seleccionado
        Label labelSeleccion = new Label();
        root.getChildren().add(labelSeleccion);

        // Cuando el usuario seleccione algo del ComboBox, se mostrará en el Label
        comboBox.setOnAction((t) -> {
            labelSeleccion.setText(comboBox.getValue());
            
        
            
        });

    }

    public static void main(String[] args) {
        launch();
    }

}