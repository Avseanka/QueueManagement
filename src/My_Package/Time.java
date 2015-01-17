/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package My_Package;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
/**
 *
 * @author Doru
 */

public class Time {
     Timer t;
     Client_Generator cg;
     Queue_Mgr qm;
     Stats st;
     int delay;
     boolean timerStopped = false;
     int currentTime;
     final int simulation;
     
     public Time(Client_Generator cg,Queue_Mgr qm,final int simulation, Stats st){
         this.cg = cg;
         this.qm = qm;
         this.st = st;
         this.simulation = simulation;
         //cg = new Client_Generator(minRange, maxRange,minServe,maxServe);      
         t = new javax.swing.Timer(1000,new ActionListener(){
               @Override
               
        public void actionPerformed(ActionEvent e){
            if(currentTime < simulation){
                      tick();
                      currentTime++;
            }
            else{
                golire();
            }
                   }

            }); 
     }
                       public void tick(){
                           cg.tick();
                           qm.tick(false);
                           st.tick();
                   }
                       
                       public void start(){
                           t.start();
                           st.reStart();
                       }
                       public void stop(){
                           t.stop();
                           st.paused();
                       }
                       public void golire(){
                           boolean stop = true;
                           qm.tick(true);
                           st.tick();
                           for(int i = 0;i < qm.getNrQueues();i++){
                               if(qm.getQ(i).getSize() > 0){
                                   stop = false;
                           }
                           }
                               if(stop == true){
                                   delay++;
                                   if(delay == 3){
                                   t.stop();
                                   st.paused();
                                   qm.stopThreads();
                                   timerStopped = true;
                                   st.generate();
                                        }
                               }
                       }
                       
                      public boolean timerStopped(){
                          return timerStopped;
                      }
}
