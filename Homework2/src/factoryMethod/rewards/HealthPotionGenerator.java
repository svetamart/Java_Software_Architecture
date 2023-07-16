package factoryMethod.rewards;

import factoryMethod.ItemFactory;
import factoryMethod.iGameItem;

public class HealthPotionGenerator extends ItemFactory {
    @Override
    public iGameItem createItem() {
        return new HealthPotionReward();
    }
}
