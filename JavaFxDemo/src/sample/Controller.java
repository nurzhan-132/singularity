package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextArea questionArea;

    @FXML
    private RadioButton answer1, answer2, answer3, answer4;

    @FXML
    private ToggleGroup answers;

    private String[] questions = {
            "Ваш любимый фрукт?",
            "Ваш любимый футболист?",
            "Кто открыл Америку?",
            "USSR collapsed in"
    };

    private String[][] variants = {
            {"Банан", "Киви", "Апельсин", "Мандарин"},
            {"Messi", "Penaldo", "Maradona", "Cruyff"},
            {"Веспугчи", "Колумб", "Я", "Он"},
            {"1945", "1917", "1991", "1979"},
    };

    private String[] correctVariants = {
            "Апельсин",
            "Penaldo",
            "Колумб",
            "1991"
    };

    private String[] userSelections = new String[questions.length];
    private int currIndex = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadQuestion(currIndex);
    }

    private void loadQuestion(int index) {
        questionArea.setText(questions[index]);
        answer1.setText(variants[index][0]);
        answer2.setText(variants[index][1]);
        answer3.setText(variants[index][2]);
        answer4.setText(variants[index][3]);
        answers.selectToggle(null);

        // keep user selection
        if (userSelections[index] != null) {
            for (Toggle toggle : answers.getToggles()) {
                RadioButton radioButton = (RadioButton) toggle;
                if (radioButton.getText().equals(userSelections[index])) {
                    answers.selectToggle(radioButton);
                    break;
                }
            }
        }
    }

    private void saveCurrentSelection() {
        RadioButton selectedRadioButton = (RadioButton) answers.getSelectedToggle();
        if (selectedRadioButton != null) {
            userSelections[currIndex] = selectedRadioButton.getText();
        }
    }

    public void tryToAnswer() {
        saveCurrentSelection();
        if (userSelections[currIndex] != null && userSelections[currIndex].equals(correctVariants[currIndex])) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Правильно!");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Не правильно!");
            alert.showAndWait();
        }
    }

    @FXML
    public void goToNext() {
        saveCurrentSelection();
        if (currIndex < questions.length - 1) {
            currIndex++;
            loadQuestion(currIndex);
        }
    }

    @FXML
    public void goToPrev() {
        saveCurrentSelection();
        if (currIndex > 0) {
            currIndex--;
            loadQuestion(currIndex);
        }
    }
}