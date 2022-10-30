package decorator;

public class Incendie extends Decorator{


    public Incendie(Assurance assurance, int fees) {
        super(assurance, fees);
    }

    @Override
    int getFees() {
        return assurance.getFees() + this.fees;
    }
}
