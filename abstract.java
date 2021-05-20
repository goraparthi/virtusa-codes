public abstract class Shape{
    String color;
    double area;
    abstract public double calculateArea(int r);
    public void setColor(String color){
    this.color=color;
    
}
}

 

class Circle extends Shape{
    public double calculateArea(int r){
        area=3.14*r*r;
        return area;
    }
    
}

 

class Square extends Shape{
    public double calculateArea(int r){
        area=r*r;
        return area;
    }
    
}

 

class AbstractDemo{
    public static void main(String a[]){
    Circle c=new Circle();
    c.calculateArea(5);
    c.setColor("red");
    System.out.println(c.color+"    "+c.area);
    Square s=new Square();
    s.calculateArea(4);
    s.setColor("green");
    System.out.println(s.color+"    "+s.area);
}
}
