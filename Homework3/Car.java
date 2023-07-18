/**
 * Абстрактный класс Car с общими свойствами и функциональностью.
 *
 */

public abstract class Car {
    protected String brand;
    protected String model;
    protected String color;
    protected String body;
    protected int wheels;
    protected String fuel;
    protected String gearbox;
    protected double engineSize;

    protected boolean lightsOn;
    protected boolean wipersOn;

    /**
     * Конструктор создает объект Car с указанными атрибутами.
     *
     * @param brand      марка автомобиля
     * @param model      модель автомобиля
     * @param color      цвет автомобиля
     * @param body       тип кузова автомобиля
     * @param wheels     количество колес автомобиля
     * @param fuel       тип топлива, используемый автомобилем
     * @param gearbox    тип коробки передач в автомобиле
     * @param engineSize объем двигателя автомобиля в литрах
     */

    protected Car(String brand, String model, String color, String body,
               int wheels, String fuel, String gearbox, double engineSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.body = body;
        this.wheels = wheels;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.engineSize = engineSize;
    }

    /**
     * Приводит автомобиль в движение.
     */
    protected void drive() {
        System.out.println("The car is driving.");
    }

    /**
     * Выполняет сервисное обслуживание автомобиля.
     */
    protected void service() {
        System.out.println("The car is being serviced.");
    }

    /**
     * Переключает передачи в автомобиле.
     */
    protected void gearChange() {
        System.out.println("Gears have been changed.");
    }

    /**
     * Включает или выключает фары автомобиля.
     * Меняет состояние переменной lightsOn.
     */
    protected void headlightsSwitch() {
        if(!lightsOn) {
            System.out.println("The headlights have been turned on.");
            lightsOn = true;
        } else {
            System.out.println("The headlights have been turned off.");
            lightsOn = false;
        }
    }

    /**
     * Включает или выключает "дворники" автомобиля.
     * Меняет состояние переменной wipersOn.
     */

    protected void wipersSwitch() {
        if (!wipersOn) {
            System.out.println("The windshield wipers have been turned on.");
            wipersOn = true;
        } else {
            System.out.println("The windshield wipers have been turned off.");
            wipersOn = false;
        }

    }

}
