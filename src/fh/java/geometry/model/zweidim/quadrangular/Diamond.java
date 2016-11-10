package fh.java.geometry.model.zweidim.quadrangular;

/**
 * Created by CARI on 10.11.2016.
 */
public class Diamond extends QuadrangularShape {
    private double sideA;
    private double diameterE;
    private double diameterF;

    public Diamond(int x, int y, double sideA, double diameterE, double diameterF) {
        this.x=x;
        this.y=y;
        this.sideA = sideA;
        this.diameterE = diameterE;
        this.diameterF = diameterF;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getDiameterE() {
        return diameterE;
    }

    public void setDiameterE(double diameterE) {
        this.diameterE = diameterE;
    }

    public double getDiameterF() {
        return diameterF;
    }

    public void setDiameterF(double diameterF) {
        this.diameterF = diameterF;
    }

    @Override
    public double calcArea() {
        return (diameterE*diameterF/2);
    }

    @Override
    public double calcPerimeter() {
        return (sideA*4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Diamond diamond = (Diamond) o;

        if (Double.compare(diamond.sideA, sideA) != 0) return false;
        if (Double.compare(diamond.diameterE, diameterE) != 0) return false;
        return Double.compare(diamond.diameterF, diameterF) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameterE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameterF);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diamond{");
        sb.append("sideA=").append(sideA);
        sb.append(", diameterE=").append(diameterE);
        sb.append(", diameterF=").append(diameterF);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }






}
