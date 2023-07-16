package strategy.transport;

import strategy.iMovable;

public class Car implements iMovable {
    final int speed = 60;
    @Override
    public void moveBy(int distance) {
        double time = (double) distance / speed;
        System.out.printf("На машине до пункта назначения осталось %.2f часов \n", time);
    }
}
