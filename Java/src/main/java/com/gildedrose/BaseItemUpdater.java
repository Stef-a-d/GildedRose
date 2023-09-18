package com.gildedrose;

public class BaseItemUpdater {

    public void updateQuality(Item item) {
        updateBeforeSellIn(item);

        updateSellIn(item);

        if (item.sellIn < 0) {
            updateAfterSellIn(item);
        }
    }

    protected void updateBeforeSellIn(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void updateAfterSellIn(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void updateSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }
}
