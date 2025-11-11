package nl.blitz.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    @Test
    void testUpdateQualityForAllItems() {
        Item[] items = new Item[] {
            new AgedBrie("Aged Brie", 5, 10),
            new BackstagePasses("Backstage passes", 15, 20),
            new NonConjuredItem("Normal Item", 3, 5),
            new ConjuredItem("Conjured Mana Cake", 2, 6),
            new Sulfuras("Sulfuras", 0),
            new NonQualityChangingItem("Frozen Item", 10, 40)
        };

        for (Item item : items) {
            if (item instanceof QualityChangingItem) {
                ((QualityChangingItem) item).updateQuality();
            }
        }

        // quality changing
        assertEquals(9, ((AgedBrie) items[0]).getQuality(), "Aged Brie +1");
        assertEquals(21, ((BackstagePasses) items[1]).getQuality(), "Backstage +1 (sellIn > 10)");
        assertEquals(4, ((NonConjuredItem) items[2]).getQuality(), "Normal +1");
        assertEquals(4, ((ConjuredItem) items[3]).getQuality(), "Conjured -2");

        // quality non changing
        assertEquals(80, ((Sulfuras) items[4]).getQuality(), "Sulfuras quality stays 80");
        assertEquals(40, ((NonQualityChangingItem) items[5]).getQuality(), "Frozen item quality stays constant");
    }
}
