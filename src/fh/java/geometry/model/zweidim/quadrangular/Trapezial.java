package fh.java.geometry.model.zweidim.quadrangular;

/**
 * Created by CARI on 10.11.2016.
 */
public class Trapezial extends QuadrangularShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double height;

    public Trapezial(int x, int y, double sideA, double sideB, double sideC, double sideD, double height) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (sideA+sideC/2*height);
    }

    @Override
    public double calcPerimeter() {
        return (sideA+sideB+sideC+sideD);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Trapezial trapezial = (Trapezial) o;

        if (Double.compare(trapezial.sideA, sideA) != 0) return false;
        if (Double.compare(trapezial.sideB, sideB) != 0) return false;
        if (Double.compare(trapezial.sideC, sideC) != 0) return false;
        if (Double.compare(trapezial.sideD, sideD) != 0) return false;
        return Double.compare(trapezial.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideD);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trapezial{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideC=").append(sideC);
        sb.append(", sideD=").append(sideD);
        sb.append(", height=").append(height);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }


}
