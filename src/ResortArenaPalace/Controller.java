package ResortArenaPalace;

import java.awt.Image;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.stage.Stage;

public class Controller {

  @FXML
  private Tab tab_home;

  @FXML
  private Button btn_ckAv;

  @FXML
  private Tab tab_wellness;

  @FXML
  private Tab tab_events;

  @FXML
  private Tab tab_restaurant;

  public void changeScreenRoomAv(ActionEvent actionEvent) throws IOException {
    Parent roomAvailableParent = FXMLLoader.load(getClass().getResource("RoomAvailability.fxml"));
    Scene roomAvScene = new Scene(roomAvailableParent);

    Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
    window.setScene(roomAvScene);
    window.show();
  }
}
