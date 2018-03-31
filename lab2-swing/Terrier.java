
public class Terrier extends Dog{

    Terrier(int age, String name) {
        super(age, name);
    }

    public void ask_for_food(Owner his_owner,MessageFields fields){
        if(his_owner.feed()==null)
            return;

        fields.setFieldMessageOfDogFood("Gave feed to terrier");
        fields.setFieldMessageTerrier(" ");
        fields.setFieldMessagePoodle(" ");
        fields.setFieldMessageSheepDog(" ");
    }
}
