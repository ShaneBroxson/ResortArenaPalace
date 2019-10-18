package ResortArenaPalace;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//Payment and User Account
public class PaymentAccount {

    // back button trial 1

    /*@FXML
    void changePaytoRA(ActionEvent event) throws IOException {
        Parent roomAvailabilityParent = FXMLLoader.load(getClass().getResource("RoomAvailability.fxml"));
        Scene roomAv = new Scene(roomAvailabilityParent);

        Stage returnRA = (Stage) ((Node) event.getSource()).getScene().getWindow();
        returnRA.setScene(roomAv);
        returnRA.show();
    }*/


  @FXML
  private Button btn_GoBackRoomA;

  @FXML
  void changePayToRoomA(ActionEvent event) throws IOException {
    Parent payParent = FXMLLoader.load(getClass().getResource("RoomAvailability.fxml"));
    Scene payScene = new Scene(payParent);

    Stage payWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    payWindow.setScene(payScene);
    payWindow.show();
  }



}
