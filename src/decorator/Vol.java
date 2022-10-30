package decorator;

public class Vol extends Decorator{

    public Vol(Assurance assurance, int fees) {
        super(assurance, fees);
    }

    @Override
    int getFees() {
        return assurance.getFees() + this.fees;
    }
}
