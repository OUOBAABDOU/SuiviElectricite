import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import controllers.GestionAppareil;
import models.AppareilElectromenager;

public class MainApp extends Application {
    private GestionAppareil GestionAppareil = new GestionAppareil();

    @Override
    public void start(Stage primaryStage) {
        Label labelNom = new Label("Nom de l'appareil :");
        TextField textNom = new TextField();
        Label labelPuissance = new Label("Puissance (W) :");
        TextField textPuissance = new TextField();
        Label labelTemps = new Label("Temps d'utilisation (h) :");
        TextField textTemps = new TextField();

        Button btnAjouter = new Button("Ajouter Appareil");
        btnAjouter.setOnAction(e -> {
            String nom = textNom.getText();
            int puissance = Integer.parseInt(textPuissance.getText());
            int temps = Integer.parseInt(textTemps.getText());
            GestionAppareil.ajouterAppareil(new AppareilElectromenager(nom, puissance, "Type", temps));
            textNom.clear();
            textPuissance.clear();
            textTemps.clear();
        });

        VBox layout = new VBox(10, labelNom, textNom, labelPuissance, textPuissance, labelTemps, textTemps, btnAjouter);
        Scene scene = new Scene(layout, 300, 300);

        primaryStage.setTitle("Gestion des Appareils");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}