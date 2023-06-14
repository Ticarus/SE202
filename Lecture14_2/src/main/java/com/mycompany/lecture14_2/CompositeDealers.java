package com.mycompany.lecture14_2;

import java.util.ArrayList;
import java.util.List;

public class CompositeDealers extends Worker{
    List<Worker> workerList;
    
    public CompositeDealers(){
        workerList = new ArrayList<>();
    }
    
    public void add(Worker person){
        workerList.add(person);
    }
    
    public int getCost(){
        int result = 0;
        for(Worker worker : workerList){
            result += worker.getCost();
        }
        return result;
    }
}
