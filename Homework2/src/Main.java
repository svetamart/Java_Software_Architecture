import facade.Facade;
import facade.Programmer;
import facade.components.*;

import factoryMethod.ItemFactory;
import factoryMethod.rewards.*;

import strategy.Navigator;
import strategy.transport.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) throws Exception {

        Random rand = new Random();
        List<ItemFactory> factoryList = new ArrayList<>();

        System.out.println(ANSI_RED + "Factory Method \n" + ANSI_RESET);

        factoryList.add(new GoldGenerator());
        factoryList.add(new GemGenerator());
        factoryList.add(new WoodGenerator());
        factoryList.add(new VeiledCrystalGenerator());
        factoryList.add(new HealthPotionGenerator());
        factoryList.add(new FortuneglassGenerator());
        factoryList.add(new DreamStoneGenerator());

        for (int i = 0; i < 20; i++) {
            int index = rand.nextInt(factoryList.size());
            ItemFactory factory = factoryList.get(index);
            factory.openReward();
        }

        System.out.println(ANSI_RED + "\nFacade \n" + ANSI_RESET);

        TextEditor textEditor = new TextEditor();
        Compiller compiller = new Compiller();
        CLR clr = new CLR();

        Facade ide = new Facade(textEditor, compiller, clr);

        Programmer programmer = new Programmer();
        programmer.createApplication(ide);

        System.out.println(ANSI_RED + "\nStrategy \n" + ANSI_RESET);

        Navigator navigator = new Navigator(615, new Car());
        navigator.move();

        navigator.setMovable(new OnFoot());
        navigator.move();

        navigator.setMovable(new Bicycle());
        navigator.move();

    }
}
