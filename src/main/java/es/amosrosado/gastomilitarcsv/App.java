package es.amosrosado.gastomilitarcsv;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class App extends Application {

    
    int maximo = Integer.MIN_VALUE;
    @Override
    public void start(Stage stage) {
        HBox root = new HBox(10);
        root.setAlignment(Pos.CENTER);
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
        HBox.getChildren.add();
        
        UtilCSV ficheroGastoMilitar = new UtilCSV();
        UtilCSV.leerDatos(stage);
        
        ArrayList<String> lista = new ArrayList();
//        lista.add(UtilCSV.leerDatos(stage);
//        lista.add("Codigo");
//        lista.add("Año");
//        lista.add("Gasto");
        
//        GastoMilitar gastoMilitar1 = new GastoMilitar();
//        gastoMilitar1.setNombrePais("España");
//        root.getChildren().add(Fichero);

        
        // Crear un ComboBox con el contenido de la lista
        ComboBox<String> comboBox = new ComboBox(FXCollections.observableList(lista));
        root.getChildren().add(comboBox);
        
        // Añadir un label en el que se mostrará el elemento seleccionado
        Label labelSeleccionPais = new Label();
        root.getChildren().add(labelSeleccionPais);

        // Cuando el usuario seleccione algo del ComboBox, se mostrará en el Label
        comboBox.setOnAction((t) -> {
        labelSeleccionPais.setText(comboBox.getValue());
        });
        
        // Seleccionar y hacer la media del gasto militar
        CheckBox cb = new CheckBox("Media Gasto Militar");
        root.getChildren().add(cb);
        Label labelMedia = new Label();
        root.getChildren().add(labelMedia);
        cb.setOnAction((t) -> {
            if(cb.isSelected()) {
                labelMedia.setText("La media es: ");
                System.out.println("La media es: ");
            } else {
                System.out.println("No está seleccionado");                
            }
        });
        
          // Calcular el valor maximo
//        TextField textField = new TextField();
//        Button button = new Button("Aceptar");
//        Label label = new Label();
//        root.getChildren().addAll(textField, button, label);
//
//        button.setOnAction((t) -> {
//            int valor = Integer.valueOf(textField.getText());
//            if(valor > maximo) {
//                maximo = valor;
//                label.setText(String.valueOf(valor));
//            }            
//        });
    }

    public static void main(String[] args) {
        launch();
    }

}