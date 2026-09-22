public class Square extends Rectangle {

    public Square(double x, double y, double cote) {
        super(x, y, cote, cote);
    }

    @Override
    public String toString() {
        return "Square(x=" + getX()
            + ", y=" + getY()
            + ", nombreCotes=" + getNombreCotes()
            + ", cote=" + getLargeur() + ")";
    }
}