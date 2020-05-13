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
public class Circle extends Shape{

    private static Circle circle;
    
    @Override
    public String Draw() {
        return "Vẽ hình tròn";
    }
    
    protected Circle() {
        
    }

    protected Circle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }
    
    public static Circle createInstance() {
        if (circle == null) {
            circle = new Circle();
        }
        return circle;
    }
}
