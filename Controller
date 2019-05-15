package garden_planner.gui;

        import garden_planner.model.GardenPlanner;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.TextArea;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.Pane;

        import java.io.IOException;

public class Controller {

    private GardenPlanner planner;
    private Pane gardenid;
    @FXML private TextField Widthfield;
    @FXML private TextField wallLengthfield;
    @FXML private TextField areafield;
    @FXML private TextArea textarea;
    @FXML private TextField totalcostfield;
    public void Widthfield(ActionEvent e){
        double width = (3);
        String str = Double.toString(width);
        Widthfield.setText(str);

    }


    public void AddRectangle(ActionEvent event){
    }

    public void AddCircle(ActionEvent event){

    }

    @FXML
    public void totalarea(ActionEvent event){
        double area = planner.getTotalGardenArea();
        String str =Double.toString(area);
        areafield.setText(str);

    }
    @FXML
    public void tortalcost(ActionEvent event){

    }

    public void showgarden(ActionEvent event) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("garden_gui.fxml"));
        //Scene scene = new Scene(root);
        //  Stage window = (Stage)((Node) event.getSource()).
        // window.setScene(scene);
        //  window.show();
        // pane.setCenter(pane);
    }
    @FXML
    public void lengthcost(ActionEvent event){

    }
    @FXML
    public void areacost(ActionEvent event){

    }
    @FXML
    private TextField lengthfield;
    public void lengthfield (ActionEvent e){
        double width = (3);
        String str = Double.toString(width);
        lengthfield.setText(str);
    }



    @FXML
    public void displayproperties (ActionEvent e){
        wallLengthfield("30.85 m");
        //areafield("13.42 m2");



    }

    private void wallLengthfield(String msg) {
        this.wallLengthfield.appendText(msg);


    }
   // private void areafield(String msg2){
    //    this.areafield.appendText(msg2);
    }
