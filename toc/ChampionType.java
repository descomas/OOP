/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toc;

import java.io.Serializable;

/**
 *
 * @author Desiree
 */
public enum ChampionType implements Serializable{
WIZARD("Wizards"), WARRIOR("Warriors"),  DRAGON("Wizard and Talking Dragons");
    private String state;
    
    private ChampionType(String st)
    {
        state = st;
    }
    
    public String toString()
    {
        return state;
    }
}
