    import java.awt.*;

    public class point {
        int abscisse;
        int ordonnée;
        char name;
        point  (char nom, int x,int y){
            this.name=nom;
            this.abscisse=x;
            this.ordonnée=y;
        }
        point (){
            name='l';
            abscisse=0;
            ordonnée=0;
        }
        point (point J){
            name=J.name;
            abscisse=J.abscisse;
            ordonnée=J.ordonnée;
        }
        void afficher(){
            System.out.println(name + "(" +abscisse + "," + ordonnée + ")");

        }
        void deplacer(int a,int b){
            abscisse=abscisse+a;
            ordonnée=ordonnée+b;

        }
        void reset(){
            abscisse=0;
            ordonnée=0;
        }
        public String toString() {
            return name+"("+abscisse+","+ordonnée+")";
        }
        boolean concide_v1(point p){
            return this.abscisse==p.abscisse && this.ordonnée==p.ordonnée;
        }
        static boolean concide_v2(point p1,point p2){
            return p1.abscisse==p2.abscisse && p1.ordonnée==p2.ordonnée;

        }
    }
