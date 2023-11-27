public class Circle extends GeometricObject{
    protected double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double getArea(){
        double area = Math.PI*this.radius*this.radius;
        return area;
    };
    public double getPerimeter(){
        double peri = Math.PI*2*this.radius;
        return peri;
    }
    public String getShape(){
        return "Circle";
    }

}
