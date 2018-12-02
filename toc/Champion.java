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
    private ChampionState state;
    private ChampionType type;
    
    public Champion(String name, int fee, int level, ChampionState sState, ChampionType newType){
        uniqueName = name;
        entryFee = fee;
        skillLevel = level;
        state = sState;
        type = newType;
    }
    
    public String getName(){
        return uniqueName;
    }
    
    public int getEntryFee(){
        return entryFee;
    }
    
    public int getSkillLevel(){
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
    
    public ChampionState getState(){
        return state;
    }
    
    public void setState(ChampionState newState){
        state = newState;
    }
    
     public ChampionType getType(){
        return type;
    }
    
    public void setType(ChampionState newType){
        state = newType;
    }
    
    public String toString(){
        return "Unique Name: " + uniqueName + "\n" +
                "Entry Fee: " + entryFee + "\n" +
                "Skill Level: " + skillLevel + "\n" +
                "ChampionState: " + state + "\n" +
                "ChampionType: " + type + "\n";
                
    }
    
    
}
