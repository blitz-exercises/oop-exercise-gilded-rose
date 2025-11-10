package nl.blitz.gildedrose;

public class NonConjuredItem extends QualityChangingItem {

    public NonConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        quality += 1; 
        sellIn -= 1;
    }
}
