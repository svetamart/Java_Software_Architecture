package factoryMethod.rewards;

import factoryMethod.iGameItem;

public class WoodReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Item unlocked: Wood");
    }
}
