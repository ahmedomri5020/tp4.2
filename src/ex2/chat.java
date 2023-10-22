package ex2;

public class chat extends animal {
    private String race;

    chat() {

    }

    chat(String couleur, int poids, String race) {
        super(couleur, poids);
        this.race = race;
    }
}
