package decorator;

public class Main {

    public static void main(String[] args) {

        Assurance rc = new ResponsabiliteCivile(80);

        rc = new Vol(rc); // fees of Vol : 100
        System.out.println(rc.getFees()); // expected 80 + 100 = 180

        rc = new Incendie(rc); // fees of Incendie : 200
        System.out.println(rc.getFees()); // expected 180 + 200 = 380
    }
}
