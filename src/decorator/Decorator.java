package decorator;

public abstract class Decorator extends Assurance{


    protected Assurance assurance;
    public Decorator(Assurance assurance, int fees) {
        this.assurance = assurance;
        this.fees = fees;
    }


}
