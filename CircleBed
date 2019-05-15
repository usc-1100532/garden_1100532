package garden_planner.model;

public class CircleBed extends GardenBed {
    private double Diameter;
    private String color;

    public CircleBed(String Circle) {
    }

    public CircleBed(double d) {
        this.Diameter = d;
        color = "red";
    }

    public void setDiameter (double d) {
        this.Diameter = d;
    }

    public double getDiameter()
    {return
            this.Diameter;}

    @Override
    public double getWidth() {
        return Diameter;
    }

    @Override
    public double getHeight() {
        return Diameter;
    }

    @Override
    public double getArea() {
        return Diameter*Math.PI;
    }
    
    @Override
    public double getPerimeter() {
        return 2*Diameter*Math.PI;
    }  
    @Override
    public String toString() {
        return String.format("Circle %.2f %.2f %.2f ", left, top, Diameter);
}
}
