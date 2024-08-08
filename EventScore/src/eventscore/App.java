/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventscore;

import java.util.Scanner;

/**
 *
 * @author 64050030_Kitipum Nornua
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        
        source.addMyListener(sub1);
        source.addMyListener(sub2);
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter Score ");
            String msg = sc.nextLine();
            if(msg.equals("")){
                break;
            }else{
                source.setScoreLine(msg);
            }
        }
    }
    
}
