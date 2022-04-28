package LayeredNetwork;

import StochLib.SchedStrategy;

import java.util.List;

public class Host extends LayeredNetworkElement {
    private int multiplicity;
    private int replication;
    private SchedStrategy scheduling;
    private double quantum;
    private double speedFactor;
    private List<Task> tasks;//Note:should use List
    private int ID;

    public Host(LayeredNetwork model, char[] name, int multiplicity, SchedStrategy scheduling, double quantum, double speedFactor) {
        super(name);
        this.multiplicity = multiplicity;
        this.replication = 1;
        this.scheduling = scheduling;
        this.quantum = quantum;
        this.speedFactor = speedFactor;
        this.model = model;
        //model.hosts{end+1} = self;//TODO
    }

    public Host(LayeredNetwork model, char[] name, int multiplicity, SchedStrategy scheduling, double quantum) {
        super(name);
        this.multiplicity = multiplicity;
        this.replication = 1;
        this.scheduling = scheduling;
        this.quantum = quantum;
        this.speedFactor = 1;
        this.model = model;
        //model.hosts{end+1} = self;//TODO
    }

    public Host(LayeredNetwork model, char[] name, int multiplicity, SchedStrategy scheduling) {
        super(name);
        this.multiplicity = multiplicity;
        this.replication = 1;
        this.scheduling = scheduling;
        this.quantum = 0.01;
        this.speedFactor = 1;
        this.model = model;
        //model.hosts{end+1} = self;//TODO
    }

    public Host(LayeredNetwork model, char[] name, int multiplicity) {
        super(name);
        this.multiplicity = multiplicity;
        this.replication = 1;
        this.scheduling = SchedStrategy.PS;
        this.quantum = 0.01;
        this.speedFactor = 1;
        this.model = model;
        //model.hosts{end+1} = self;//TODO
    }

    public Host(LayeredNetwork model, char[] name) {
        super(name);
        this.multiplicity = 1;
        this.replication = 1;
        this.scheduling = SchedStrategy.PS;
        this.quantum = 0.01;
        this.speedFactor = 1;
        this.model = model;
        //model.hosts{end+1} = self;//TODO
    }

    public void setReplication(int replication) {
        this.replication = replication;
    }

    public void addTask(Task newTask){
        tasks.add(newTask);
    }
}
