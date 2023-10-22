package ex2;

public class testHeritage {
    public static void main(String[] args) {
        animal[] T = new animal[3];
        T[0] = new animal("noir", 25);
        T[1] = new chat("blanc", 5, "Siamois");
        T[2] = new chien("marron", 15, "Labrador");

        for (animal animal : T) {
            animal.decrisToi();
            animal.manger();
            animal.boire();
            animal.crier();
            if (animal instanceof animal) {
                System.out.println("animal inconnue");
            }
        }
    }
}
}
