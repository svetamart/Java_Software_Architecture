package factoryMethod.rewards;

import factoryMethod.ItemFactory;
import factoryMethod.iGameItem;

public class VeiledCrystalGenerator extends ItemFactory {
    @Override
    public iGameItem createItem() {
        return new VeiledCrystalReward();
    }
}
