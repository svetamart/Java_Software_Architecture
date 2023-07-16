package factoryMethod.rewards;

import factoryMethod.ItemFactory;
import factoryMethod.iGameItem;

public class GoldGenerator extends ItemFactory {
    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
