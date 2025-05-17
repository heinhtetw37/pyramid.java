public class Triangle {
    private double base;
    private double height;

    public Triangle(){
        base = height = 0;
    }
    public Triangle(double a) throws Exception{
        this.setBase(a);
        this.setHeight(a);
    }
    public Triangle(double a, double b) throws Exception{
        this.setBase(a);
        this.setHeight(b);
    }
    public Triangle(Triangle t){
        try {
            this.setBase(t.getBase());
            this.setHeight(t.getHeight());
        }catch(Exception e){
            //this should never happen because t is a triangle
        }
    }
    public double getBase() {
        return base;
    }
    //throw a checked exception in case the base is negative
    public void setBase(double base) throws Exception{
        if(base < 0){
            throw new Exception("Base cannot be negative");
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double h)throws Exception {
        if(h < 0){
            throw new Exception("height cannot be negative");
        }
        this.height = h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.base, base) == 0 && Double.compare(triangle.height, height) == 0;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
    public double area(){
        return (0.5)*base*height;
    }
    public Triangle add(Triangle t){
        try {
            return new Triangle(this.base + t.base, (this.height + t.height) / 2.0);
        }catch(Exception e){
            System.out.println("this shold never happen!!!");
            return null;
        }
    }
    public static Triangle add(Triangle t1, Triangle t2){
        try {
            return new Triangle(t1.base + t2.base, (t1.height + t2.height) / 2.0);
        }catch(Exception e){
            System.out.println("this shold never happen!!!");
            return null;
        }
    }
}
