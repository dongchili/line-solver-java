package LayeredNetwork;


public class LayeredNetworkElement extends Element {
    public LayeredNetwork model;
    public static final int HOST = 0;
    public static final int PROCESSOR = 0;
    public static final int TASK = 1;
    public static final int ENTRY = 2;
    public static final int ACTIVITY = 3;
    public static final int CALL = 4;


    public LayeredNetworkElement(char[] name) {
        super(name);
    }

    public double subsIndex(){
        return (double) this.model.getNodeIndex(this.model.name) - 1;//TODO
    }
}
