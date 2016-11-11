package fh.java.geometry.model.dreidim.pyramidal;

/**
 * Created by CARI on 10.11.2016.
 */
public class QuadrPyramid extends PyramidalShape {
    private double sideA;
    private double height;

    public QuadrPyramid(int x, int y, int z, double sideA, double height) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.sideA = sideA;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0/3.0*(sideA*sideA*height));
    }

    @Override
    public double calculateSurfaceArea() {
        return (sideA*sideA)+(4*(sideA*height/2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        QuadrPyramid that = (QuadrPyramid) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        return Double.compare(that.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("QuadrPyramid{");
        sb.append("sideA=").append(sideA);
        sb.append(", height=").append(height);
        sb.append(", volume=").append(calculateVolume());
        sb.append(", surface=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }

}
