public class Main {
    public static void main (String[] args){
        DrawingBoard board = new DrawingBoard();
        
            for (int i = 0; i < 10; i++) {
                Shape shape;
                switch (i%4) {
                case 0: 
                    shape = new Circle(i,i,i+5);
                    break;
                case 1: 
                    shape = new Rectangle (i,i,i+10,i+5);
                    break;
                case 2:
                    shape = new Square(i,i,i+5);
                    break;
                case 3:
                    shape = new Triangle(i,i);
                    break;
                default:
                    throw new IllegalStateException("Valeur inattendue");
            }
            board.addShape(shape);
        }
        System.out.println(board);
    }
}
