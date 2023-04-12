/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robotharc;

/**
 *
 * @author User
 */
public class Robotharc{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot r1=new Robot("r1",100,2000,"szürke",true);
        Robot r2=new Robot("r2",200,1200,"barna",true);
        Robot.Harcosok(r1, r2);
        Robot e=Robot.KezdoRobot(r1, r2);
        System.out.println(e.getName());
        r1.Sebzes();
        System.out.println(r1.getDamage());
    }
    
}
