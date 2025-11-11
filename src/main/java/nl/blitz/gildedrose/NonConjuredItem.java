package nl.blitz.gildedrose;

public class NonConjuredItem extends QualityChangingItem {

    public NonConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (sellIn < 0) {
            quality -= 2;
        } else {
            quality -= 1;
        }

        // Ensure quality does not go below 0
        if (quality < 0) {
            quality = 0;
        }

        // Ensure quality does not exceed 50
        if (quality > 50) {
            quality = 50;
        }
    }
}
