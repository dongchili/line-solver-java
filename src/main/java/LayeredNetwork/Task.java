package LayeredNetwork;

import StochLib.SchedStrategy;

import java.util.List;

public class Task extends LayeredNetworkElement{
    private int multiplicity;
    private int replication;
    private SchedStrategy scheduling;
    private double thinkTime;
    private double thinkTimeMean;
    private double thinkTimeSCV;
    private List<Entry> entries;
    private List<Activity> activities;
    private List<ActivityPrecedence> precedences;
    private Entry replyEntry;

    public Task(LayeredNetwork model, char[] name, int multiplicity, SchedStrategy scheduling, double thinkTime) {
        super(name);
        this.replication = 1;
        this.model = model;
        this.multiplicity = multiplicity;
        this.scheduling = scheduling;
        this.thinkTime = thinkTime;
        //model.tasks{end+1} = self;//TODO
        switch (scheduling) {
            //case SchedStrategy.REF
                //TODO
        }
    }
}
