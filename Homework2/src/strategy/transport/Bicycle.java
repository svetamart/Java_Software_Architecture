package strategy.transport;

import strategy.iMovable;

public class Bicycle implements iMovable {
    final int speed = 15;
    @Override
    public void moveBy(int distance) {
        double time = (double) distance / speed;
        System.out.printf("На велосипеде до пункта назначения осталось %.2f часов \n", time);
    }
}
