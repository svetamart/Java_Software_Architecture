package strategy.transport;

import strategy.iMovable;

public class OnFoot implements iMovable {
    final int speed = 5;
    @Override
    public void moveBy(int distance) {
        double time = (double) distance / speed;
        System.out.printf("Пешком до пункта назначения осталось %.2f часов \n", time);
    }
}
