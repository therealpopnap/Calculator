package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class Controller {
    @FXML
    TextField percentage1;
    @FXML
    TextField percentage2;
    @FXML
    TextField percentage3;

    @FXML
    TextField score1;
    @FXML
    TextField score2;
    @FXML
    TextField score3;


    @FXML
    TextField answer;

    @FXML
    Button calculate;

    @FXML
    ImageView qb;

    @FXML
    ImageView qb2;

    @FXML
    private void sum() {
        double p1,p2,p3,s1,s2,s3;

        if (!percentage1.getText().trim().isEmpty() && numberOrNot(percentage1.getText())) {
            p1 = Double.parseDouble(percentage1.getText());
        }
        else {
            p1=0;
        }

        if (!percentage2.getText().trim().isEmpty() && numberOrNot(percentage2.getText())) {
            p2 = Double.parseDouble(percentage2.getText());
        }
        else {
            p2=0;
        }

        if (!percentage3.getText().trim().isEmpty() && numberOrNot(percentage3.getText())) {
            p3 = Double.parseDouble(percentage3.getText());
        }
        else {
            p3=0;
        }

        if (!score1.getText().trim().isEmpty() && numberOrNot(score1.getText())) {
            s1 = Double.parseDouble(score1.getText());
        }
        else {
            s1=0;
        }

        if (!score2.getText().trim().isEmpty() && numberOrNot(score2.getText())) {
            s2 = Double.parseDouble(score2.getText());
        }
        else {
            s2=0;
        }

        if (!score3.getText().trim().isEmpty() && numberOrNot(score3.getText())) {
            s3 = Double.parseDouble(score3.getText());
        }
        else {
            s3=0;
        }

        double sum=s1*p1/100+s2*p2/100+s3*p3/100;

        double leftover= 100-(p1+p2+p3);
        double goal = 10.1-sum;

        double need = goal*100/leftover;
        String result = String.format("%.2f",need);

        answer.setText("You will need \n" + result);

    }


    boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }


}
