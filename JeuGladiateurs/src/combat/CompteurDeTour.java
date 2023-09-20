package combat;

public class CompteurDeTour {

    // TODO : Mettre vos attributs ici
    int cptrTour;
    
    
    public CompteurDeTour() {
        // TODO : Constructeur SANS paramètres qui initialise un compteur de tour (attribut) à 1
        this.cptrTour = 1;
    }
   
    // TODO : Le getter
    public int getCptrTour(){
        return this.cptrTour;
    }
    // TODO : Le setter
    public void setCptrTour(int cptrTour){
        this.cptrTour = cptrTour;
    }

    public void augmenteTour() {
        // TODO : Incrémenter le compteur de tour
        this.cptrTour++;
    }

    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montré dans l'énoncé
        System.out.println("---------------");
        System.out.println("TOUR ACTUEL: "+ this.cptrTour);
        System.out.println("---------------");
    }

}
