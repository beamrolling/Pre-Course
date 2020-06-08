public class BackstagePass extends Goods {
    public BackstagePass(int sellIn, int quality) {
       super(sellIn,quality);
    }

    public void refresh() {
        this.setSellIn(this.getSellIn()-1);

        if(this.getSellIn() < 0) {
            this.setQuality(0);
        } else if(this.getSellIn() > 10) {
            if(this.getQuality() < 50){
                this.setQuality(this.getQuality()+1);
            }
        } else if(this.getSellIn() > 5 && this.getSellIn() < 11) {
            if(this.getQuality() == 49) {
                this.setQuality(50);
            }
        } else if(this.getSellIn() > -1 && this.getSellIn() < 6) {
            if(this.getQuality() > 47) {
                this.setQuality(50);
            }
        }
    }
}
