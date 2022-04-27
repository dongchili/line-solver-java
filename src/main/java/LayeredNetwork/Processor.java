package LayeredNetwork;

public class Processor extends Host{
    public Processor(LayeredNetwork myLN, char[] name, int multiplicity, char[] scheduling, double quantum, double speedFactor) {
        super(myLN, name, multiplicity, scheduling, quantum, speedFactor);
    }
}
