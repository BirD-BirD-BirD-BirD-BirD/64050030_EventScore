/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventscore;

import java.util.ArrayList;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
public class ScoreSource {
    private String score;
    private ArrayList<ScoreListener> listeners;
    
    public ScoreSource(){
        listeners = new ArrayList<>();
    }
    
    public void setScoreLine(String msg){
        score = msg;
        fireMyEvent(new ScoreEvent(this, score));
    }
    
    public String getScoreLine(){
        return score;
    }
    
    public void addMyListener(ScoreListener subscriber){
        listeners.add(subscriber);
    }
    
    public void removeMyListener(ScoreListener subscriber){
        listeners.remove(subscriber);
    }
    
    public void fireMyEvent(ScoreEvent e){
        for(int i = 0; i < listeners.size(); i++){
            ScoreListener s = listeners.get(i);
            s.scoreChange(e);
        }
    }
}
