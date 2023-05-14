module com.example.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.veterinaria to javafx.fxml;
    exports com.example.veterinaria;
}