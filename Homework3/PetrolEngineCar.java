/**
 * Класс PetrolEngineCar представляет автомобиль с бензиновым двигателем.
 * Унаследован от класса Car и реализует интерфейс iGasStation.
 */
public class PetrolEngineCar extends Car implements iGasStation{
    protected PetrolEngineCar(String brand, String model, String color, String body,
                              int wheels, String gearbox, double engineSize) {
        super(brand, model, color, body, wheels, "petrol", gearbox, engineSize);
    }

    /**
     * {@inheritDoc}
     * После заправки выводится сообщение о том, что автомобиль был заправлен бензином.
     */
    @Override
    public void fuel() {
        System.out.printf("The car %s %s has been fueled with petrol.\n", this.brand, this.model);
    }
}
