public abstract class GeometricObject {
    protected boolean filled;
    protected String color;
    public GeometricObject(){}
    public GeometricObject(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public String toString(){
        return "color is"+getFilled()+" filled: "+getFilled();
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getShape();
    public static void main(String[] args) {
        //create a parking
        ShapeCollection sys = new GeometricShapeCollection(10);
        boolean exit = false;

        while (!exit){
            exit = sys.runMenu();
        }
    }
}