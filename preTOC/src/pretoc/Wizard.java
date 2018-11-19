/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretoc;

/**
 *
 * @author Des&Gare
 */
public class Wizard {
    
    private String uniqueName;
    private int entryFee;
    private int skillLevel;
    private boolean hasNecromancers;
    private String spellSpeciality;
    
    public Wizard(String uniqueName, int entryFee, int skillLevel, boolean hasNecromancers, String spellSpeciality){
       this.uniqueName = uniqueName;
       
       this.hasNecromancers = hasNecromancers;
       this.spellSpeciality = spellSpeciality;
       
       if(skillLevel >= 1 && skillLevel <= 10){
           this.skillLevel = skillLevel;
       }else{
           System.out.println("Skill Level outside Level scope");
       }
       
       if(hasNecromancers == true){
           this.entryFee = entryFee + 400;
       }else{
           this.entryFee = 300;
       }
       
    }
    
    public int getEntryFee(){
           return entryFee;
       }
    
    public String getName(){
        return uniqueName;
    }
    
    public int getSkillLevel(){
        return skillLevel;
    }
    
    public boolean checkHasNecromancers(){
        return hasNecromancers;
    }
    public String getSpellSpeciality(){
        return spellSpeciality;
    }
    
    public String toString(){
        return "UniqueName: " + uniqueName + "\n" +
                "EntryFee: " + entryFee + "\n" +
                "SkillLevel: " + skillLevel + "\n" +
                "Has Necromancers: " + hasNecromancers + "\n"+
                "Spell Speciality: " + spellSpeciality;
    }
    
      
}
