import java.util.List;

public class Main {



    public static void main(String[] args) {


        /*
        * Bon to use for trajectories and missions
        * */
        Bon b1 = new Bon(10);
        Bon b2 = new Bon(11);
        Bon b3 = new Bon(12);
        Bon b4 = new Bon(13);
        Bon b5 = new Bon(14);
        Bon b6 = new Bon(15);

        /*
        * create 3 trajectories.
        * create sousMission with 3 trajectories
        * */
        Mission trajectory1 = new TrajectBuilder().setBons(List.of(b1)).getTrajectory();

        Mission trajectory2 = new TrajectBuilder().setBons(List.of(b2)).getTrajectory();

        Mission trajectory3 = new TrajectBuilder().setBons(List.of(b3)).getTrajectory();

        Mission sousMission = new SousMission(List.of(trajectory1, trajectory2, trajectory3));


        /*
        * create 3 other trajectories
        * */
        Mission trajectory4 = new TrajectBuilder().setBons(List.of(b4)).getTrajectory();

        Mission trajectory5 = new TrajectBuilder().setBons(List.of(b5)).getTrajectory();

        Mission trajectory6 = new TrajectBuilder().setBons(List.of(b6)).getTrajectory();

        /*
        * create mission with 3 trajectories and one sousMission
        * print the consumption of our mission
        * */
        Mission mission = new SousMission(List.of(trajectory4, trajectory5, trajectory6, sousMission ));

        /*
        * expected value :
        * 10 + 11 + 12 + 13 + 14 + 15 = 75
        * */
        System.out.println(mission.cout());

        mission.view();




    }
}
