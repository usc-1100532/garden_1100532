package garden_planner.model;

public abstract class GardenBed {
    protected double left = 0.0;
    protected double top = 0.0;

       public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

     public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public abstract double getWidth();

    public abstract double getHeight();

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double getDiameter();
}

}

