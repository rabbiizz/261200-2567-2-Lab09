package OCP;

public class Ellipse extends Shape {
    private double major;
    private double minor;

    public Ellipse(double major, double minor){
        if(major > minor) {
            this.major = major;
            this.minor = minor;
        }else {
            throw new IllegalArgumentException("Major axis must be greater than minor axis.");
        }

    }
    public double getMajor() {
        return major;
    }

    public double getMinor() {
        return minor;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.major * this.minor;
    }
}