package LayeredNetwork;

public class Host extends LayeredNetworkElement {
    private int multiplicity;
    private int replication;
    private char[] scheduling;
    private double quantum;
    private double speedFactor;
    private Task[] tasks;
    private int ID;

    public Host(LayeredNetwork model, char[] name, int multiplicity, char[] scheduling, double quantum, double speedFactor) {
        super(name);
        this.multiplicity = multiplicity;
        this.replication = replication;
        this.scheduling = scheduling;
        this.quantum = quantum;
        this.speedFactor = speedFactor;
        this.tasks = tasks;
        this.ID = ID;
        this.model = model;

    }
}
