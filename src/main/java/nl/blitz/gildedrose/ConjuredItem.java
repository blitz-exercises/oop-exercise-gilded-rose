package nl.blitz.gildedrose;

public class ConjuredItem extends QualityChangingItem {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        quality -= 2; // Conjured = double min
        sellIn-=1;
    }
}
