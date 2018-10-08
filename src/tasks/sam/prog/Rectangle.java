package tasks.sam.prog;

public class Rectangle {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea(int width, int height){
        int area = width * height;
        return area;
    }
    public int getPerimeter(int width, int height){
        int perimeter = width * 2 + height * 2;
        return perimeter;
    }
    public double getDiagonal(int width, int height){
        double t = (width * width) + (height*height);
        double diagonal = Math.sqrt(t);
        return diagonal;
    }
}
