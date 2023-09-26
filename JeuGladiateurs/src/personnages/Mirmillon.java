package personnages;

import java.util.Random;

public class Mirmillon extends Personnage {

    protected String classe;

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.classe = "Mirmillon";
    }

    public Mirmillon() {
        this.classe = "";
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
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

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        int forceDeFrappe = attaqueCalcul();
        int valeurDefenseCible = personnageCible.getValeurDefense();
        int dommages = forceDeFrappe - valeurDefenseCible;

        if (dommages < 0) {
            dommages = 0;
        }

        int pointsDeVieCible = personnageCible.getPointsDeVie() - dommages;
        if (pointsDeVieCible < 0) {

            personnageCible.setPointsDeVie(pointsDeVieCible);

            System.out.println("");
            System.out.println(this.nom + " attaque " + personnageCible.getNom() + " avec une force de frappe de " + forceDeFrappe);
            System.out.println(personnageCible.getNom() + " a une defense de " + valeurDefenseCible);
            System.out.println("Les dommages sont donc de: " + dommages);
            System.out.println(this.nom + " decapite " + personnageCible.getNom() + "!");
        } else {
            if (dommages < 0) {
                dommages = 0;
            }

            if (pointsDeVieCible < 0) {
                pointsDeVieCible = 0;
            }
            personnageCible.setPointsDeVie(pointsDeVieCible);

            System.out.println("");
            System.out.println(this.nom + " attaque " + personnageCible.getNom() + " avec une force de frappe de " + forceDeFrappe);
            System.out.println(personnageCible.getNom() + " a une defense de " + valeurDefenseCible);
            System.out.println("Les dommages sont donc de: " + dommages);

            if (dommages < 0) {
                dommages = 0;
            }

            if (pointsDeVieCible < 0) {
                pointsDeVieCible = 0;
            }
            personnageCible.setPointsDeVie(pointsDeVieCible);

            System.out.println("");
            System.out.println(this.nom + " attaque " + personnageCible.getNom() + " avec une force de frappe de " + forceDeFrappe);
            System.out.println(personnageCible.getNom() + " a une defense de " + valeurDefenseCible);
            System.out.println("Les dommages sont donc de: " + dommages);
        }
        // sur l'attaque, tel que montré dans l'énoncé.
    }
    
    @Override
    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        Random rand2 = new Random();
        this.initiative = rand2.nextInt(101);
    }
}


