package ex2;

public class chien extends animal {
    private String race;

    chien() {

    }

    chien(String couleur, int poids, String race) {
        super(couleur, poids);
        this.race = race;
    }
}
