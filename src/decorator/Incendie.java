package decorator;

public class Incendie extends Decorator{


    public Incendie(Assurance assurance) {
        super(assurance);
    }

    @Override
    int getFees() {
        return assurance.getFees() + 200;
    }
}
