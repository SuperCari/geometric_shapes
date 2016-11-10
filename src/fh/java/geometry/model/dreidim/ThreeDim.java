package fh.java.geometry.model.dreidim;

import fh.java.geometry.model.GeometricShape;

/**
 * Created by CARI on 10.11.2016.
 */
public abstract class ThreeDim extends GeometricShape {

    protected int z;

    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();








}
