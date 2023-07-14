import abstrct.Asset;
import abstrct.Car;
import abstrct.Computer;
import abstrct.Desk;
import disjoint.*;
import method.*;
import multiaspect.Meat;
import multiaspect.Product;
import multiaspect.Vegetable;
import overlapping.Figure;

import java.time.Duration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*
         * Dziedziczenie disjoint.
         *
         * Przypadek biznesowy: w systemie przechowujemy informacje nt. części
         * do roweru. Części można podzielić na ramę, koła, łańcuch, itp..
         */
        BikePart frame = new BikeFrame("Kross", 2021, FrameSize.LARGE);
        BikePart wheel = new BikeWheel("Mavic Axium", 2022, 27.5f);
        BikePart chain = new BikeChain("KMC", 2021, 121.0f);

        /*
         * Klasa abstrakcyjna.
         *
         * Przypadek biznesowy: w systemie przechowujemy informacje nt. zasobów firmowych.
         * Zasobem może być komputer, biurko, samochód itp.
         * Zasób sam w sobie nie może istnieć samodzielnie.
         */
        System.out.println("[*] Klasa abstrakcyjna");
        Asset car = new Car("Mitsubishi pajero", 2.4f);
        System.out.println(car);

        Asset computer = new Computer("Dell Inspiron", "Windows 11 64-bit");
        System.out.println(computer);

        Asset desk = new Desk("Biurko biurowe", 24);
        System.out.println(desk);

        /*
         * Przykład polimorficznego wywołania metody.
         * Metoda: getOrderValue()
         *
         * Przypadek biznesowy: W systemie przechowujemy dwa rodzaje zamówień:
         * zamówienia na produkty i zamówienia na usługi. Sposób obliczania kosztu
         * każdego rodzaju zamówienia jest inny.
         */
        System.out.println("[*] Polimorfizm metod");
        Order o1 = new ProductOrder(LocalDate.now(), 49.99f, 5);
        Order o2 = new ServiceOrder(LocalDate.of(2022,12,2), 30.25f, Duration.ofHours(8));

        System.out.println(o1.getOrderValue());
        System.out.println(o2.getOrderValue());

        /*
         * Dziedziczenie overlapping
         *
         * Opisujemy figury geometryczne: kwadrat, prostokąt, romb
         * Jest metoda abstrakcyjna pozwalająca na obliczenie pola figury
         */
        System.out.println("[*] Overlapping");
        // Tworzymy odpowiednią figurę wywołując właściwy konstruktor
        Figure square1 = new Figure("Kwadracik", 4.5f);
        Figure rectangle2 = new Figure("Prostokącik", 10.0f, 15.5f);
        Figure rhomb1 = new Figure("Rombek", 8, 3);

        try {
            System.out.println(square1.getArea());
            System.out.println(rectangle2.getArea());
            System.out.println(rhomb1.getArea());

//            System.out.println(square1.getRhombPerimeter());
            System.out.println(square1.getSideLength());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        /*
         * Dziedziczenie wieloaspektowe
         *
         * Na gruncie logiki biznesowej sklepu spożywczego:
         * Produkty spożywcze, można podzielić wg daty przydatności do spożycia
         * oraz na warzywa, owoce, i inne.
         *
         * Datę przydatności do spożycia umieszczamy jako atrybut w klasie Produkt
         */
        Product meat1 = new Meat("Mięso mielone", 12.50f, false, "Krowa");
        Product vegetable = new Vegetable("Pietruszka", 3.65f, true, "Bielsk Podlaski");
    }
}