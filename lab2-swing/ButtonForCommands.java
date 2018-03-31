import javax.swing.JButton;

public class ButtonForCommands {

    public void setEventButtonForCommand(MessageFields fields,Owner owner){
        buttonForCommand.addActionListener(event -> owner.command_to_dogs(fields));
    }

    public void setEventButtonForDogFoods(MessageFields fields,Owner owner){
        buttonForDogFoodPoodle.addActionListener(event -> owner.poodle.ask_for_food(owner,fields));
        buttonForDogFoodTerrier.addActionListener(event -> owner.terrier.ask_for_food(owner,fields));
        buttonForDogFoodSheepDog.addActionListener(event -> owner.sheepdog.ask_for_food(owner,fields));
    }

    public JButton getButtonForCommand() {
        return buttonForCommand;
    }

    public JButton getButtonForDogFoodPoodle() {
        return buttonForDogFoodPoodle;
    }

    public JButton getButtonForDogFoodTerrier() {
        return buttonForDogFoodTerrier;
    }

    public JButton getButtonForDogFoodSheepDog() {
        return buttonForDogFoodSheepDog;
    }

    private JButton buttonForCommand = new JButton("Command");
    private JButton buttonForDogFoodPoodle=new JButton("Ask for food");
    private JButton buttonForDogFoodTerrier=new JButton("Ask for food");
    private JButton buttonForDogFoodSheepDog=new JButton("Ask for food");
}
