import javax.swing.JLabel;

public class MessageFields {

    public void setFieldMessageTerrier(String messageTerrier){
        fieldMessageTerrier.setText(messageTerrier);
    }

    public void setFieldMessagePoodle(String messagePoodle){
        fieldMessagePoodle.setText(messagePoodle);
    }

    public void setFieldMessageSheepDog(String messageSheepDog){
        fieldMessageSheepDog.setText(messageSheepDog);
    }

    public void setFieldMessageOfDogFood(String messageOfDogFood){
        fieldMessageOfDogFood.setText(messageOfDogFood);
    }

    public JLabel getFieldMessageOfDogFood(){
        return fieldMessageOfDogFood;
    }

    public JLabel getFieldMessagePoodle(){
        return fieldMessagePoodle;
    }

    public  JLabel getFieldMessageTerrier(){
        return fieldMessageTerrier;
    }

    public JLabel getFieldMessageSheepDog(){
        return fieldMessageSheepDog;
    }

    private JLabel fieldMessagePoodle= new JLabel(" ");
    private JLabel fieldMessageTerrier= new JLabel(" ");
    private JLabel fieldMessageSheepDog= new JLabel(" ");
    private JLabel fieldMessageOfDogFood= new JLabel(" ");
}
