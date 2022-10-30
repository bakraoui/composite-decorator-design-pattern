package decorator;

public class Vol extends Decorator{

    public Vol(Assurance assurance) {
        super(assurance);
    }

    @Override
    int getFees() {
        return assurance.getFees() + 100;
    }
}
