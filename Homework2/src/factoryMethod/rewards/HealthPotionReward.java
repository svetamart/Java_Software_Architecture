package factoryMethod.rewards;

import factoryMethod.iGameItem;

public class HealthPotionReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Item unlocked: Health Potion");
    }
}
