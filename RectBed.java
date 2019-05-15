package garden_planner.model;

public  class RectBed extends GardenBed {
	private double width = 1.0;
	private double height = 1.0;

	public RectBed(String Rectangle) {
	}

    public RectBed() {

    }

	@Override
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public double getDiameter() {
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Rectangle %.2f %.2f %.2f %.2f", left, top, width, height);
	}
}
