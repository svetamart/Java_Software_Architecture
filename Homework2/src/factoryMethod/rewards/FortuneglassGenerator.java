package factoryMethod.rewards;

import factoryMethod.ItemFactory;
import factoryMethod.iGameItem;

public class FortuneglassGenerator extends ItemFactory {
    @Override
    public iGameItem createItem() {
        return new FortuneglassReward();
    }
}
