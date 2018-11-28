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
public class Challenge {
    
    private int uniqueNumber;
   // private String Type;
    private String Enemy;
    private int skillRequired;
    private int Reward;
    
    public Challenge (int uniqueNumber, String Enemy, int skillRequired, int Reward ) {
        this.uniqueNumber = uniqueNumber;
        this.Enemy = Enemy;
        this.skillRequired = skillRequired;
        this.Reward = Reward;
    }
    
    
    public int getNumber (){
        return uniqueNumber;
    }
    
    public String getEnemy(){
        return Enemy;
    }
    
    public int getSkill(){
        return skillRequired;
    }
    
    public int getReward() {
        return Reward;
    }
 
    
    public String toString(){
        return "Unique Number: " + uniqueNumber + "\n" +
                "Enemy: " + Enemy + "\n" +
                "Skill Required: " + skillRequired + "\n" +
                "Reward: " + Reward + "\n" +
                "--------------------------";
    }
}
