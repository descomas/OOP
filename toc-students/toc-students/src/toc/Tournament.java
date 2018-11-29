package toc;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
/**
 * This class implements the behaviour expected from the WAM
 * system as required for 6COM1037 - Oct 2018
 * 
 * @author A.A.Marczyk 
 * @version 16/10/18
 */

public class Tournament implements TOC 
{   
    private String playerName;
    private int gulden; //money 
    ArrayList<Champion> reserve;
    ArrayList<Champion> playerTeam;
    ArrayList<Challenge> challengeList;
   

//**************** TOC ************************** 
    /** Constructor requires the name of the player
     * @param player the name of the player
     */  
    public Tournament(String pl){
        playerName = pl;
        gulden = 1000;
        reserve = new ArrayList<Champion>();
        playerTeam = new ArrayList<Champion>();
        challengeList = new ArrayList<Challenge>();
        //setupChampions();
        setupChallenges();
        
    
    }
    
    /** Constructor requires the name of the player and the
     * name of the file storing challenges
     * @param player the name of the player
     * @param filename name of file storing challenges
     */  
    
    // Testing purposes ---------------------------------
    
    public void addChampion(Champion newChampion){
        reserve.add(newChampion);
    }
    
    public void addChallenge(Challenge newChallenge){
        challengeList.add(newChallenge);
    }
    
    
    //---------------------------------------------------
    
    
    
    
    public Tournament(String pl, String filename)  //Task 3
    {
    }
    
    
    /**Returns a String representation of the state of the game,
     * including the name of the player x, state of the treasury x,
     * whether defeated or not, and the champions currently in the 
     * team,(or, "No champions" if team is empty)
     * @return a String representation of the state of the game,
     * including the name of the player, state of the treasury,
     * whether defeated or not, and the champions currently in the 
     * team,(or, "No champions" if team is empty)
     **/
    public String toString()
    {
       
        return "Player Name: " + playerName + "\n" +
                "Current Gulden" + gulden + "\n";
    }
    
    
    /** returns true if Treasury <=0 and the player's team has no champions 
     * which can be deentered. 
     * @return true if Treasury <=0 and the player's team has no champions 
     * which can be retired. 
     */
    public boolean isDefeated()
    {
        return false;
    }
    
    /** returns the amount of money in the Treasury
     * @return the amount of money in the Treasury
     */
    public int getMoney()
    {
        return 0;
    }
    
    
    /**Returns a String representation of all champions in the reserves
     * @return a String representation of all champions in the reserves
     **/
    public String getReserve(){
        String s = "";
        for(Champion temp: reserve){
            s += temp.toString();
        }
        return s;
    }
    
    /** Returns details of champion in reserves with the given name
     * @return details of champion in reserves with the given name
     **/
    public String findChampionInReserve(String nme){
        for(Champion temp: reserve){
            if(temp.getName().equals(nme))
                return temp.toString();
        }
        return "Not found";

    }
    
    
    /** Returns details of any champion with the given name
     * @return details of any champion with the given name
     **/
    public String getChampionDetails(String nme)
    {
        return "";
    }     
    
     /** Returns whether champion exists, or not
     * @param champion's name
     * @return true if champion in the game, false otherwise
     */
    public boolean isChampion(String nme)
    {
        return false;
    }
 
    // ***************** Team champions ************************   
    /** Allows a champion to be entered for the player's team, if there 
     * is enough money in the Treasury for the commission fee.The champion's 
     * state is set to "active"
     * @param nme represents the name of the champion
     * @return 0 if champion is entered in the player's team, 1 if champion 
     * is not in reserve, 2 if not enough money in the treasury, -1 if there
     * is no such champion 
     **/       
    public int enterChampion(String nme)
    {
        return -1;
    }
        
    /** Returns true if the champion with the name is in 
     * the player's team, false otherwise.
     * @param nme is the name of the champion
     * @return returns true if the champion with the name
     * is in the player's team, false otherwise.
     **/
    public boolean isInPlayersTeam(String nme)
    {
        return false;
    }
    
    /** Removes a champion from the team to the reserves (if they are in the team)
     * Pre-condition: isChampion()
     * 0 - if champion is withdrawn to reserves
     * 1 - if champion not withdrawn because dead
     * 2 - if champion not withdrawn because not in team
     * @param nme is the name of the champion
     * @return as shown above 
     **/
    public int withdrawChampion(String nme)
    {
        return -1;
    }
    
   
    /**Returns a String representation of the champions in the player's team
     * or the message "No champions entered"
     * @return a String representation of the champions in the player's team
     **/
    public String getTeam()
    {
        return "";
    }
    
//**********************Challenges************************* 
    /** returns true if the number represents a challenge
     * @param num is the referchale number of the challenge
     * @return true if the referchale number represents a challenge
     **/
     public boolean isChallenge(int num)
     {
         return false;
     }
     
