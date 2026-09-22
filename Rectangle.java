public class Rectangle extends Polygon{
    private double largeur;
    private double hauteur;
    public Rectangle(double x, double y, double largeur, double hauteur){
        super(x, y, 4);
        this.largeur = largeur;
        this.hauteur = hauteur; 
    }
    public double getLargeur(){
        return largeur;
    }
    public double getHauteur(){
        return hauteur;
    }
    @Override
    public void rotate (double angle){}
}
