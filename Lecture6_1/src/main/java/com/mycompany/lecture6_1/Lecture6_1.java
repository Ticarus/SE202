package com.mycompany.lecture6_1;

public class Lecture6_1 {

    public static void main(String[] args) {
        football_ex();
    }
    //Strategy design pattern
    public static void text_ex(){
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");
        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
    
    public static void social_media_ex(){
        SocialMediaContext context = new SocialMediaContext();
        
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Lokesh");
        
        System.out.println("========================");
        
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Lokesh");
        
        System.out.println("========================");
        
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Lokesh");
    }
    
    public static void math_ex(){
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        
        context = new Context(new OperationMultiply());
        System.out.println("10 x 5 = " + context.executeStrategy(10, 5));
    }
    
    public static void football_ex(){
        String team1 = "Barcelona";
        String team2 = "Real Madrid";
        
        TacticContext context = new TacticContext();
        
        context.setStrategy(new AttackTactic());
        context.selectTactic(team1);
        
        context.setStrategy(new DefenceTactic());
        context.selectTactic(team2);
    }
}
