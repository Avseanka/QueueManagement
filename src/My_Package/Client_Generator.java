/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package My_Package;
/**
 *
 * @author Doru
 */
public class Client_Generator {
        int minRange,maxRange;
        int minServe,maxServe;
        Queue_Mgr qm;
        int arrival=0,random; //generarea clientilor
        Stats st;
        boolean generate = true;
        
    public Client_Generator(int minRange, int maxRange,int minServe,int maxServe,Queue_Mgr qm, int init, Stats st){
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.minServe = minServe;
        this.maxServe = maxServe;
        this.st = st;
        random = (minRange + (int)(Math.random()*(maxRange-minRange)));
        this.qm = qm;
        if(init > 0){
            for(int i = 0; i < init; i++){
                addClient();
            }
        }
 }
    
    public void addClient(){
        qm.addClient(new Client(minServe,maxServe));
        //adauga client in manager
    }
    
    public void tick(){
                   arrival++;
                   if(arrival == random){
                           addClient();
                           arrival=0;
                           random = (minRange + (int)(Math.random()*maxRange));
                   }
}
}
