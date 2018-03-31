
public class Dog {
    /**
     *This method is print message of execute command
     */
    public void execute_command(MessageFields fields){

        fields.setFieldMessagePoodle("Played the team.");
        fields.setFieldMessageTerrier("Played the team.");
        fields.setFieldMessageSheepDog("Played the team.");
        fields.setFieldMessageOfDogFood(" ");
    }
    /**
     *This method is print message of dog's food
     */
    public void ask_for_food(Owner his_owner, MessageFields fields){
        if(his_owner.feed()==null)
            return;

        fields.setFieldMessageOfDogFood("Gave feed");
        fields.setFieldMessageTerrier(" ");
        fields.setFieldMessagePoodle(" ");
        fields.setFieldMessageSheepDog(" ");
    }

    Dog(int age, String name){
        _age = age;
        _name = name;
    }

    private int _age;
    private String _name;
}
