/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.StudyManager;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import model.Studies;
import controller.StudyManager;
import static java.util.Objects.isNull;
import javafx.scene.control.TextField;

/**
 *
 * @author lina7
 */
public class MainViewController {

    String SubCategory;
    String Disease;
    String DB;
    @FXML
    private MenuButton Mbutton2;
    @FXML
    private MenuItem cat2Sbutton1;
    @FXML
    private MenuItem cat2Sbutton2;
    @FXML
    private MenuItem cat2Sbutton3;
    @FXML
    private MenuItem cat2Sbutton4;
    @FXML
    private MenuItem cat2Sbutton5;
    @FXML
    private MenuButton Mbutton3;
    @FXML
    private MenuItem cat3Sbutton1;
    @FXML
    private MenuItem cat3Sbutton2;
    @FXML
    private MenuButton Mbutton4;
    @FXML
    private MenuItem cat4Sbutton1;
    @FXML
    private MenuItem cat4Sbutton2;
    @FXML
    private MenuItem cat4Sbutton3;
    @FXML
    private MenuButton Mbutton5;
    @FXML
    private MenuItem cat5Sbutton1;
    @FXML
    private MenuItem cat5Sbutton2;
    @FXML
    private MenuItem cat5Sbutton3;
    @FXML
    private MenuItem cat5Sbutton4;
    @FXML
    private MenuItem cat5Sbutton5;
    @FXML
    private MenuItem CancerButton;
    @FXML
    private MenuItem pubmedButton;

    @FXML
    private TextArea resultArea;

    @FXML
    private MenuButton DiseaseButton;
    @FXML
    private MenuButton DBbutton;
    @FXML
    private Button buttonok;
    @FXML
    private MenuButton Mbutton1;
    @FXML
    private MenuItem cat1Sbutton1;
    @FXML
    private MenuItem cat1Sbutton2;
    @FXML
    private MenuItem cat1Sbutton3;
    @FXML
    private MenuItem cat1Sbutton4;
    @FXML
    private MenuItem cat1Sbutton5;
    @FXML
    private MenuItem COVID19Button;
    @FXML
    private MenuItem bienvieillirbutton;
    @FXML
    private TextField ScatArea;
    @FXML
    private TextField DiseaseArea;
    @FXML
    private TextField DBArea;

    @FXML
    private void handleOkbutton(ActionEvent event) {

        if (isNull(SubCategory) || isNull(Disease) || isNull(DB)) {
            if (isNull(SubCategory)) {
                System.out.print("you should choose sub category");
                resultArea.setText("Please choose sub category");
            } else if (isNull(Disease)) {
                System.out.print("you should choose disease");
                resultArea.setText("Please choose disease");
            } else {
                System.out.print("you should choose DB");
                resultArea.setText("Please choose DB");
            }
        }      

    
        else {
            ArrayList<String> searchresult = StudyManager.get(SubCategory, Disease, DB);
        System.out.println("OK clicked " + SubCategory + Disease + DB);
        System.out.println("and then we get " + searchresult);
        resultArea.setText(" ");
        for (String linesearchresult : searchresult) {
            resultArea.appendText(linesearchresult + "\n");
        }
    }
}

@FXML
        private void handlepubmedbutton(ActionEvent event) {
        DB = "pubmed";
        System.out.println("you chose " + DB);
        DBArea.setText(DB);
    }

    @FXML
        private void handleCovid19button(ActionEvent event) {
        Disease = "COVID19";
        System.out.println("you chose " + Disease);
        DiseaseArea.setText(Disease);
    }

    @FXML
        private void handleCancerbutton(ActionEvent event) {
        Disease = "Cancer";
        System.out.println("you chose " + Disease);
        DiseaseArea.setText(Disease);
    }

    @FXML
        private void handlebienvieillirbutton(ActionEvent event) {
        Disease = "bienvieillir";
        System.out.println("you chose " + Disease);
        DiseaseArea.setText(Disease);
    }
//store subcategory name in variable "SubCategory"

    @FXML
        private void handlecat1Sbutton1(ActionEvent event) {
        SubCategory = "ArtTherapies";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory );
    }

    @FXML
        private void handlecat1Sbutton2(ActionEvent event) {
        SubCategory = "Healtheducationprograms";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat1Sbutton3(ActionEvent event) {
        SubCategory = "Psychotherapies";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat1Sbutton4(ActionEvent event) {
        SubCategory = "Psychocorporalpractices";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat1Sbutton5(ActionEvent event) {
        SubCategory = "Animalassistedtherapies";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat2Sbutton1(ActionEvent event) {
        SubCategory = "Physicalactoprograms";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText("you chose " + SubCategory + "\n");
    }

    @FXML
        private void handlecat2Sbutton2(ActionEvent event) {
        SubCategory = "Hortitherapies";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat2Sbutton3(ActionEvent event) {
        SubCategory = "Physiotherapies";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat2Sbutton4(ActionEvent event) {
        SubCategory = "Mauemllestherapies";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat2Sbutton5(ActionEvent event) {
        SubCategory = "Programsbalneological";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat3Sbutton1(ActionEvent event) {
        SubCategory = "Foodsupplements";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat3Sbutton2(ActionEvent event) {
        SubCategory = "Nutritionalprograms";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat4Sbutton1(ActionEvent event) {
        SubCategory = "m-Health";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat4Sbutton2(ActionEvent event) {
        SubCategory = "Videogametherapy";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat4Sbutton3(ActionEvent event) {
        SubCategory = "Virtualrealitytherapies";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat5Sbutton1(ActionEvent event) {
        SubCategory = "Preparations";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat5Sbutton2(ActionEvent event) {
        SubCategory = "Mycologicalpreparations";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat5Sbutton3(ActionEvent event) {
        SubCategory = "botanicalpreparations";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat5Sbutton4(ActionEvent event) {
        SubCategory = "Electromagneticmethods";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

    @FXML
        private void handlecat5Sbutton5(ActionEvent event) {
        SubCategory = "Cosmeceuticals";
        System.out.println("you chose " + SubCategory + "\n");
        ScatArea.setText(SubCategory);
    }

}
