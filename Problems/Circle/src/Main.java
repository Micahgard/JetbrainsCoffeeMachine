class Circle {

    double radius;

    // write methods here
    public double getLength() {
        double circumference = 2 * radius * Math.PI;
        return circumference;
    }
    
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
}
