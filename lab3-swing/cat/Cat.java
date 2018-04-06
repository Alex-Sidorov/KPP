
package cat;

import abstractpet.AbstractPet;
import window.MessageFields;
/**
 * This class describes a cat.
 */
public class Cat extends AbstractPet{
    /**
     *This method creates a pet.
     *@param ageCat this is age's cat.
     *@param nameCat this is name's cat.
     */
    public Cat(final String nameCat, final int ageCat){
        super(nameCat, ageCat);
    }

    /**
     * The method shows message of cat.
     * @param field This is cat's message.
     */
    public void sleep(final MessageFields field){
        String message = namePet + " sleep";
        field.setFieldMessageCat(message);
    }
}
