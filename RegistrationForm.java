import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import java.util.*;
import java.io.File;

public class RegistrationForm extends Stage{
    
    private Pane regisPane;
    private Scene regisScene;
    private Label labTitle,labName,labPass;
    private TextField name,password;
    private Button butLogin;
    private ComboBox cmbName;
    private List<User> userLists;

    private HelperFunctions helperFunc = new  HelperFunctions();
    public RegistrationForm()
    {
        regisPane = new Pane();
        regisScene = new Scene(regisPane,400,400);
        this.setTitle("Registration");
        this.setScene(regisScene);
        this.readApplicants();
        
        labTitle = helperFunc.createLabelParam(regisPane,"Registration Page", 30, 20, false);
        labName =  helperFunc.createLabelParam(regisPane,"Name", 30, 80, false);
        labPass =  helperFunc.createLabelParam(regisPane,"Password", 30, 120, false);
        
//        name = helperFunc.createTextFieldParam(regisPane, 150, 80, false);
        password = helperFunc.createTextFieldParam(regisPane, 150, 120, false); 
        butLogin = helperFunc.createButtonParam(regisPane, "Login", 300, 300, false);
        
        cmbName = helperFunc.createComboBox(regisPane,150,80);


        
        this.show();

    }
    
    public void readApplicants()
    {
        userLists = new ArrayList<User>();
        Scanner details, afile;
        String[] lineArray;
        try {
            File file = new File("src/data/applicants.txt");
            afile = new Scanner(file);
            while (afile.hasNextLine()) {
                String line = afile.nextLine(); 
                lineArray = line.split(":");
                userLists.add(new User(Integer.valueOf(lineArray[0]),lineArray[1],lineArray[2]));
                System.out.println(lineArray[1]);
                this.cmbName.getItems().add(lineArray[1]);
            }
//            System.out.println(userLists.get(1).getCountry());
            afile.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND.");
        }
    }
}
