package nl.blitz.gildedrose;

public class ConjuredItem extends QualityChangingItem {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (sellIn > 0) {
            quality -= 2;
        } if (sellIn <= 0 ) {
            quality -= 4;
        }

        sellIn -= 1;
    }
}
