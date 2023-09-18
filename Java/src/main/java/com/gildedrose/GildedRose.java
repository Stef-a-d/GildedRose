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
                    new BrieItemUpdater().updateQuality(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    new SulfurasItemUpdater().updateQuality(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new BackStagePassItemUpdater().updateQuality(item);
                    break;
                case "Conjured Mana Cake":
                    new ConjuredItemsItemUpdater().updateQuality(item);
                    break;
                default:
                    new BaseItemUpdater().updateQuality(item);
                    break;
            }
        }
    }
}
