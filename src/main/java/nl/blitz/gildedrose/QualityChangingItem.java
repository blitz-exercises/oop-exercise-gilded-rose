package nl.blitz.gildedrose;

public abstract class QualityChangingItem extends Item {

    public QualityChangingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void updateQuality(); // abstract becouse the children will implement

    public int getQuality() {
        return quality;
    }
}
