
package window;

import javax.swing.JLabel;
/**
 * This class describes all message fields in application.
 */
public class MessageFields {

    /**
     * The method prints message's terrier.
     * @param messageTerrier This is a message.
     */
    public void setFieldMessageTerrier(final String messageTerrier){
        fieldMessageTerrier.setText(messageTerrier);
    }
    /**
     * The method prints message's poodle.
     * @param messagePoodle This is a message.
     */
    public void setFieldMessagePoodle(final String messagePoodle){
        fieldMessagePoodle.setText(messagePoodle);
    }
    /**
     * The method prints message's sheep dog.
     * @param messageSheepDog This is a message.
     */
    public void setFieldMessageSheepDog(final String messageSheepDog){
        fieldMessageSheepDog.setText(messageSheepDog);
    }
    /**
     * The method prints message's cat.
     * @param messageCat This is a message.
     */
    public void setFieldMessageCat(final String messageCat){
        fieldMessageCat.setText(messageCat);
    }
    /**
     * The method prints message's dog food.
     * @param messageOfDogFood This is a message.
     */
    public void setFieldMessageOfDogFood(final String messageOfDogFood){
        fieldMessageOfDogFood.setText(messageOfDogFood);
    }
    /**
     * The method returns message's dog food.
     * @return fieldMessageOfDogFood.
     */
    public JLabel getFieldMessageOfDogFood(){
        return fieldMessageOfDogFood;
    }
    /**
     * The method returns message's poodle.
     * @return fieldMessagePoodle.
     */
    public JLabel getFieldMessagePoodle(){
        return fieldMessagePoodle;
    }
    /**
     * The method returns message's terrier.
     * @return fieldMessageTerrier.
     */
    public  JLabel getFieldMessageTerrier(){
        return fieldMessageTerrier;
    }
    /**
     * The method returns message's sheep dog.
     * @return fieldMessageSheepDog.
     */
    public JLabel getFieldMessageSheepDog(){
        return fieldMessageSheepDog;
    }
    /**
     * The method returns message's cat.
     * @return fieldMessageCat.
     */
    public JLabel getFieldMessageCat(){
        return fieldMessageCat;
    }

    /**
     * The method creates all message.
     */
    MessageFields(){
        fieldMessagePoodle = new JLabel("not dog");
        fieldMessageTerrier = new JLabel("not dog");
        fieldMessageSheepDog = new JLabel("not dog");
        fieldMessageCat = new JLabel("not cat");
        fieldMessageOfDogFood = new JLabel(" ");
    }

    /**
     * This is a message's poodle.
     */
    private JLabel fieldMessagePoodle;
    /**
     * This is a message's terrier.
     */
    private JLabel fieldMessageTerrier;
    /**
     * This is a message's sheep dog.
     */
    private JLabel fieldMessageSheepDog;
    /**
     * This is a message's cat.
     */
    private JLabel fieldMessageCat;
    /**
     * This is a message's dog food.
     */
    private JLabel fieldMessageOfDogFood;
}