    /** Retrieves the challenge represented by the challenge 
      * number.Finds a champion from the team which can challenge the 
      * challenge. The results of fighting an challenge will be 
      * one of the following:  
      * 0 - challenge won, add challenge reward to the treasury, 
      * 1 - challenge lost as no suitable champion is  available, deduct
      * the challenge reward from treasury 
      * 2 - challenge lost on battle skills  - deduct challenge reward from
      * treasury and record champion as "dead"
      * 3 - If a challenge is lost and player completely defeated (no money and 
      * no champions to withdraw) 
      * -1 - no such challenge 
      * @param chalNo is the number of the challenge
      * @return an int showing the result(as above) of fighting the challenge
      */  
    public int fightChallenge(int chalNo)
    {
        return -1;
    }

    /** Provides a String representation of an challenge given by 
     * the challenge number
     * @param num the number of the challenge
     * @return returns a String representation of a challenge given by 
     * the challenge number
     **/
    public String getChallenge(int num)
    {
        return "";
    }
    
    /** Provides a String representation of all challenges 
     * @return returns a String representation of all challenges
     **/
    public String getAllChallenges(){
        String s = "";
        for (Challenge temp : challengeList) {
            s = s + temp.toString() + "\n";
         }
         return s;
        
    }
    

    //****************** private methods *******************
    //*******************************************************************************
    private void setupChampions(){
        
        //String name, int fee, int level, ChampionState state, boolean hasNecromancers, String spellSpeciality
        Champion cha1 = new Wizard("Ganfrank", 400, 7, ChampionState.WAITING, true, "Trasmuation");
        Champion cha2 = new Wizard("Rudolf", 400, 6,ChampionState.WAITING, true, "Invisibility");
        Champion cha3 = new Warrior("Elblond", 150, 1, ChampionState.WAITING, "Sword");
        
        Champion cha4 = new Warrior("Flimsi", 200, 2, ChampionState.WAITING, "Bow");
        Champion cha5 = new Dragon("Drabina", 500, 7,ChampionState.WAITING, false);
        Champion cha6 = new Dragon("Golum", 500, 7, ChampionState.WAITING, true);
        
        Champion cha7 = new Warrior("Argon", 900, 9, ChampionState.WAITING, "Mace");
        Champion cha8 = new Wizard("Neon", 300, 2, ChampionState.WAITING, false, "Traslocation");
        Champion cha9 = new Dragon("Xenon", 500, 7, ChampionState.WAITING, true);
     
    }
     
    private void setupChallenges(){
        
        challengeList.add(new Challenge(1, ChallengeType.MAGIC, "Borg", 3, 120));
        challengeList.add(new Challenge(2, ChallengeType.FIGHT, "Huns", 3, 120));
        challengeList.add(new Challenge(3, ChallengeType.MYSTERY, "Ferengi", 3, 150));
        challengeList.add(new Challenge(4, ChallengeType.MAGIC, "Vandal", 9, 200));
        challengeList.add(new Challenge(5, ChallengeType.MYSTERY, "Borg", 7, 90));
        challengeList.add(new Challenge(6, ChallengeType.FIGHT, "Goth", 8, 45));
        challengeList.add(new Challenge(7, ChallengeType.MAGIC, "Frank", 10, 200));
        challengeList.add(new Challenge(8, ChallengeType.FIGHT,"Sith", 10, 170));
        challengeList.add(new Challenge(9, ChallengeType.MYSTERY, "Cardashian", 9, 300));
        
    
    }
        
   
//    // These methods are not needed until Task 4.4
//    // ***************   file write/read  *********************
//     /** Writes whole game to the specified file using serialisation
//      * @param fname name of file to which game is saved
//      */
//     public void saveGame(String fname)
//     {    // use serialisation
//     
//     /** reads all information about the game from the specified file 
//      * and returns 
//      * @param fname name of file storing the game
//      * @return the game (as an Player object)
//      */
//     public Tournament loadGame(String fname)
//     {   // uses object serialisation 
//         return null;
//     } 
//     
//     /** reads information about challenges from the specified file
//      * and stores them 
//      * @param fileName name of file storing challenges
//      */
//     private void readChallenges(String fileName);
    
}



