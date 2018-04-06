
package dogs;

import owner.Owner;
import abstractdog.AbstractDog;
import window.MessageFields;
/**
 * This class describes a sheep dog.
 */
public class SheepDog extends AbstractDog {

    /**
     *The method creates a sheep dog.
     *@param age this is age's sheep dog.
     *@param name this is name's sheep dog.
     */
    public SheepDog(int age, String name) {
        super(age, name);
    }
    /**
     * The method prints message of feed for dog.
     * @param hisOwner hisOwner is dogs's owner.
     * @param fields this is fields for review dog's commands.
     */
    public void askForFood(final Owner hisOwner, final MessageFields fields){
        if(hisOwner.feed() == null)
            return;

        fields.setFieldMessageOfDogFood("Gave feed to sheep dog");
    }
}
