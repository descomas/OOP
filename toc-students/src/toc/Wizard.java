/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toc;

public class Wizard extends Champion {
    private boolean hasNecromancers;
    private String spellSpeciality;
    
    public Wizard(String name, int fee, int level, boolean hasNecromancers, String spellSpeciality){
        super(name, fee, level);
        
        this.hasNecromancers = hasNecromancers;
        this.spellSpeciality = spellSpeciality;
    
        if(hasNecromancers == true){
           super.setFee(400);
       }else{
           fee = 300;
       }
    }
    
    public boolean checkHasNecromancers(){
        return hasNecromancers;
    }
    public String getSpellSpeciality(){
        return spellSpeciality;
    }
    
    public String toString(){
        return super.toString() +
                "Has Necromancer: " + hasNecromancers + "\n"+
                "Spell Speciality: " + spellSpeciality + "\n" +
                "-------------------------------------------- \n";
    }
    
}
