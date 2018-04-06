
package abstractdog;

import abstractpet.AbstractPet;
import owner.Owner;
import window.MessageFields;

/**
 * This class describes an abstract dog.
 */
public class AbstractDog extends AbstractPet{
    /**
     *This method prints message of execute command.
     * @param fields this is fields for dog's messages.
     */
    private void executeCommand(final MessageFields fields){

        if(!fields.getFieldMessagePoodle().getText().equals("not dog"))
            fields.setFieldMessagePoodle("Played the team.");

        if(!fields.getFieldMessageTerrier().getText().equals("not dog"))
            fields.setFieldMessageTerrier("Played the team.");

        if(!fields.getFieldMessageSheepDog().getText().equals("not dog"))
            fields.setFieldMessageSheepDog("Played the team.");

        fields.setFieldMessageOfDogFood(" ");
    }
    /**
     *This method calls executeCommand.
     *@param fields this is fields for review dog's commands.
     */
    public void acceptCommand(final MessageFields fields){
        executeCommand(fields);
    }
    /**
     *This method prints message of dog's food.
     *@param hisOwner hisOwner is dogs's owner.
     *@param fields this is fields for review dog's commands.
     */
    public void askForFood(final Owner hisOwner, final MessageFields fields){
        if(hisOwner.feed() == null)
            return;

        fields.setFieldMessageOfDogFood("Gave feed");
        fields.setFieldMessageTerrier(" ");
        fields.setFieldMessagePoodle(" ");
        fields.setFieldMessageSheepDog(" ");
    }
    /**
     *This method creates a dog.
     *@param age this is dog's age.
     *@param name this is dog's name.
     */
    public AbstractDog(final int age, final String name){
       super(name, age);
    }

}
