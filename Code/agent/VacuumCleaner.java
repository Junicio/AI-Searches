package agent;

import java.util.ArrayList;
import java.util.List;

public class VacuumCleaner {

    private int cost;
    private State state;
    private List<Actions> actionsList;

    public VacuumCleaner() {
        this.cost = 0;
        this.actionsList = new ArrayList<>();
    }

    public int getCost() {

        return cost;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }

    public State getState() {

        return state;
    }

    public void setState(State state) {

        this.state = state;
    }

    public List<Actions> getActionsList() {

        return actionsList;
    }

    public void setActionsList(List<Actions> actionsList) {

        this.actionsList = actionsList;
    }

    public void printActionList() {

        if (!getActionsList().isEmpty())
            getActionsList().forEach(actions -> System.out.println(actions.toString()));
    }
}
