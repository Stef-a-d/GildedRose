package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    new BrieQualityUpdater().updateQuality(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    new SulfurasQualityUpdater().updateQuality(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new BackStagePassQualityUpdater().updateQuality(item);
                    break;
                case "Conjured Mana Cake":
                    new ConjuredItemsQualityUpdater().updateQuality(item);
                    break;
                default:
                    new BaseQualityUpdater().updateQuality(item);
                    break;
            }
        }
    }
}
