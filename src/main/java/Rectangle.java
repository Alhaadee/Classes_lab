public class Rectangle {
    private float length;

    private float width;

    public Rectangle(float newLength, float newWidth){
        this.length = newLength;
        this.width = newWidth;


    }

//  overriding to string()
    @Override
    public String toString(){
        return "Rectangle length: " + getLength() + " width: " + getWidth() + "\n"
                + "Perimeter: " + getPerimeter() + " Area: " + getArea() +"\n"
                + "Diagonal: " + getDiagonal();
    }


//    GET AND SET METHODS
    public float getLength(){
        return this.length;
    }
    public float getWidth(){
        return this.width;
    }
    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }

//    NOVEL METHODS

    public double getPerimeter(){
        return (this.length*2)+(this.width*2);
    }

    public double getArea(){
        return length * width;
    }

    public double getDiagonal(){
        return Math.sqrt((length*length) + (width*width));
    }

}
