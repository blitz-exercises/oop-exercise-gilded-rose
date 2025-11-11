package nl.blitz.gildedrose;

public class AgedBrie extends NonConjuredItem {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        super.updateQuality(); // call the parent, there are the calculations
        
        // Aged Brie specific calculations, extention, not modification
        if (sellIn < 0) {
            quality += 1;
        }
        if (quality >= 50) {
            quality = 50;
        }
    }
}
