package LayeredNetwork;

import SimUtil.Distribution;

public class ItemEntry extends Entry{
    private int cardinality;
    private Distribution popularity;

    public ItemEntry(char[] name, LayeredNetwork model, int cardinality, Distribution distribution) {
        super(model, name);
        this.cardinality = cardinality;
        if(distribution.isDiscrete()){
            //this.popularity = SerializationUtils.clone(distribution);//TODO
        }
    }

    @Override
    public void on() {//TODO
        super.on();
    }
}
