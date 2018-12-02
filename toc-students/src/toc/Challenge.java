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
    private ChallengeType type;
    private String Enemy;
    private int skillRequired;
    private int Reward;
    
    public Challenge (int uniqueNumber, ChallengeType type, String Enemy, int skillRequired, int Reward ) {
        this.uniqueNumber = uniqueNumber;
        this.type = type;
        this.Enemy = Enemy;
        this.skillRequired = skillRequired;
        this.Reward = Reward;
    }
    
    
    public int getChallengeNumber (){
        return uniqueNumber;
    }
    
    public String getEnemy(){
        return Enemy;
    }
    
    public int getRequiredSkillLevel(){
        return skillRequired;
    }
    
    public int getReward() {
        return Reward;
    }
    
    public ChallengeType getType(){
        return type;
    }
 
    
    public String toString(){
        return "Unique Number: " + uniqueNumber + "\n" +
                "Challenge Type: " + type + "\n" +
                "Enemy: " + Enemy + "\n" +
                "Skill Required: " + skillRequired + "\n" +
                "Reward: " + Reward + "\n" +
                "--------------------------";
    }
}
