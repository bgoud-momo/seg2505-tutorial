import java.util.ArrayList;

public class DrawingBoard {
    private ArrayList<Shape> shapes;
    
    public DrawingBoard (){
        shapes = new ArrayList<Shape>();
    }
    public void addShape (Shape shape){
        this.shapes.add(shape);
    }
    public ArrayList<Shape> getShapes (){
        return shapes;
    }
}
