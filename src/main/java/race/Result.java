package race;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static void main(String[] args) {
        Race race =new Race();
        Runner runner1= new Runner("pooja",10);
        Runner runner2 =new Runner("ankita",12);
        Runner runner3 =new Runner("Divya",1);
        Runner runner4 =new Runner("komal",0.5);
        race.add(runner1);
        race.add(runner2);
        race.add(runner3);
        race.add(runner4);
        System.out.println(race.getListOfRunner());
        System.out.println(race.getWinner());
    }
}
