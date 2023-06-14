package com.mycompany.lecture14_2;

public class Lecture14_2 {

    public static void main(String[] args) {
        //Headquarters
        CompositeDealers headquarters = new CompositeDealers();
        //Directorates connected to the General Directorate
        CompositeDealers centralAnatoliaDirectorate = new CompositeDealers();
        //Regional Offices
        CompositeDealers ankaraOffice = new CompositeDealers();
        CompositeDealers sivasOffice = new CompositeDealers();
        //Dealers connected to regions
        CompositeDealers ankara1 = new CompositeDealers();
        CompositeDealers ankara2 = new CompositeDealers();
        CompositeDealers sivas1 = new CompositeDealers();
        
        //dealer employees 
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        
        ankara2.add(new WorkingPerson());
        
        ankaraOffice.add(ankara1);
        ankaraOffice.add(ankara2);
        
        sivas1.add(new WorkingPerson());
        
        sivasOffice.add(sivas1);
        
        centralAnatoliaDirectorate.add(ankaraOffice);
        centralAnatoliaDirectorate.add(sivasOffice);
        
        headquarters.add(centralAnatoliaDirectorate);
        
        System.out.println("--------------------------------------------------");
        System.out.println("Ankara 1 Dealer Cost : " + ankara1.getCost());
        System.out.println("Ankara 2 Dealer Cost : " + ankara2.getCost());
        System.out.println("Ankara Regional Cost : " + ankaraOffice.getCost());
        System.out.println("--------------------------------------------------");
        System.out.println("Sivas 1 Dealer Cost : " + sivas1.getCost());
        System.out.println("Sivas Regional Cost : " + sivasOffice.getCost());
        System.out.println("--------------------------------------------------");
        System.out.println("Central Anatolia Directorate Cost : " + centralAnatoliaDirectorate.getCost());
        System.out.println("--------------------------------------------------");
        System.out.println("Total Cost : " + headquarters.getCost());
        System.out.println("--------------------------------------------------");
    }
}
