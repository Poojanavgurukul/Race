package race;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final List<Runner> runners = new ArrayList<>();

    public List<Runner> add(Runner runner) {
        runners.add(runner);
        return runners;
    }

    public List<Runner> getListOfRunner() {
        return runners;
    }

    public Runner getWinner() {
        Runner runner1 = runners.get(0);
        for (Runner runner : runners) {
            if (runner.finishingTime < runner1.finishingTime) {
                runner1 = runner;
            }
        }
        return runner1;
    }
}
