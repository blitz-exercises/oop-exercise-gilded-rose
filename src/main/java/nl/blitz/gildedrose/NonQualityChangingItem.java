package nl.blitz.gildedrose;

public class NonQualityChangingItem extends Item {

    protected final int fixedQuality; // stała jakość dla wszystkich NonQualityChangingItem

    public NonQualityChangingItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.fixedQuality = quality; // przypisujemy wartość podaną w konstruktorze
    }

    public int getQuality() {
        return fixedQuality;
    }

    @Override
    public String toString() {
        return name + ", " + sellIn + ", " + fixedQuality;
    }
}
