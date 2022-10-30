package composite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Traject extends Mission{

    private String departPoint;
    private String arrivalPoint;
    private LocalDate departDate;
    private LocalDate arrivalDate;

    private List<Bon> bons = new ArrayList<>();

    public String getDepartPoint() {
        return departPoint;
    }

    public  void setDepartPoint(String departPoint) {
        this.departPoint = departPoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public LocalDate getDepartDate() {
        return departDate;
    }

    public void setDepartDate(LocalDate departDate) {
        this.departDate = departDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public List<Bon> getBons() {
        return bons;
    }

    public void setBons(List<Bon> bons) {
        this.bons = bons;
    }

    @Override
    public String toString() {
        return "composite.Traject{" +
                "departPoint='" + departPoint + '\'' +
                ", arrivalPoint='" + arrivalPoint + '\'' +
                ", departDate=" + departDate +
                ", arrivalDate=" + arrivalDate +
                ", bons=" + bons.toString() +
                '}';
    }


    /*
     * @params : no parameters
     * @return : an integer, the sum of the price of every paid bon of this trajectory.
     *
     */
    @Override
    public int cout() {
        return bons.stream().reduce(0, (sum, bon) -> sum + bon.getCout(), Integer::sum ) ;
    }



    @Override
    public void view() {
        System.out.println(this.toString());
    }
}

