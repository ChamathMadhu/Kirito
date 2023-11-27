import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection{
    private ArrayList<GeometricObject> shapeList;
    private int numObject;
    public GeometricShapeCollection(int listLength){
        this.numObject=listLength;
        shapeList= new ArrayList<GeometricObject>();
    }
    public void addShape(GeometricObject shape){
        //check if there are space and add the shape to the list
        if (shapeList.size()<numObject){
            shapeList.add(shape);
        }
        else {
            System.out.println("No more space in the list");
        }
    }
    public void printShapeList(){
        for (int i=0;i<shapeList.size();i++){
            if (shapeList.get(i).getShape().equals("Circle")){
                System.out.println("Shape= Circle, Area= "+
                        shapeList.get(i).getArea()+", Perimeter= "+
                        shapeList.get(i).getPerimeter());
            }
        }
    }
    public boolean runMenu(){
        boolean exit = false;
        System.out.println("To Add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        Scanner s = new Scanner(System.in);
        int choise = s.nextInt();

        switch (choise){
            case 1:
                System.out.println("Press 1 if you want to add a Circle");
                System.out.println("Press 2 if you want to add a Rectangle");
                System.out.println("Press 3 if you want to add a Square");

                int choise2 = s.nextInt();
                s.nextLine();

                System.out.println("Enter the color of your shape");
                String color = s.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = s.nextLine();
                boolean filled = false;

                if (isFilled.equals("y")){
                    filled=true;
                } else if (isFilled.equals("n")) {
                    filled=false;
                }else {
                    System.out.println("Please enter y or n, if the shaped" +
                            " is filled or not respectively");
                }

                switch (choise2){
                    case 1:
                        //it is a circle
                        System.out.println("Insert the radius");
                        int radius = s.nextInt();
                        Circle c = new Circle(radius,color,filled);
                        this.addShape(c);
                        break;

                    case 2:
                        System.out.println("Insert the length");
                        int length = s.nextInt();
                        System.out.println("Insert the width");
                        double width = s.nextInt();
                        Rectangle r = new Rectangle(length, width, color, filled);

                    case 3:
                        System.out.println("Insert the length of a side");
                        int sid = s.nextInt();
                        Square s1 = new Square(sid, color, filled);
                }
                break;

            case 2:
                this.printShapeList();
                break;

            case 3:
                exit=true;
                break;
        }
        return exit;
    }
}
