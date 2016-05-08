package ohtu.kivipaperisakset.tekoaly;

public class TekoalyHelppo extends Tekoaly {

    int siirto;

    public TekoalyHelppo() {
        siirto = 0;
    }

    @Override
    public String annaSiirto(String ekans) {
        siirto++;
        siirto = siirto % 3;

        if (siirto == 0) {
            return "k";
        } else if (siirto == 1) {
            return "p";
        } else {
            return "s";
        }
    }

    void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
