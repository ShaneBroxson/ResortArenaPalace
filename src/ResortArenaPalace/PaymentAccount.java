package ResortArenaPalace;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//Payment and User Account
public class PaymentAccount {

  @FXML
  private Button btn_GoBackRoomA;

  @FXML
  private Button btn_ReserveRoom;

  @FXML
  private Label lbl_RoomConf;

  @FXML
  void changePayToRoomA(ActionEvent event) throws IOException {
    Parent payParent = FXMLLoader.load(getClass().getResource("RoomAvailability.fxml"));
    Scene payScene = new Scene(payParent);

    Stage payWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    payWindow.setScene(payScene);
    payWindow.show();
  }

  @FXML
  void showConfirmation(ActionEvent event) {
    lbl_RoomConf.setText("Room Booked. Thank You!");
  }

}
