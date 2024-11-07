package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AjoutClientIHM extends Application {
    @Override
    public void start(Stage primaryStage) {
        TextField numClientField = new TextField();
        TextField nomField = new TextField();
        TextField prenomField = new TextField();
        TextField adresseField = new TextField();
        TextField phoneField = new TextField();
        TextField emailField = new TextField();
        TextField paysField = new TextField();

        Button saveButton = new Button("Enregistrer Client");

        VBox vbox = new VBox(10, new Label("Numéro Client:"), numClientField,
                new Label("Nom:"), nomField,
                new Label("Prénom:"), prenomField,
                new Label("Adresse:"), adresseField,
                new Label("Téléphone:"), phoneField,
                new Label("Email:"), emailField,
                new Label("Pays:"), paysField,
                saveButton);

        saveButton.setOnAction(e -> {
            int numClient = Integer.parseInt(numClientField.getText());
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String adresse = adresseField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();
            String pays = paysField.getText();

            Client client = new Client(numClient, nom, prenom, adresse, phone, email, pays);
            System.out.println("Client créé : " + client);
        });

        Scene scene = new Scene(vbox, 400, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ajouter un Client");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

