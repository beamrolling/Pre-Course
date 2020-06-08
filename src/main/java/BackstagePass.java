public class BackstagePass extends Goods {
    public BackstagePass(int sellIn, int quality) {
       super(sellIn,quality);
    }

    public void refresh() {
        this.setSellIn(this.getSellIn()-1);

        if(this.getSellIn() < 0) {
            this.setQuality(0);
        }
    }
}
