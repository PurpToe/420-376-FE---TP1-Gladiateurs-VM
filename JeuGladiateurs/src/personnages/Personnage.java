package personnages;
import java.util.Random;

public class Personnage {

    // TODO : Mettre vos attributs ici
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;

    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        // TODO : Constructeur AVEC paramètres
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }

    public Personnage() {
        // TODO : Constructeur SANS paramètres qui initialise à ZÉRO ou à ""
        this.nom = "";
        this.pointsDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
    }

    // TODO : Les getters
    public String getNom() {
        return this.nom;
    }

    public int getPointsDeVie() {
        return this.pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return this.valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return this.valeurDefense;
    }

    public int getInitiative() {
        return this.initiative;
    }

// TODO : Les setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println("");
        System.out.println(this.nom);
        System.out.println("Attaque : " + this.valeurMaxAttaque);
        System.out.println("Defense : " + this.valeurDefense);
        System.out.println("Points de vie : " + this.pointsDeVie);
        System.out.println("Initiative : " + this.initiative);
        if (this.pointsDeVie > 0) {
            System.out.println("Statut : Vivant");
        }
        else {
            System.out.println("Statut : Mort");
        }
        System.out.println("");
    }

    private int attaqueCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        Random rand1 = new Random();
        return rand1.nextInt(this.valeurMaxAttaque + 1);
    }

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
        pointsDeVieCible = 0;
    }
    personnageCible.setPointsDeVie(pointsDeVieCible);
    
    System.out.println("");
    System.out.println(this.nom + " attaque " + personnageCible.getNom() + " avec une force de frappe de " + forceDeFrappe);
    System.out.println(personnageCible.getNom() + " a une defense de " + valeurDefenseCible);
    System.out.println("Les dommages sont donc de: " + dommages);
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        Random rand2 = new Random();
        this.initiative = rand2.nextInt(101);
    }
}
