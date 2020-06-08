public class Normal extends Goods {
    public Normal(int sellIn, int quality) {
        super(sellIn,quality);
    }

    public void refresh() {
        if(this.getQuality() == 0) {
            this.setSellIn(this.getSellIn()-1);
        }
        if(this.getQuality() > 0) {
            this.setSellIn(this.getSellIn()-1);
            this.setQuality(this.getQuality()-1);
        }
    }
}
