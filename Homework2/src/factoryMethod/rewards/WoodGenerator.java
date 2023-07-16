package factoryMethod.rewards;

import factoryMethod.ItemFactory;
import factoryMethod.iGameItem;

public class WoodGenerator extends ItemFactory {
    @Override
    public iGameItem createItem() {
        return new WoodReward();
    }
}
