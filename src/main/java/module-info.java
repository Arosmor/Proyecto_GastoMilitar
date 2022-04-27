module es.amosrosado.gastomilitarcsv {
    requires javafx.controls;
    exports es.amosrosado.gastomilitarcsv;
    requires java.xml.bind;
    requires jakarta.activation;
    requires java.activation;
    opens es.amosrosado.gastomilitarcsv to java.xml.bind;
}
