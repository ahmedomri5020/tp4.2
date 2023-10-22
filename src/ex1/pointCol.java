package ex1;

import ex1.point;

public class pointCol extends point {
    private String couleur;


    pointCol(){
        super();
        couleur="";
    }
    pointCol(String couleur,char nom, int x,int y){
        super(nom,x,y);
        this.couleur=couleur;
    }
    void setcoleur(String couleur){
        this.couleur=couleur;
    }
    void afficher(){
        super.afficher();
        System.out.println(this.couleur);
    }


}
