package strategy;

public class Navigator {
    private int distance;
    private iMovable movable;

    public Navigator(int distance, iMovable movable) {
        this.distance = distance;
        this.movable = movable;
    }
    public void move () {

        movable.moveBy(distance);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public iMovable getMovable() {
        return movable;
    }

    public void setMovable(iMovable movable) {
        this.movable = movable;
    }
}
