
package LayeredNetwork;

public class Entry extends LayeredNetworkElement{
    private double openArrivalRate;

    public Entry(LayeredNetwork model, char[] name) {
        super(name);
        this.openArrivalRate = 0.0;
//        model.entries{end+1} = self;//TODO
        this.model = model;
    }

    public  void on(){//TODO
    }
}

