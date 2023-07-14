package overlapping;

import helpers.*;

public class Figure extends ObjectPlusPlus {
    private String name;

    public Figure(String name) {
        super();
        this.name = name;
    }

    // Figura jako kwadrat
    public Figure(String name, float sideLength) {
        super();
        this.name = name;

        // "Zmiana" figury w kwadrat
        this.addSquare(sideLength);
    }

    public Figure(String name, float longSide, float shortSide){
        super();
        this.name = name;

        this.addRectangle(longSide, shortSide);
    }

    public Figure (String name, int diagonal1, int diagonal2){
        super();
        this.name = name;

        this.addRhomb(diagonal1, diagonal2);
    }

    public void addSquare(float sideLength) {
        // Stworzenie nowej "części"
        Square sq = new Square(this.name, sideLength);

        // Dodanie połączenia z częścią
        this.addLink(roleNameSquare, roleNameGeneralization, sq);
    }

    public void addRectangle(float side1, float side2){
        Rectangle r = new Rectangle(this.name, side1, side2);
        this.addLink(roleNameRectangle, roleNameGeneralization, r);
    }

    public void addRhomb(int d1, int d2){
        Rhomb rh = new Rhomb(this.name, d1, d2);
        this.addLink(roleNameRhomb, roleNameGeneralization, rh);
    }

    public float getArea() throws Exception {
        float area = 0.0f;

        // Kwadrat
        if (this.anyLink(roleNameSquare)){
            ObjectPlusPlus[] obj = this.getLinks(roleNameSquare);
            area += ((Square) obj[0]).getArea();
        }

        // Prostokąt
        if (this.anyLink(roleNameRectangle)){
            ObjectPlusPlus[] obj = this.getLinks(roleNameRectangle);
            area += ((Rectangle) obj[0]).getArea();
        }

        // Romb
        if (this.anyLink(roleNameRhomb)){
            ObjectPlusPlus[] obj = this.getLinks(roleNameRhomb);
            area += ((Rhomb) obj[0]).getArea();
        }

        return area;
    }

    private final static String roleNameSquare = "specializationSquare";
    private final static String roleNameRectangle = "specializationRectangle";
    private final static String roleNameRhomb = "specializationRhomb";
    private final static String roleNameGeneralization = "generalizationFigure";

    public float getSideLength() throws Exception {
        try {
            ObjectPlusPlus[] obj = this.getLinks(roleNameSquare);
            return ((Square) obj[0]).getSideLength();
        } catch (Exception ex) {
            throw new Exception("To nie jest kwadrat");
        }
    }

    public float getRectanglePerimeter() throws Exception{
        try {
            ObjectPlusPlus[] obj = this.getLinks(roleNameRectangle);
            return ((Rectangle) obj[0]).getPerimeter();
        } catch (Exception ex){
            throw new Exception("To nie jest prostokąt");
        }
    }

    public double getRhombPerimeter() throws Exception {
        try {
            ObjectPlusPlus[] obj = this.getLinks(roleNameRhomb);
            return ((Rhomb) obj[0]).getPerimeter();
        } catch (Exception ex) {
            throw new Exception("To nie jest romb");
        }
    }

}
