/**
 * Класс DieselEngineCar представляет автомобиль с дизельным двигателем.
 * Унаследован от класса Car и реализует интерфейс iGasStation.
 */
public class DieselEngineCar extends Car implements iGasStation{
    protected DieselEngineCar(String brand, String model, String color, String body,
                              int wheels, String gearbox, double engineSize) {
        super(brand, model, color, body, wheels, "diesel", gearbox, engineSize);
    }

    /**
     * {@inheritDoc}
     * После заправки выводится сообщение о том, что автомобиль был заправлен дизельным топливом.
     */
    @Override
    public void fuel() {
        System.out.printf("The car %s %s has been fueled with diesel fuel.\n", this.brand, this.model);

    }
}
