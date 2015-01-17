/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package My_Package;

import java.util.ArrayList;

/**
 *
 * @author Doru
 */
public class Queue_Mgr {
    ArrayList<Queue> List= new ArrayList();
    Stats st;
    int simulationTime;
    int peak;
    /**
     *
     * @param nr_cozi
     * @param st
     */
    public Queue_Mgr(int nr_cozi, Stats st){
            for (int i = 0;i < nr_cozi ; i++){
               List.add(new Queue(i,st));
               List.get(i).start();  
               st.threadStarted(i);
               st.queueAdded();
            }
            this.st = st;
}
public void addQueue(){
        List.add(new Queue(List.size(),st));
        List.get(List.size()-1).start();
        st.threadStarted(List.size()-1);
        st.queueAdded();
}
public void addClient(Client c){
    int min,index = 0;
                   min = List.get(0).getServeTime();
            for(int i=0;i<List.size();i++){
                if (List.get(i).getServeTime() < min){
                    min = List.get(i).getServeTime();
                    index=i;
                }
}
           c.setArrivalTime(simulationTime);
           List.get(index).addClient(c);
           st.clientAdded(c.getServeTime(),index);
           st.serviceTime(c.getServeTime());
}

public void redistribuire(){
    Queue min = List.get(0);
    Queue max = List.get(0);
        while(List.get(List.size()-1).getServeTime() <= min.getServeTime()){
    for(int i = 0; i < List.size()-1; i++){
        if(List.get(i).getServeTime() < min.getServeTime()){
            min = List.get(i);
    }
    }
            for(int j = 0; j < List.size()-1; j++){
        if(List.get(j).getServeTime() > max.getServeTime()){
            max = List.get(j); 
    }
        
    }          if(List.size()>1){ 
            if( List.get(List.size()-1).getServeTime() + List.get(max.nrCoada).getClient(List.get(max.nrCoada).getSize()-1).getServeTime() >= max.getServeTime()){
                break;
            }
    List.get(List.size()-1).addClient(List.get(max.nrCoada).getClient(List.get(max.nrCoada).getSize()-1));
    List.get(max.nrCoada).remove(List.get(max.nrCoada).getSize()-1);
}}
    }
public void tick(boolean simStop){
    int max=0;
    simulationTime++;
    for(int i = 0; i < List.size(); i++){
    if(List.get(i).getSize() > 0){
          List.get(i).getClient(0).decrement();
    }
    else{
        if(simStop == false){
        st.queueEmpty();
        }
        else{
        }
    }
    }
    
    for(int j = 0;j < List.size(); j++){
        max = max + List.get(j).getServeTime();
    }
    if(max > peak){
        st.peak(simulationTime);
        peak = max;
    }
}

public String view(){
    String string = "";
    for(int i = 0; i < List.size();i++){
        string = string + List.get(i).getServeTimeS()+ "<br>"+"<br>"; 
    }
                return string;
}
public int getNrQueues(){
    return List.size();
}
public Queue getQ(int i){
    return List.get(i);
}
public void stopThreads(){
    for(int i = 0; i < List.size();i ++){
        List.get(i).stopThread = true;
        st.threadStopped(i);
    }
}
}