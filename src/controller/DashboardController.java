package controller;

import maquette.utils.NavigationUtility;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class DashboardController {

    @FXML
    private AnchorPane contentArea;


    @FXML
    public void initialize() {
        NavigationUtility.loadContent("/view/LieuxView.fxml", contentArea);
    }


    @FXML
    private void showLieuxPage() {
        NavigationUtility.loadContent("/view/LieuxView.fxml", contentArea);
    }

    @FXML
    private void showSpectaclesPage() {
        NavigationUtility.loadContent("/view/SpectaclesView.fxml", contentArea);
    }

    @FXML
    private void showArtistsPage() {
        NavigationUtility.loadContent("/view/LieuxView.fxml", contentArea);
    }

    @FXML
    private void showRubriquesPage() {
        NavigationUtility.loadContent("/view/LieuxView.fxml", contentArea);
    }

    @FXML
    private void showBilletsPage() {
        NavigationUtility.loadContent("/view/LieuxView.fxml", contentArea);
    }
}
