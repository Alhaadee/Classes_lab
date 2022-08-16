public class Circle {
    private  double radius;
    public Circle(double newRadius){
        this.radius = newRadius;

    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius= " + this.radius + " Circumference=" +getCircumference() + "}";
    }

}
