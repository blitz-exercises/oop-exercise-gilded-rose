package nl.blitz.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item instanceof QualityChangingItem) {
                ((QualityChangingItem) item).updateQuality();
            }
        }
    }
}
