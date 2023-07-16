package factoryMethod.rewards;

import factoryMethod.ItemFactory;
import factoryMethod.iGameItem;

public class DreamStoneGenerator extends ItemFactory {
    @Override
    public iGameItem createItem() {
        return new DreamStoneReward();
    }
}
