
package window;

import owner.Owner;
import javax.swing.JButton;

/**
 * This class describes all buttons in application.
 */
public class ButtonForCommands {

    /**
     * The method sets event for all command to animals.
     * @param fields This is fields for message.
     * @param owner This is owner all animals
     */
    public void setEventButtonForCommand(final MessageFields fields, final Owner owner){
        buttonForCommand.addActionListener(event -> owner.commandToDogs(fields));
    }
    /**
     * The method sets event for walk out dogs.
     * @param fields This is fields for message.
     * @param owner This is owner all animals
     */
    public void setEventButtonForWalkOutDogs(final MessageFields fields, final Owner owner){
        buttonForWalkOutDogs.addActionListener(event -> owner.walkOutDogs(fields));
    }
    /**
     * The method sets event for dog food for dog.
     * @param fields This is fields for message.
     * @param owner This is owner all animals
     */
    public void setEventButtonForDogFoods(final MessageFields fields, final Owner owner){
        buttonForDogFoodPoodle.addActionListener(event -> owner.poodle.askForFood(owner, fields));
        buttonForDogFoodTerrier.addActionListener(event -> owner.terrier.askForFood(owner, fields));
        buttonForDogFoodSheepDog.addActionListener(event -> owner.sheepdog.askForFood(owner, fields));
    }
    /**
     * The method sets event for have poodle.
     * @param fields This is fields for message.
     * @param owner This is owner all animals
     */
    public void setEventButtonForHavePoodle(final MessageFields fields, final Owner owner){
        buttonForHavePoodle.addActionListener(event -> {
                owner.havePoodle(1, "Lui");
                buttonForHavePoodle.setEnabled(false);
                buttonForDogFoodPoodle.setEnabled(true);
                buttonForCommand.setEnabled(true);
                buttonForWalkOutDogs.setEnabled(true);
                fields.setFieldMessagePoodle(" ");

        });
    }
    /**
     * The method sets event for have cat.
     * @param fields This is fields for message.
     * @param owner This is owner all animals
     */
    public void setEventButtonForHaveCat(final MessageFields fields, final Owner owner){
        buttonForHaveCat.addActionListener(event -> {
            owner.haveCat(5,  "Kot");
            buttonForHaveCat.setEnabled(false);
            owner.cat.sleep(fields);
        });
    }
    /**
     * The method sets event for have terrier.
     * @param fields This is fields for message.
     * @param owner This is owner all animals
     */
    public void setEventButtonForHaveTerrier(final MessageFields fields, final Owner owner){
        buttonForHaveTerrier.addActionListener(event -> {
                owner.haveTerrier(2, "Kris");
                buttonForHaveTerrier.setEnabled(false);
                buttonForDogFoodTerrier.setEnabled(true);
                buttonForCommand.setEnabled(true);
                buttonForWalkOutDogs.setEnabled(true);
                fields.setFieldMessageTerrier(" ");

        });
    }
    /**
     * The method sets event for have sheep dog.
     * @param fields This is fields for message.
     * @param owner This is owner all animals
     */
    public void setEventButtonForHaveSheepDog(final MessageFields fields, final Owner owner){
        buttonForHaveSheepDog.addActionListener(event -> {
                owner.haveSheepDog(3, "Tom");
                buttonForHaveSheepDog.setEnabled(false);
                buttonForDogFoodSheepDog.setEnabled(true);
                buttonForCommand.setEnabled(true);
                buttonForWalkOutDogs.setEnabled(true);
                fields.setFieldMessageSheepDog(" ");
        });
    }

    /**
     * The method returns button for all command to animals.
     * @return buttonForCommand.
     */
    public JButton getButtonForCommand() {
        return buttonForCommand;
    }
    /**
     * The method returns button for dog food for poodle.
     * @return buttonForDogFoodPoodle.
     */
    public JButton getButtonForDogFoodPoodle() {
        return buttonForDogFoodPoodle;
    }
    /**
     * The method returns button for dog food for terrier.
     * @return buttonForDogFoodTerrier.
     */
    public JButton getButtonForDogFoodTerrier() {
        return buttonForDogFoodTerrier;
    }
    /**
     * The method returns button for dog food for sheep dog.
     * @return buttonForDogFoodSheepDog.
     */
    public JButton getButtonForDogFoodSheepDog() {
        return buttonForDogFoodSheepDog;
    }
    /**
     * The method returns button for create poodle.
     * @return buttonForHavePoodle.
     */
    public JButton getButtonForHavePoodle() {
        return buttonForHavePoodle;
    }
    /**
     * The method returns button for create terrier.
     * @return buttonForHaveTerrier.
     */
    public JButton getButtonForHaveTerrier() {
        return buttonForHaveTerrier;
    }
    /**
     * The method returns button for create sheep dog.
     * @return buttonForHaveSheepDog.
     */
    public JButton getButtonForHaveSheepDog() {
        return buttonForHaveSheepDog;
    }
    /**
     * The method returns button for create cat.
     * @return buttonForHaveCat.
     */
    public JButton getButtonForHaveCat() {
        return buttonForHaveCat;
    }
    /**
     * The method returns button for walk out all dogs.
     * @return buttonForWalkOutDogs.
     */
    public JButton getButtonForWalkOutDogs() {
        return buttonForWalkOutDogs;
    }
    /**
     * The method creates all button.
     */
    public ButtonForCommands(){
        buttonForCommand = new JButton("Command");
        buttonForCommand.setEnabled(false);

        buttonForDogFoodPoodle= new JButton("Ask for food");
        buttonForDogFoodPoodle.setEnabled(false);
        buttonForDogFoodTerrier= new JButton("Ask for food");
        buttonForDogFoodTerrier.setEnabled(false);
        buttonForDogFoodSheepDog= new JButton("Ask for food");
        buttonForDogFoodSheepDog.setEnabled(false);

        buttonForHavePoodle = new JButton("Have a poodle");
        buttonForHaveTerrier = new JButton("Have a terrier");
        buttonForHaveSheepDog = new JButton("Have a sheep dog");
        buttonForHaveCat = new JButton("Have a cat");

        buttonForWalkOutDogs = new JButton("Walk out dogs");
        buttonForWalkOutDogs.setEnabled(false);
    }

    /**
     * This is button for all command.
     */
    private JButton buttonForCommand;
    /**
     * This is button for have poodle.
     */
    private JButton buttonForHavePoodle;
    /**
     * This is button for have terrier.
     */
    private JButton buttonForHaveTerrier;
    /**
     * This is button for have sheep dog.
     */
    private JButton buttonForHaveSheepDog;
    /**
     * This is button for have cat.
     */
    private JButton buttonForHaveCat;
    /**
     * This is button for walk out all dogs.
     */
    private JButton buttonForWalkOutDogs;
    /**
     * This is button for dog's food poodle.
     */
    private JButton buttonForDogFoodPoodle;
    /**
     * This is button for dog's food terrier.
     */
    private JButton buttonForDogFoodTerrier;
    /**
     * This is button for dog's food sheep dog.
     */
    private JButton buttonForDogFoodSheepDog;
}
