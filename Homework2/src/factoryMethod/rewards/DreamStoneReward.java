package factoryMethod.rewards;

import factoryMethod.iGameItem;

public class DreamStoneReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Item unlocked: Dream Stone");
    }
}
