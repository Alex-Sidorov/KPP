import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.*;
/**
 * The lab1 program implements an application
 *that translates a number of decimal to binary.
 * @author Alex Sidorov
 * @version 1.0
 * @since 2018-03-01
 */
public class Main extends Application {
    /**
     * This method is launch the application
     * @param args This is the default parameter
     */
    public static void main(String[] args){
        launch();
    }
    /**
     * This method is creates the main stage
     * @param my_stage the main stage
     */
    @Override
    public void start(Stage my_stage){

        my_stage.setTitle("Lab1");
        my_stage.setResizable(false);

        create_left_box();
        create_right_box();
        create_collective_box();
        create_scene(my_stage);
    }
    /**
     * This method is creates left box for the stage
     */
    private void create_left_box(){
        left_box = new VBox(10);
        Label decimal = new Label("Десятичная");
        input_field = new TextField();
        input_field.setMinWidth(150);
        Button convert_button = new Button("Конвертировать");


        convert_button.setOnAction(event -> {
            try {
                if (!input_field.getText().isEmpty()) {

                    long value = Long.parseLong(input_field.getText());
                    result.setText(Long.toString(value, 2));
                } else
                    result.setText("");
            } catch (NumberFormatException exc) {
                result.setText("");
            }
        });

        left_box.getChildren().addAll(decimal,input_field,convert_button);
    }
    /**
     * This method is creates right box for the stage
     */
    private void create_right_box(){
        right_box = new VBox(10);
        Label binary = new Label("Двоичная");
        result = new Label();
        right_box.getChildren().addAll(binary,result);
    }
    /**
     * This method is creates collective box from
     * the left box and the right box for the stage
     */
    private void create_collective_box(){
        collective_box = new HBox(5);
        collective_box.setPadding(new Insets(10,10,10,10));
        collective_box.getChildren().addAll(left_box,right_box);
    }
    /**
     * This method is creates the main scene
     * @param my_stage This is the the main stage
     */
    private void create_scene(Stage my_stage){
        Scene my_scene = new Scene(collective_box,input_field.getMinWidth()*2, collective_box.getMinHeight());
        my_stage.setScene(my_scene);
        my_stage.show();
    }

    private VBox left_box;
    private TextField input_field;

    private VBox right_box;
    private Label result;

    private HBox collective_box;
}
