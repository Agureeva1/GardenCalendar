module com.example.cardencalendar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.example.cardencalendar to javafx.fxml;
    exports com.example.cardencalendar;
    exports DELMaybe;
    opens DELMaybe to javafx.fxml;
}