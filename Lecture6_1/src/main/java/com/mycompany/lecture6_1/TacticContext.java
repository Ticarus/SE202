package com.mycompany.lecture6_1;

public class TacticContext {
    private IFootballStrategy strategy = null;
    
    public void selectTactic(String team){
        strategy.adhereTactic(team);
    }
    
    public IFootballStrategy getStrategy(){
        return strategy;
    }
    
    public void setStrategy(IFootballStrategy strategy){
        this.strategy = strategy;
    }
}
