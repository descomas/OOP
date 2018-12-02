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
import java.util.Scanner;
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Challenge one = new Challenge(1, "Enemy", 5, 100);
//        Challenge two = new Challenge(2, "Enemy 2", 6, 200);
        
//        Champion dra1 = new Dragon("sam", 300, 7, true);
//        Champion war1 = new Warrior("sonic", 600, 10, "running");
//        Champion wiz = new Wizard("Merlin", 700, 4, true, "Zap");
        Scanner input = new Scanner(System.in);
        Tournament obj = new Tournament("DG");
        
        //System.out.println("----------------Challenges Test----------------");

        //System.out.println(obj.getReserve());
        
      
        //System.out.println("Enter champion :");
        //String champion = input.next();
        //System.out.println(obj.enterChampion(champion));
//        System.out.println(obj.getChampionDetails(champion));
//      
//        System.out.println(obj.getMoney());
//        System.out.println(obj.withdrawChampion("Desiree"));
//        System.out.println(obj.getMoney());
        //System.out.println(obj.getAllChallenges());
        
        //obj.setupChallenges();
        //System.out.println(obj.isInPlayersTeam("Neon"));
        //String name, int fee, int level, ChampionState sState

        
        
        //System.out.println("----------------Champions Test----------------");
        
//        obj.addChampion(wiz);
//        obj.addChampion(war1);
//        obj.addChampion(dra1);
        
//        System.out.println(obj.getReserve());
        
//        System.out.println(obj.findChampionInReserve("gare"));

        //System.out.println(obj.isDefeated());
        
//        Warrior hey = new Warrior("Gare", 900, 9, ChampionState.DEAD, null);
//        System.out.println(hey.hasWeapon());
//        System.out.println(obj.getTeam());
//        System.out.println(obj.fightChallenge(3));

// test remainingActiveChampions method
        //System.out.println(obj.remainingIsActiveChampions());
        System.out.println(obj.fightChallenge(3));
//        System.out.println(obj.getChallenge(3));
//        System.out.println(obj.getTeam());

    }
    
}
