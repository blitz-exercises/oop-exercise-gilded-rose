package nl.blitz.gildedrose;

public class BackstagePasses extends NonConjuredItem {

    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality); // call the parent constructor
    }

    @Override
    public void updateQuality() {
        if (sellIn > 10) {
            quality += 1;
        } else if (sellIn > 5) {
            quality += 2;
        } else if (sellIn > 0) {
            quality += 3;
        } else {
            quality = 0; // After concert
        }

        sellIn-=1;
    }
}
