package decorator;

public class Main {

    public static void main(String[] args) {

        Assurance rc = new ResponsabiliteCivile(100);

        rc = new Vol(rc, 100); // fees of Vol : 100
        System.out.println(rc.getFees()); // expected 100 + 100 = 200

        rc = new Incendie(rc, 200); // fees of Incendie : 200
        System.out.println(rc.getFees()); // expected 200 + 200 = 400
    }
}
