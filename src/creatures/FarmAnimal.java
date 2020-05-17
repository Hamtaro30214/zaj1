package creatures;


public abstract class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("Zwierzęta z farm są przeznaczone na pożywienie");
    }


}

