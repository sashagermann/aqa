package lesson_4.Geometry;

public abstract class Colors implements Figures {
    private String fillColor;
    private String borderColor;

    public Colors(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    public String getInfo() {
        return "\nПлощадь: " + getArea() + "\nПериметр: " +
                getPerimeter() + "\nЦвет фона: " + getFillColor() +
                "\nЦвет границы: " + getBorderColor();
    }
}
