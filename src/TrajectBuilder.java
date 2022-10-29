import java.time.LocalDate;
import java.util.List;

public class TrajectBuilder {

    private Traject traject = new Traject();


    public  TrajectBuilder setDepartPoint(String departPoint) {
        traject.setDepartPoint(departPoint);
        return this;
    }

    public  TrajectBuilder setArrivalPoint(String arrivalPoint) {
        traject.setArrivalPoint(arrivalPoint);
        return this;
    }

    public  TrajectBuilder setDepartDate(LocalDate departDate) {
        traject.setDepartDate(departDate);
        return this;
    }

    public  TrajectBuilder setArrivalDate(LocalDate arrivalDate) {
        traject.setArrivalDate(arrivalDate);
        return this;
    }

    public  TrajectBuilder setBons(List<Bon> bons) {
        traject.setBons(bons);
        return this;
    }

    public Traject getTrajectory() {
        return traject;
    }
}
