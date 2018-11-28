/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toc;

/**
 *
 * @author Desiree
 */
public class Champion {
    
    private String uniqueName;
    private int entryFee;
    private int skillLevel;
    
    public Champion(String name, int fee, int level){
        uniqueName = name;
        entryFee = fee;
        skillLevel = level;
    }
    
    public String getName(){
        return uniqueName;
    }
    
    public int entryFee(){
        return entryFee;
    }
    
    public int skillLevel(){
        return skillLevel;
    }
    
    public void setName(String newName){
        uniqueName = newName;
    }
    
    public void setFee(int newFee){
        entryFee = newFee;
    }
    
    public void setSkillLevel(int newLevel){
        skillLevel = newLevel;
    }
    
    public String toString(){
        return "Unique Name: " + uniqueName + "\n" +
                "Entry Fee: " + entryFee + "\n" +
                "Skill Level: " + skillLevel + "\n";
    }
    
    
}
