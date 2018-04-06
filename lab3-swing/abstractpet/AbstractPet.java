
package abstractpet;
/**
 * This class describes an abstract pet.
 */
public abstract class AbstractPet {

    /**
     *This method creates a pet.
     *@param age this is age's pet.
     *@param name this is name's pet.
     */
    public AbstractPet(final String name, final int age) {
        agePet = age;
        namePet = name;
    }

    /**
     * This is name's pet.
     */
    protected String namePet;
    /**
     * This is age's pet.
     */
    protected int agePet;
}
