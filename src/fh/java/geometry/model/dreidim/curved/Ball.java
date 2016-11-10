package fh.java.geometry.model.dreidim.curved;

/**
 * Created by CARI on 10.11.2016.
 */
public class Ball extends CurvedShape {

    private double radius;

    public Ball(int x, int y, int z, double radius) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4/3*Math.PI*radius*radius*radius);
    }

    @Override
    public double calculateSurfaceArea() {
        return (4*Math.PI*radius*radius);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ball ball = (Ball) o;

        return Double.compare(ball.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ball{");
        sb.append("radius").append(radius);
        sb.append(", volume=").append(calculateVolume());
        sb.append(", surface=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }

}
