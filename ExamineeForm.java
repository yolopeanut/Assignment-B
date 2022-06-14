import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
public class ExamineeForm extends Stage
{
    private Label pageLabel;
    private Button butAnalysis,butAnalysis2,butAnalysis1;
    private Pane examFormPane;
    private Scene examFormScene;
    private HelperFunctions helpFunc = new HelperFunctions();
    private TabPane tbPane;
    private Tab analysis, result;
    public ExamineeForm()
    {
        tbPane = new TabPane();
        examFormPane = new Pane();
        examFormScene = new Scene(tbPane,400,600);

        this.setTitle("Registration Form");
        this.setOnCloseRequest(e->{
            this.hide();
        });
        
        butAnalysis = helpFunc.createButtonParam(examFormPane,"Analysis1", 50, 50, true);
        butAnalysis1 = helpFunc.createButtonParam(examFormPane,"Analysis2", 300, 50, true);
        butAnalysis2 = helpFunc.createButtonParam(examFormPane,"Analysis3", 250, 100, true);



        result = helpFunc.createTabParam(tbPane, examFormPane, "Result");
        analysis = helpFunc.createTabParam(tbPane, examFormPane, "Analysis");
        
        
        
        this.setScene(examFormScene);
        

        
        
        this.show();
    }
    
    
}

