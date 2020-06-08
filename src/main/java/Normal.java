public class Normal extends Goods {
    public Normal(int sellIn, int quality) {
        super(sellIn,quality);
    }

    public void refresh() {
        this.setSellIn(this.getSellIn()-1);

        if(this.getQuality() > 0 && this.getSellIn() >= 0) {
            this.setQuality(this.getQuality()-1);
        }
        if(this.getQuality() == 1 && this.getSellIn() < 0) {
            this.setQuality(0);
        }
    }
}
