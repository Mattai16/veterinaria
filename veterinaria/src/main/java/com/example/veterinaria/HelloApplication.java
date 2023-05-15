package com.example.veterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear el BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(600, 400);

        // Crear el ToolBar
        ToolBar toolBar = new ToolBar();
        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        toolBar.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        toolBar.getItems().addAll(button1, button2);
        borderPane.setTop(toolBar);
        // Crear una escena con el BorderPane
        Scene scene = new Scene(borderPane);

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(10);


        // Crear los botones del VBox
        Button button1V = new Button("Mascotas");
        button1V.setPrefWidth(90);

        Button button2V = new Button("Veterinarios");
        button2V.setPrefWidth(90);

        Button button3V = new Button("Citas");

        button3V.setPrefWidth(90);
        Button button4V = new Button("Accesiorios");

        button4V.setPrefWidth(90);

        vBox.getChildren().addAll(button1V, button2V, button3V,button4V);

        // Agregar el VBox al BorderPane en la parte izquierda
        borderPane.setLeft(vBox);

        // Configurar la ventana principal
        primaryStage.setTitle("Veterinaria");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}