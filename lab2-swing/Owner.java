
public class Owner {
    /**
     *This method commands to dogs
     */
    public void command_to_dogs(MessageFields fields){

        poodle.execute_command(fields);
        terrier.execute_command(fields);
        sheepdog.execute_command(fields);
    }


    public DogFood feed(){
        return food;
    }

    public Dog poodle = new Poodle(1,"Lui");
    public Dog terrier = new Terrier(2,"Kris");
    public Dog sheepdog = new SheepDog(3,"John");

    private DogFood food = new DogFood(10);
}

