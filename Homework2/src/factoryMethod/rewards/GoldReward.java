package factoryMethod.rewards;

import factoryMethod.iGameItem;

public class GoldReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Item unlocked: Gold");
    }
}
