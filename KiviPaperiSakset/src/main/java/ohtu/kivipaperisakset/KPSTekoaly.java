package ohtu.kivipaperisakset;

import java.util.Scanner;
import ohtu.kivipaperisakset.tekoaly.Tekoaly;
import ohtu.kivipaperisakset.tekoaly.TekoalyHelppo;

public class KPSTekoaly extends KPS {

    private static final Scanner scanner = new Scanner(System.in);
    private Tekoaly tekoaly = new TekoalyHelppo();

    KPSTekoaly() {

    }

    public String annaTokanSiirto(String ekansiirto) {
        String siirto = tekoaly.annaSiirto(ekansiirto);
        System.out.println("Vastustajan siirto: " +siirto);
        return siirto;
    }
}   