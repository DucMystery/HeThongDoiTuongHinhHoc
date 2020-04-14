public class Shape {

    String color;
    boolean filled;

    public Shape(){
        this.color ="green";
        this.filled = true;
    }

    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public Shape setColor(String color) {
        this.color = color;
        return this;
    }

    public boolean isFilled() {
        return filled;
    }

    public Shape setFilled(boolean filled) {
        this.filled = filled;
        return this;
    }

    public String toString(){
        return "A shape with color of "+this.color+"and "+(filled==false?"not fill":"filled with"+this.filled);
    }
}
