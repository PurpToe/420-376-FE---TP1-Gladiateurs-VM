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
        Personnage personnage1 = new Personnage("Bob le malchanceux", 15, 15, 70, 15);
        Personnage personnage2 = new Personnage("Igor l'empaleur", 25, 5, 100, 30);

        // TODO : Afficher les infos de chaque personnage
        affichage.afficherSeparateurInfosPerso();
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();
        
        // TODO : Afficher le message du début du combat
        affichage.afficherDebutCombat();

        // TODO : La boucle contenant les étapes du combat
        while (personnage1.getPointsDeVie() > 0 && personnage2.getPointsDeVie() > 0) {
            
            tour.afficheTour();
            
            if (personnage1.getInitiative() > personnage2.getInitiative()) {
                personnage1.frapperPersonnage(personnage2);
                personnage2.frapperPersonnage(personnage1);
            } else {
                personnage2.frapperPersonnage(personnage1);
                personnage1.frapperPersonnage(personnage2);
            }
            
        affichage.afficherSeparateurInfosPerso();
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();
        
        personnage1.setNewInitiativeRandom();
        personnage2.setNewInitiativeRandom();
        
        tour.augmenteTour();
        
        affichage.afficherSeparateurDeTour();
            
        }
        // TODO : Après la boucle, afficher le résultat du combat
        affichage.afficheVictoire(personnage1, personnage2);
    }

}
