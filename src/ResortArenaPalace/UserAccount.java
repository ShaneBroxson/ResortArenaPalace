package ResortArenaPalace;
/*Controller for the UserAccount.fxml file
Scene where the Guest and the user can fill their credentials to access their accounts*/
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class UserAccount {

  @FXML
  private GridPane UsAccountPane;

  @FXML
  private Label lbl_uType;

  @FXML
  private ComboBox<String> cBox_UType;


  @FXML
  private Label lbl_UName;

  @FXML
  private Label lbl_Password;

  @FXML
  private PasswordField pField_Password;

  @FXML
  private TextField txtFld_UName;

  @FXML
  private Label lbl_UAccount;

  @FXML
  private Button btn_SignInUAccount;

  private ObservableList<String> UType = FXCollections.observableArrayList("Guest", "Manager");

  //method to populate the User Type comboBox
  public void initialize(){
    cBox_UType.setItems(UType);//sets the items in the ComboBox
    cBox_UType.setEditable(true);//Allows the user edit
    cBox_UType.getSelectionModel().selectFirst();//Sets a default value in the ComboBox
  }

}