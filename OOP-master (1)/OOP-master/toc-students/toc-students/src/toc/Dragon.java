/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toc;


public class Dragon extends Champion{
    
    private boolean canTalk;
    
    public Dragon(String name, int fee, int level, boolean talk){
        super(name, fee, level);
        canTalk = talk;
        level = 7;
        fee = 500;
    }
    
    public boolean CheckCanTalk(){
        return canTalk;
    }
    
    public String toString(){
        return super.toString() +
                "Can Talk: " + canTalk;
    }
    
}
