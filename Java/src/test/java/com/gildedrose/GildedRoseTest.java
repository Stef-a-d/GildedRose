package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void qualityDegradesAfterSellBy(){
        Item[] items = new Item[] {new Item("item", 10, 5), new Item("item", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(4, app.items[0].quality);
        assertEquals(3, app.items[1].quality);
    }

    @Test
    void qualityNeverNegative(){
        Item[] items = new Item[] { new Item("item", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(0, app.items[0].quality);
    }

    @Test
    void agedBrieQualityIncreases(){
        Item[] items = new Item[] { new Item("Aged Brie", 10, 5), new Item("Aged Brie", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(6, app.items[0].quality);
        assertEquals(7, app.items[1].quality);
    }

    @Test
    void sulfurasDoesntHaveToBeSold(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(10, app.items[0].sellIn);
    }
    @Test
    void sulfurasDoesntDegrade(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(10, app.items[0].quality);
    }

    @Test
    void backStagePassesIncreaseInValue() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 10),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(11, app.items[0].quality);
        assertEquals(12, app.items[1].quality);
        assertEquals(13, app.items[2].quality);
    }

    @Test
    void backStagePassesLoseValue() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(0, app.items[0].quality);
    }

    @Test
    void conjuredItemsDegradeFaster() {
        Item[] items = new Item[] {
            new Item("Conjured Mana Cake", 20, 10),
            new Item("Conjured Mana Cake", 20, 0),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(8, app.items[0].quality);
        assertEquals(6, app.items[1].quality);
    }

    @Test
    void qualityCannotExceed50(){
        Item[] items = new Item[] { new Item("Aged Brie", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(50, app.items[0].quality);
    }

}
