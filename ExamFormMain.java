import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.*;
public class ExamFormMain extends Application
{
    private Pane mainPane;
    private Scene mainScene;
    private ExamineeForm examForm;
    private RegistrationForm regisForm;
    public void start(Stage mainStage)
    {
        mainStage.setTitle("Examination Form");
        mainPane = new Pane();
        regisForm = new RegistrationForm();
        regisForm.readApplicants();
//        examForm = new ExamineeForm();
        
        mainScene = new Scene(mainPane,400,600);
        mainStage.setScene(mainScene);
        regisForm.setOnCloseRequest(e->{mainStage.show();});
    }
    
    public static void main(String args[])
    {
        Application.launch(args);
    }
}

