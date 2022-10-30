package decorator;

public abstract class Decorator extends Assurance{


    protected Assurance assurance;

    public Decorator(Assurance assurance) {
        this.assurance = assurance;
    }


}
