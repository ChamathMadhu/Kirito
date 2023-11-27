public class Rectangle extends GeometricObject {
    protected double length;
    protected double width;
    @Override
    public double getPerimeter(){
        return (this.length*2)+(this.width*2);
    }
    public double getArea(){
        return this.length*this.width;
    }
    public String getShape(){
        return "Rectangle";
    }
    public String toString(){
        return "color is: "+this.color+" filled: "+this.filled;
    }
    public Rectangle(){}
    public Rectangle(double length, double width){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double length, double width, String color,boolean filled){
        this.length=length;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
}
