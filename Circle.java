public class Circle extends Shape{
    private double rayon;

    public Circle (double x, double y, double rayon){
        super(x, y);
        setRayon(rayon);
    }

    public double getRayon(){
       return rayon;
    }

    public void setRayon(double rayon){
        if (rayon <= 0) {
            throw new IllegalArgumentException("Le rayon doit etre superieur a 0");
        }
        this.rayon = rayon;
    }    

    @Override
    public void rotate(double angle){

    }
} 
