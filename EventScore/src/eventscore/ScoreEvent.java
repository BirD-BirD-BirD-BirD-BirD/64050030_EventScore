/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventscore;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
import java.util.*;
public class ScoreEvent extends EventObject{
    private String myMSG;
    public ScoreEvent(Object source, String msg){
        super(source);
        myMSG = msg;
    }
    
    public String getMSG(){
        return myMSG;
    }
}
