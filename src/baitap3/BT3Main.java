/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author DangHoaiPhong
 */
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shape = new ShapeFactory();
        
        Shape rectangle = shape.createShape(ShapeType.rectangle);
        rectangle.setBrush("có bút");
        rectangle.setFrame("có khung");
        rectangle.setPaper("có giấy");
        System.out.println(rectangle.toString());
        
        Shape rectangle2 = shape.createShape(ShapeType.rectangle);
        rectangle2.setPaper("có giấy");
        System.out.println(rectangle.toString());   
        
        Shape circle = shape.createShape(ShapeType.circle);
        circle.setBrush("có bút");
        circle.setFrame("không có khung");
        circle.setPaper("có giấy");
        System.out.println(circle.toString());
        
        Shape triangle = Triangle.createInstance();
        triangle.setBrush("có bút");
        triangle.setFrame("có khung");
        triangle.setPaper("có giấy");
        System.out.println(circle.toString());
    }
    
}
