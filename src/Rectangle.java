public class Rectangle {

    protected int length;

    protected int width;

    public Rectangle (int length, int width) {
        this.width = width;
        this.length = length;
    }


    public int getArea() {
        return this.width * this.length;
    }


    public int getLength() {
        return this.length;
    }


    public int getPerimeter() {
        return 2 * (width + length);
    }


    public int getWidth() {
        return this.width;
    }


    public void setLength(int length) {
        this.length = length;
    }


    public void setWidth(int width) {
        this.width = width;
    }

}
