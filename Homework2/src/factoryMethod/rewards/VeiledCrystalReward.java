package factoryMethod.rewards;

import factoryMethod.iGameItem;

public class VeiledCrystalReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Item unlocked: Veiled Crystal");
    }
}
