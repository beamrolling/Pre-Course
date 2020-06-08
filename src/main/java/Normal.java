public class Normal extends Goods {
    public Normal(int sellIn, int quality) {
        super(sellIn,quality);
    }

    public void refresh() {
        this.setSellIn(this.getSellIn()-1);

        if(this.getSellIn() >= 0) {
            if(this.getQuality() > 0)
                this.setQuality(this.getQuality()-1);
        } else {
            if(this.getQuality() < 2) {
                this.setQuality(0);
            } else {
                this.setQuality(this.getQuality()-2);
            }
        }

    }
}
