package com.mycompany.lecture11;

public class TestEnemyAttackers {
    public TestEnemyAttackers(){
        EnemyTank tank1 = new EnemyTank();
        System.out.println("The Enemy Tank");
        
        tank1.assignDriver("abc");
        tank1.driveForward();
        tank1.fireWeapon();
        System.out.println();
        
        EnemyRobot robot1 = new EnemyRobot();
        System.out.println("The Robot");
        
        robot1.reactToHuman("xyz");
        robot1.walkForward();
        robot1.smashWithHands();
        System.out.println();
        
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot1);
        System.out.println("The Robot with Adapter");
        
        robotAdapter.assignDriver("axbycz");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
