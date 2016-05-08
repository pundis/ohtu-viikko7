package ohtu.kivipaperisakset;

import ohtu.kivipaperisakset.tekoaly.Tuomari;
import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    private static final Scanner scanner = new Scanner(System.in);

    KPSPelaajaVsPelaaja() {
    }

    @Override
    public String annaTokanSiirto(String ekanSiirto) {
        System.out.println("Toisen pelaajan siirto: ");
        return new Scanner(System.in).nextLine();
    }
}