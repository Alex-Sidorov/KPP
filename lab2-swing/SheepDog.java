
public class SheepDog extends Dog{

    SheepDog(int age, String name) {
        super(age, name);
    }
    public void ask_for_food(Owner his_owner,MessageFields fields){
        if(his_owner.feed()==null)
            return;

        fields.setFieldMessageOfDogFood("Gave feed to sheep dog");
        fields.setFieldMessageTerrier(" ");
        fields.setFieldMessagePoodle(" ");
        fields.setFieldMessageSheepDog(" ");
    }
}
