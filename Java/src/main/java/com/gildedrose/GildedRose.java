package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case BrieItemUpdater.ITEM:
                    new BrieItemUpdater().updateQuality(item);
                    break;
                case SulfurasItemUpdater.ITEM:
                    new SulfurasItemUpdater().updateQuality(item);
                    break;
                case BackStagePassItemUpdater.ITEM:
                    new BackStagePassItemUpdater().updateQuality(item);
                    break;
                case ConjuredItemsItemUpdater.ITEM:
                    new ConjuredItemsItemUpdater().updateQuality(item);
                    break;
                default:
                    new BaseItemUpdater().updateQuality(item);
                    break;
            }
        }
    }
}
