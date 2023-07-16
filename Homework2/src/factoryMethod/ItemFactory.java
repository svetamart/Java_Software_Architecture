package factoryMethod;

public abstract class ItemFactory {
    public void openReward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
