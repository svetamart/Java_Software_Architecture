package factoryMethod.rewards;

import factoryMethod.iGameItem;

public class FortuneglassReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Item unlocked: Fortuneglass");
    }
}
