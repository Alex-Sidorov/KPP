
package window;

/**
 * The lab3 swing program implements an application
 *that realizes the interaction of the owner and his dogs and a cat.
 * @author Alex Sidorov
 * @version 1.0
 * @since 2018-04-01
 */

import owner.Owner;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
/**
 * This class creates main window this application.
 */
public class Main{
    /**
     *This method creates frame
     * @param args This is the default parameter
     */
    public static void main(final String[] args) {
        JFrame frame = new JFrame("lab3");

        Owner owner= new Owner();
        JPanel leftPanel= new JPanel();
        JPanel rightPanel= new JPanel();

        MessageFields fields= new MessageFields();
        ButtonForCommands buttonsForCommands = new ButtonForCommands();

        createLeftPanel(owner, leftPanel, buttonsForCommands, fields);
        createRightPanel(owner, rightPanel, buttonsForCommands, fields);

        JPanel centrePanel = new JPanel();
        centrePanel.add(leftPanel);
        centrePanel.add(rightPanel);

        frame.add(centrePanel);

        int width = 270;
        int height = 270;

        frame.pack();
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     *This method creates left panel for frame.
     *@param owner The is owner all animals.
     *@param leftPanel The is left window.
     *@param buttonForCommands The is button for all event.
     *@param fields The is fields for all message.
     */
    private static void createLeftPanel(final Owner owner,
                                        final JPanel leftPanel,
                                        final ButtonForCommands buttonForCommands,
                                        final MessageFields fields){

        JLabel fieldOwner = new JLabel("owner");

        buttonForCommands.setEventButtonForCommand(fields, owner);
        buttonForCommands.setEventButtonForHavePoodle(fields, owner);
        buttonForCommands.setEventButtonForHaveTerrier(fields, owner);
        buttonForCommands.setEventButtonForHaveSheepDog(fields, owner);
        buttonForCommands.setEventButtonForHaveCat(fields, owner);
        buttonForCommands.setEventButtonForWalkOutDogs(fields, owner);

        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        leftPanel.add(fieldOwner);
        leftPanel.add(buttonForCommands.getButtonForHavePoodle());
        leftPanel.add(buttonForCommands.getButtonForHaveTerrier());
        leftPanel.add(buttonForCommands.getButtonForHaveSheepDog());
        leftPanel.add(buttonForCommands.getButtonForHaveCat());
        leftPanel.add(buttonForCommands.getButtonForWalkOutDogs());
        leftPanel.add(buttonForCommands.getButtonForCommand());
        leftPanel.add(fields.getFieldMessageOfDogFood());
    }

    /**
     *This method creates left panel for frame.
     *@param hisOwner The is owner all animals.
     *@param rightPanel The is left window.
     *@param buttonForCommands The is button for all event.
     *@param fields The is fields for all message.
     * */
    private static void createRightPanel(final Owner hisOwner,
                                         final JPanel rightPanel,
                                         final ButtonForCommands buttonForCommands,
                                         final MessageFields fields){

        JLabel poodle = new JLabel("Poodle");
        JLabel terrier = new JLabel("Terrier");
        JLabel sheepDog = new JLabel("Sheepdog");
        JLabel cat = new JLabel("cat");

        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));

        buttonForCommands.setEventButtonForDogFoods(fields, hisOwner);

        rightPanel.add(poodle);
        rightPanel.add(buttonForCommands.getButtonForDogFoodPoodle());
        rightPanel.add(fields.getFieldMessagePoodle());

        rightPanel.add(terrier);
        rightPanel.add(buttonForCommands.getButtonForDogFoodTerrier());
        rightPanel.add(fields.getFieldMessageTerrier());

        rightPanel.add(sheepDog);
        rightPanel.add(buttonForCommands.getButtonForDogFoodSheepDog());
        rightPanel.add(fields.getFieldMessageSheepDog());

        rightPanel.add(cat);
        rightPanel.add(fields.getFieldMessageCat());
    }
}