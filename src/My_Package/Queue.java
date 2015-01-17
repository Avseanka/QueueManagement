/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package My_Package;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Doru
 */
public class Queue extends Thread {
        ArrayList<Client> Q = new ArrayList();
        int nrCoada;
        Thread t;
        Stats st;
        public boolean stopThread = false;
        
        public Queue(int nrCoada,Stats st){
            this.nrCoada = nrCoada;
            this.st = st;
        }
        
        @Override
        public void run(){
            //stergerea din lista la nevoie
           while(stopThread == false){
                if(Q.size() > 0){
                    if(Q.get(0).getServeTime() <= 0){
                        st.waitingTime((st.getSimulationTime() - Q.get(0).arrivalTime - Q.get(0).getServeTimeInitial()));
                        Q.remove(0);
                        st.clientRemoved(nrCoada);
                    }
                }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Queue.class.getName()).log(Level.SEVERE, null, ex);
                    }
             }
        }
        
        @Override
        public void start ()
   {
      if (t == null)
      {
         t = new Thread (this);
         t.start ();
      }
   }
                
        public int getServeTime(){
        int time=0;
        for(int i=0;i<Q.size();i++){
            time=time+Q.get(i).getServeTime();
        }
                           return time;
    }
        
        public void addClient(Client c){
            Q.add(c);
        }
        
        
        public String getServeTimeS(){
        String time="Casa nr."+nrCoada+":  ";
        for(int i = 0; i < Q.size(); i++){
            time = time + "  " + Q.get(i).getServeTime();
        }
                           return time;
    }
        
        
public int getSize(){
    return Q.size();
}

public Client getClient(int i){
    return Q.get(i);
}
public void remove(int i){
    Q.remove(i);
}
}
