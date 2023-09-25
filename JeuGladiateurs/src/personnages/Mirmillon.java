/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Random;

public class Mirmillon extends Personnage {

    protected String classe;

    public Mirmillon(String classe, String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    public Mirmillon() {
        this.classe = "";
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("Classe :" + this.classe);
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        Random rand1 = new Random();
        return rand1.nextInt(this.valeurMaxAttaque + 1);
    }

}
