package nl.blitz.gildedrose;

public class NonQualityChangingItem extends Item {

    protected final int fixedQuality; 

    public NonQualityChangingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.fixedQuality = quality; 
    }

    public int getQuality() {
        return fixedQuality;
    }

    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + fixedQuality;
    }
}
