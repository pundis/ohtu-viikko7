package ohtu.kivipaperisakset;


import java.util.Scanner;
import ohtu.kivipaperisakset.tekoaly.Tekoaly;
import ohtu.kivipaperisakset.tekoaly.TekoalyParannettu;

public class KPSParempiTekoaly extends KPS {

    private static final Scanner scanner = new Scanner(System.in);
    private Tekoaly tekoaly = new TekoalyParannettu(20);

    public String annaTokanSiirto(String ekanSiirto) {
        String siirto = tekoaly.annaSiirto(ekanSiirto);
        System.out.println("Vastustajan siirto: " +siirto);
        return siirto;
    }
}
