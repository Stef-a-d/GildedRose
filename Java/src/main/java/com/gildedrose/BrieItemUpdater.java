package com.gildedrose;

public class BrieItemUpdater extends BaseItemUpdater {

    @Override
    protected void updateBeforeSellIn(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    @Override
    protected void updateAfterSellIn(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
