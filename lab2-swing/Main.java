import javax.swing.*;

/**
 * The lab2 swing program implements an application
  *that realizes the interaction of the owner and his dogs
 * @author Alex Sidorov
 * @version 1.0
 * @since 2018-04-01
 */

public class Main{
    /**
     *This method is create frame
     * @param args This is the default parameter
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("lab2");

        Owner owner=new Owner();
        JPanel left_panel=new JPanel();
        JPanel right_panel=new JPanel();

        MessageFields fields=new MessageFields();
        ButtonForCommands buttonsForCommands = new ButtonForCommands();

        create_left_panel(owner,left_panel,buttonsForCommands,fields);
        create_right_panel(owner,right_panel,buttonsForCommands,fields);

        JPanel centre_panel = new JPanel();
        centre_panel.add(left_panel);
        centre_panel.add(right_panel);

        frame.add(centre_panel);

        frame.pack();
        frame.setSize(270,240);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *This method is create left panel for frame
     */
    private static void create_left_panel(Owner owner,
                                          JPanel left_panel,
                                          ButtonForCommands buttonForCommands,
                                          MessageFields fields){

        JLabel field_owner = new JLabel("Owner");

        buttonForCommands.setEventButtonForCommand(fields,owner);

        left_panel.setLayout(new BoxLayout(left_panel,BoxLayout.Y_AXIS));

        left_panel.add(field_owner);
        left_panel.add(buttonForCommands.getButtonForCommand());
        left_panel.add(fields.getFieldMessageOfDogFood());
    }

    /**
     *This method is create right panel for frame
     */
    private static void create_right_panel(Owner his_owner,
                                           JPanel right_panel,
                                           ButtonForCommands buttonForCommands,
                                           MessageFields fields){

        JLabel poodle = new JLabel("Poodle");
        JLabel terrier = new JLabel("Terrier");
        JLabel sheep_dog = new JLabel("Sheepdog");

        right_panel.setLayout(new BoxLayout(right_panel,BoxLayout.Y_AXIS));

        buttonForCommands.setEventButtonForDogFoods(fields,his_owner);

        right_panel.add(poodle);
        right_panel.add(buttonForCommands.getButtonForDogFoodPoodle());
        right_panel.add(fields.getFieldMessagePoodle());

        right_panel.add(terrier);
        right_panel.add(buttonForCommands.getButtonForDogFoodTerrier());
        right_panel.add(fields.getFieldMessageTerrier());

        right_panel.add(sheep_dog);
        right_panel.add(buttonForCommands.getButtonForDogFoodSheepDog());
        right_panel.add(fields.getFieldMessageSheepDog());
    }
}