import java.util.List;

public class SousMission extends Mission{
    private List<Mission> missions;

    public SousMission(List<Mission> missions) {
        this.missions = missions;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    /*
    * @params : no parameters
    * @return : an integer, the sum of the consumption of every mission ( trajectory, sousMission)
    * */
    @Override
    public int cout() {
        return  missions.stream().reduce(0, (sum, mission) -> sum + mission.cout(), Integer::sum);
    }
}
