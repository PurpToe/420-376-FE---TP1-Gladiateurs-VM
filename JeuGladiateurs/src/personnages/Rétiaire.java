package personnages;

import java.util.Random;

public class Rétiaire extends Personnage {

    protected String classe;

    public Rétiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.classe = "Rétiaire";
    }

    public Rétiaire() {
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

    public boolean Filet = true;

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        int forceDeFrappe = attaqueCalcul();
        int valeurDefenseCible = personnageCible.getValeurDefense();
        int dommages = forceDeFrappe - valeurDefenseCible;

        if (Filet) {

            System.out.println(this.nom + " lance son filet.");

            Random rand = new Random();
            boolean reussiFilet = rand.nextDouble() <= 0.1;

            if (reussiFilet) {
                System.out.println("Son filet attrape Bob le malchanceux et il l’empale sauvagement avec sa lance");
                personnageCible.setPointsDeVie(0);

            } else {
                System.out.println("Le filet n'atteint pas sa cible");
                Filet = false;
            }
        } else {
            System.out.println(this.nom + " ramasse son filet en profite pour attaquer.");
            
            Filet = true;
            
            if (dommages < 0) {
                dommages = 0;
            }

            int pointsDeVieCible = personnageCible.getPointsDeVie() - dommages;
            if (pointsDeVieCible < 0) {
                pointsDeVieCible = 0;
            }
            personnageCible.setPointsDeVie(pointsDeVieCible);

            System.out.println("");
            System.out.println(this.nom + " attaque " + personnageCible.getNom() + " avec une force de frappe de " + forceDeFrappe);
            System.out.println(personnageCible.getNom() + " a une defense de " + valeurDefenseCible);
            System.out.println("Les dommages sont donc de: " + dommages);
        }

    }
}
