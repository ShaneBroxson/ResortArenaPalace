package ResortArenaPalace;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RoomAvailability {

  @FXML
  private AnchorPane lbl_RoomAv;

  @FXML
  private Button btn_GoHomeRA;

  @FXML
  private AnchorPane room1;

  @FXML
  private Button btn_Select1rm;

  @FXML
  void changeR1toPay(ActionEvent event) throws IOException {
    Parent paymentAccountParent = FXMLLoader.load(getClass().getResource("PaymentAccount.fxml"));
    Scene roomAvScene = new Scene(paymentAccountParent);

    Stage payWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    payWindow.setScene(roomAvScene);
    payWindow.show();
  }

  @FXML
  void changeRAToHome(ActionEvent event) throws IOException {
    Parent roomAvHParent = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
    Scene homePScene = new Scene(roomAvHParent);

    Stage homePWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
    homePWindow.setScene(homePScene);
    homePWindow.show();
  }

}
