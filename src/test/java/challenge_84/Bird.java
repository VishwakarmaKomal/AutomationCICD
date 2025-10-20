package challenge_84;

public abstract class Bird implements Flyable{

    public final String Breed;

    protected Bird(String breed) {
        Breed = breed;
    }

    public String getBreed() {
        return Breed;
    }
}
