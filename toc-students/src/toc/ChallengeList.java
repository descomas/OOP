/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toc;

import java.util.ArrayList;

/**
 *
 * @author ou14aac
 */
public class ChallengeList {
     ArrayList<Challenge> ChallengeList;
     
     public ChallengeList(){
         ChallengeList = new ArrayList<Challenge>();
     }
        
    
     public void addChallenge(Challenge newChallenge){
        ChallengeList.add(newChallenge);
        
     }
     
     public String getAllChallenges() {
         String s = "";
         for (Challenge temp : ChallengeList) {
             s = s + temp.toString() + "\n";
             
         }
         return s;
     }
//     public Challenge findChallenge() {
//         if (index >= 0 && index < ChallengeList.size()){
//             return ChallengeList.get(index);
//             
//         }
//         return null;
//     }
//    
}
