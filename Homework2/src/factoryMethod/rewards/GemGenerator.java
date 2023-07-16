package factoryMethod.rewards;

import factoryMethod.ItemFactory;
import factoryMethod.iGameItem;

public class GemGenerator extends ItemFactory {
    @Override
    public iGameItem createItem() {
        return new GemReward();
    }
}
