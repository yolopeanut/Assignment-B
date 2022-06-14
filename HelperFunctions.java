
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;


public class HelperFunctions {
    
    public Label createLabelParam(Pane pane, String text, int x, int y, boolean disable)
    {
        Label label = new Label(text);
        label.setLayoutX(x);
        label.setLayoutY(y);
        label.setDisable(disable);
        pane.getChildren().add(label);
        return label;
    }
    public TextField createTextFieldParam(Pane pane, int x, int y, boolean disable)
    {
        TextField field = new TextField();
        field.setLayoutX(x);
        field.setLayoutY(y);
        field.setDisable(disable);
        pane.getChildren().add(field);
        return field;
    }
    
    public Button createButtonParam(Pane pane, String text, int x, int y, boolean disable)
    {
        Button button = new Button(text);
        button.setLayoutX(x);
        button.setLayoutY(y);
        button.setDisable(disable);
        pane.getChildren().add(button);
        return button;
    }
    
    public Tab createTabParam(TabPane tbPane, Pane content, String text)
    {
        Tab tab = new Tab();
        tab.setText(text);
        tab.setContent(content);
        tbPane.getTabs().add(tab);
        return tab;
    }
    
    public ComboBox createComboBox(Pane pane, int x, int y)
    {
        ComboBox cmbName = new ComboBox();
        cmbName.setLayoutX(x);
        cmbName.setLayoutY(y);
        pane.getChildren().add(cmbName);
        return cmbName;
        
    }
}
