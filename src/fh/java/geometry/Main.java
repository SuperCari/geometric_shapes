package fh.java.geometry;


import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.dreidim.cubic.Cube;
import fh.java.geometry.model.dreidim.curved.Ball;
import fh.java.geometry.model.dreidim.pyramidal.QuadrPyramid;
import fh.java.geometry.model.zweidim.quadrangular.Diamond;
import fh.java.geometry.model.zweidim.quadrangular.Trapezial;
import fh.java.geometry.model.zweidim.triangular.RightTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CARI on 10.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.doIT();
    }

    private void doIT() {
        double area;
        double peri;
        double volume;
        double surface;
        List<GeometricShape> shapeListTwoDim = new ArrayList();
        List<GeometricShape> shapeListThreeDim = new ArrayList();
        fillListTwoDim(shapeListTwoDim);
        fillListThreeDim(shapeListThreeDim);
        //printList(shapeListThreeDim);
        //printList(shapeListTwoDim);
        area = sumArea(shapeListTwoDim);
        peri = sumPeri(shapeListTwoDim);
        volume = sumVol(shapeListThreeDim);
        surface = sumSurface(shapeListThreeDim);
        System.out.format("The area of the 2-dimensional shapes is %.2f%n",area);
        System.out.format("The perimeter of the 2-dimensional shapes is %.2f%n",peri);
        System.out.format("The volume of the 3-dimensional shapes is %.2f%n",volume);
        System.out.format("The surface of the 3-dimensional shapes is %.2f%n",surface);

    }
    public double sumArea(List<GeometricShape> shapeList){
        double area =0;
        for (GeometricShape geometricShape : shapeList) {
            if (geometricShape instanceof RightTriangle){
                area+=((RightTriangle) geometricShape).calcArea();
            }
            if (geometricShape instanceof Diamond){
                area+=((Diamond) geometricShape).calcArea();
            }
            if (geometricShape instanceof Trapezial){
                area+=((Trapezial) geometricShape).calcArea();
            }
        }
        return area;
    }
    public double sumPeri(List<GeometricShape> shapeList){
        double peri =0;
        for (GeometricShape geometricShape : shapeList) {
            if (geometricShape instanceof RightTriangle){
                peri+=((RightTriangle) geometricShape).calcPerimeter();
            }
            if (geometricShape instanceof Diamond){
                peri+=((Diamond) geometricShape).calcPerimeter();
            }
            if (geometricShape instanceof Trapezial){
                peri+=((Trapezial) geometricShape).calcPerimeter();
            }
        }
        return peri;
    }
    public double sumVol(List<GeometricShape> shapeList){
        double vol = 0;
        for (GeometricShape shape : shapeList) {
            if (shape instanceof Ball){
                vol+=((Ball) shape).calculateVolume();
            }
            if (shape instanceof QuadrPyramid){
                vol+=((QuadrPyramid) shape).calculateVolume();
            }
            if (shape instanceof Cube){
                vol+=((Cube) shape).calculateVolume();
            }
        }
        return vol;
    }

    public double sumSurface(List<GeometricShape> shapeList){
        double surface = 0;
        for (GeometricShape shape : shapeList) {
            if (shape instanceof Ball){
                surface+=((Ball) shape).calculateSurfaceArea();
            }
            if (shape instanceof QuadrPyramid){
                surface+=((QuadrPyramid) shape).calculateSurfaceArea();
            }
            if (shape instanceof Cube){
                surface+=((Cube) shape).calculateSurfaceArea();
            }
        }
        return surface;

    }



    public void fillListTwoDim(List<GeometricShape> shapeList) {
        //TODO: Implement
        shapeList.add(new RightTriangle(1,2,3.0,4.0));
        shapeList.add(new RightTriangle(3,5,6.0,3.0));
        shapeList.add(new RightTriangle(1,4,6.0,2.0));

        shapeList.add(new Diamond(1,2,3.3,4.4,5.5));
        shapeList.add(new Diamond(2,5,6.3,3.4,5.5));
        shapeList.add(new Diamond(1,2,3.3,4.4,5.5));

        shapeList.add(new Trapezial(3,4,2.2,3.5,8.4,2.8,6.9));
        shapeList.add(new Trapezial(2,4,7.9,4.5,2.2,2.2,3.9));
        shapeList.add(new Trapezial(6,1,1.2,8.5,9.3,2.2,8.9));

    }

    public void fillListThreeDim(List<GeometricShape>shapeList){
        shapeList.add(new Ball(2,3,4,3.0));
        shapeList.add(new Ball(4,2,4,6.0));
        shapeList.add(new Ball(2,5,4,2.0));

        shapeList.add(new QuadrPyramid(2,3,4,2.2,4.0));
        shapeList.add(new QuadrPyramid(2,3,4,2.2,6.0));
        shapeList.add(new QuadrPyramid(2,3,4,2.2,2.0));

        shapeList.add(new Cube(4,4,4,4.0));
        shapeList.add(new Cube(4,4,4,2.0));
        shapeList.add(new Cube(4,4,4,8.0));

    }

    public void printList(List<GeometricShape> shapeList) {


        shapeList
                .stream()
                .forEach(System.out::println);


    }



}
