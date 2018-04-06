
package owner;

import cat.Cat;
import dogfood.DogFood;

import abstractdog.AbstractDog;
import window.MessageFields;
import dogs.Poodle;
import dogs.SheepDog;
import dogs.Terrier;

/**
 * This class describes an owner.
 */
public class Owner {
    /**
     *The method commands to dogs
     *@param fields This is field for all message.
     */
    public void commandToDogs(final MessageFields fields){

        if(poodle != null)
            poodle.acceptCommand(fields);

        if(terrier != null)
            terrier.acceptCommand(fields);

        if(sheepdog != null)
            sheepdog.acceptCommand(fields);
    }

    /**
     *The method commands to dogs.
     *@param fields This is field for all message.
     */
    public void walkOutDogs(final MessageFields fields){
        fields.setFieldMessageOfDogFood("Walk out dogs");

        if(poodle != null)
            fields.setFieldMessagePoodle("On a walk");
        if(terrier != null)
            fields.setFieldMessageTerrier("On a walk");
        if(sheepdog != null)
            fields.setFieldMessageSheepDog("On a walk");
    }

    /**
     * The method creates poodle.
     * @param age This is age's poodle.
     * @param name This is name's poodle.
     */
    public void havePoodle(final int age, final String name){
        poodle = new Poodle(age, name);
    }

    /**
     * The method creates terrier.
     * @param age This is age's terrier.
     * @param name This is name's terrier.
     */
    public void haveTerrier(final int age, final String name){
        terrier = new Terrier(age, name);
    }

    /**
     * The method creates sheep dog.
     * @param age This is age's sheep dog.
     * @param name This is name's sheep dog.
     */
    public void haveSheepDog(final int age, final String name){
        sheepdog = new SheepDog(age, name);
    }

    /**
     * The method creates cat.
     * @param age This is age's cat.
     * @param name This is name's cat.
     */
    public void haveCat(final int age, final String name){
        cat = new Cat(name, age);
    }

    /**
     * The method returns value food.
     * @return food This is object dogFood.
     */
    public DogFood feed(){
        return food;
    }

    /**
     * This is object Poodle.
     */
    public AbstractDog poodle;
    /**
     * This is object Terrier.
     */
    public AbstractDog terrier;
    /**
     * This is object sheepDog.
     */
    public AbstractDog sheepdog;
    /**
     * This is object Cat.
     */
    public Cat cat;
    /**
     * This is object DogFood.
     */
    private DogFood food = new DogFood(10);
}

