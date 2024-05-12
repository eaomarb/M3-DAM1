package Box;

class Box {
    private double width;
    private double height;
    private double length;

    Box(double width, double height, double length) {
        setWidth(width);
        setHeight(height);
        setLength(length);
    }

    double volume() {
        return getWidth() * getHeight() * getLength();
    }

    double area() {
        return (2 * getLength() * getWidth()) + (2 * getLength() * getHeight()) + (2 * getWidth() * getHeight());
    }

    public Box biggerBox(Box oldBox) {
        return new Box(1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength());
    }

    public Box smallerBox(Box oldBox) {
        return new Box(0.75 * oldBox.getWidth(), 0.75 * oldBox.getHeight(), 0.75 * oldBox.getLength());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }
}
