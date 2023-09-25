/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

public class Mirmillon extends Personnage{
    
    protected String classe;
    
    public Mirmillon(String classe, String nom, int attaqueMax, int defense, int pvs, int ini){
        super(nom, attaqueMax, defense, pvs, ini);
    }
    
    public Mirmillon(){
        this.classe = "";
    }
    
    public void setClasse(String classe){
        this.classe = classe;
    }
    
    
    
}
