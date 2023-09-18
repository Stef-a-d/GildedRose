package com.gildedrose;

public class BackStagePassQualityUpdater extends BaseQualityUpdater{

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
