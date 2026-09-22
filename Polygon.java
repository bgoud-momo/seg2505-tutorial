public abstract class Polygon extends Shape{
    private int nombreCotes;
    public Polygon(double x, double y, int nombreCotes){
        super(x, y);
        this.nombreCotes = nombreCotes;
    }
    public int getNombreCotes(){
        return nombreCotes;
    }
}
