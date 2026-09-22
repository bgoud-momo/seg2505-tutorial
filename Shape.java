public abstract class Shape {
    private double x;
    private double y;

    public Shape(double x, double y){
        setX(x);
        setY(y);
    }

    public double getX(){
       return x;
    }
    public double getY(){
       return y;
    }

    public void setX(double x){
       this.x = x;
    }
    public void setY(double y){
       this.y = y;
    }
    public void translate(double tx, double ty){
        this.x += tx;
        this.y += ty;
    }

    public abstract void rotate(double angle);

   @Override
   public String toString() {
      return "x=" + x + ", y=" + y;
   }
}
