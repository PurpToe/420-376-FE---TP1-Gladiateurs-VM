package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {
//Ceci est un gentil commentaire

    public static void main(String[] args) {

        // *************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Personnage Bob = new Personnage("Bob le malchanceux", 15, 15, 70, 15);
        Personnage Igor = new Personnage("Igor l'empaleur", 25, 5, 100, 30);

        // TODO : Afficher les infos de chaque personnage
        affichage.afficherSeparateurInfosPerso();
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        
        // TODO : Afficher le message du début du combat
        affichage.afficherDebutCombat();

        // TODO : La boucle contenant les étapes du combat
        while (Bob.getPointsDeVie() > 0 && Igor.getPointsDeVie() > 0) {
            
            tour.afficheTour();
            
            if (Bob.getInitiative() > Igor.getInitiative()) {
                Bob.frapperPersonnage(Igor);
                Igor.frapperPersonnage(Bob);
            } else {
                Igor.frapperPersonnage(Bob);
                Bob.frapperPersonnage(Igor);
            }
            
        affichage.afficherSeparateurInfosPerso();
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        
        Bob.setNewInitiativeRandom();
        Igor.setNewInitiativeRandom();
        
        tour.augmenteTour();
        
        affichage.afficherSeparateurDeTour();
            
        }
        // TODO : Après la boucle, afficher le résultat du combat
        // </editor-fold>
    }

}
