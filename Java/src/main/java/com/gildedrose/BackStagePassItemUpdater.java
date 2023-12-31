package com.gildedrose;

public class BackStagePassItemUpdater extends BaseItemUpdater {

    public static final String ITEM = "Backstage passes to a TAFKAL80ETC concert";

    @Override
    protected void updateBeforeSellIn(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }

                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }

    @Override
    protected void updateAfterSellIn(Item item) {
        item.quality = 0;
    }
}
