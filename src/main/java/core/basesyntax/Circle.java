package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.setRadius();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toDraw() {
        return " Figure: circle, area: " + getArea()
                + "sq.units, radius: " + getRadius()
                + "units, color: " + getColor();
    }
}