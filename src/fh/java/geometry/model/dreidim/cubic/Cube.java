package fh.java.geometry.model.dreidim.cubic;

/**
 * Created by CARI on 10.11.2016.
 */
public class Cube extends CubicShape {

    private double sideA;

    public Cube(int x, int y, int z, double sideA) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calculateVolume() {
        return (sideA*sideA+sideA);
    }

    @Override
    public double calculateSurfaceArea() {
        return (sideA*6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cube cube = (Cube) o;

        return Double.compare(cube.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cube{");
        sb.append("sideA=").append(sideA);
        sb.append(", volume=").append(calculateVolume());
        sb.append(", surface=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }

}
