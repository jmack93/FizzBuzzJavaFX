
package fizzbuzzgui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author John R. McKahan II
 */

public class MainprogramController implements Initializable {

    @FXML
    private TextField numberField;
    @FXML
    private Button goButton;
    @FXML
    private TextField resultField;

    
    
    
    public void FizzBuzz () {
        int selectedNumber = 0;
        selectedNumber = Integer.valueOf(numberField.getText());
     //   System.out.print(selectedNumber);
     if (selectedNumber % 15 == 0)
         resultField.setText("FizzBuzz");
        else if (selectedNumber % 3 == 0)
            resultField.setText("Fizz");
        else if (selectedNumber % 5 == 0)
            resultField.setText("Buzz");
        else resultField.setText(String.valueOf(selectedNumber));
     
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
