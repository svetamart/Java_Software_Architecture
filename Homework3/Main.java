public class Main {
    public static void main(String[] args) {

        // Создаем экземпляр PetrolEngineCar
        PetrolEngineCar petrolCar = new PetrolEngineCar("BMW", "X5", "Black", "SUV",
                4, "Automatic", 3.0);

        // Создаем экземпляр DieselEngineCar
        DieselEngineCar dieselCar = new DieselEngineCar("Mercedes-Benz", "E-Class", "Silver", "Sedan",
                4, "Automatic", 2.2);

        // Заправляем бензиновый автомобиль
        iGasStation petrolStation = petrolCar;
        petrolStation.fuel();

        // Заправляем дизельный автомобиль
        iGasStation dieselStation = dieselCar;
        dieselStation.fuel();
    }
}

