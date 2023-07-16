package factoryMethod.rewards;

import factoryMethod.iGameItem;

public class GemReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Item unlocked: Gem");
    }
}
