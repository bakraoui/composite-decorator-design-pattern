package decorator;

public class ResponsabiliteCivile extends Assurance{

    private int fees;

    public ResponsabiliteCivile(int fees) {
        this.fees = fees;
    }

    @Override
    int getFees() {
        return fees;
    }
}
