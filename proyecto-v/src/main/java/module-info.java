module com.example.proyectov {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectov to javafx.fxml;
    exports com.example.proyectov;
}