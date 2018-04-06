
package dogs;

import owner.Owner;
import abstractdog.AbstractDog;
import window.MessageFields;
/**
 * This class describes a terrier.
 */
public class Terrier extends AbstractDog {

    /**
     *The method creates a terrier.
     *@param age this is age's terrier.
     *@param name this is name's terrier.
     */
    public Terrier(final int age, final String name) {
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

        fields.setFieldMessageOfDogFood("Gave feed to terrier");
    }
}
