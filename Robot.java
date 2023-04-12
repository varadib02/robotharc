/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotharc;

import java.util.Random;

public class Robot {
    private String Name;
    private Integer Damage;
    private Integer Health;
    private String Color;
    private Boolean Fighter;
    private Integer maxHp;
    private Integer maxDmg;

    public Robot(String Name, Integer Damage, Integer Health, String Color, Boolean Fighter) {
        this.Name = Name;
        this.Damage = Damage;
        this.Health = Health;
        this.Color = Color;
        this.Fighter = Fighter;
        this.maxHp=Health;
        this.maxDmg=Damage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getDamage() {
        return Damage;
    }

    public void setDamage(Integer Damage) {
        this.Damage = Damage;
    }

    public Integer getHealth() {
        return Health;
    }

    public void setHealth(Integer Health) {
        this.Health = Health;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Boolean getFighter() {
        return Fighter;
    }

    public void setFighter(Boolean Fighter) {
        this.Fighter = Fighter;
    }
    
    public static Boolean Harcosok(Robot r1,Robot r2){
        if(r1.getFighter()==true && r2.getFighter()==true){
            return true;
        }
        else return false;
    }

//Kezdorobot metódus: Statikusan meghívható, 2 robotról eldönti hogy melyik támad először a harcban. Mindig az a robot kezd akinek kevesebb élete van. Ha az életük egyenlő, akkor a nagyobb sebzéssel rendelkező kezd. ha a sebzés is egyenlő akkor random szám generálással dönt a metódus arról, hogy ki kezd majd.
    public static Robot KezdoRobot(Robot r1,Robot r2){
        if(r1.getHealth()>r2.getHealth()){
            return r1;
        }
        else if(r1.getHealth()<r2.getHealth()){
            return r2;
        }
        else if(r1.getDamage()>r2.getDamage()){
            return r1;
        }
        else if(r1.getDamage()<r2.getDamage()){
            return r2;
        }
        else{
            Random r =new Random();
            if(r.nextInt(1,3)==1) return r1;
            else return r2;
        }
    }
//Sebzés metódus: Dinamikusan hívható meg egy robotra, 0 és a maximum sebzése(sebzés tulajdonság) között generál egy random sebzés mennyiséget.
    public void Sebzes(){
        Random r =new Random();
        Integer number=r.nextInt(0,this.maxDmg+1);
        this.setDamage(number);
    }
//Támadás metódus: Dinamikusan hívjuk meg az éppen támadó robotra. A sebzés metódus által generált mennyiséggel levon a paraméterben megadott (támadást elszenvedő) robot életéből.

//Gyógyulás metódus: Ha a támadó robot a maximális sebzésével megegyezőt sebez, akkor saját életerejét 2vel növeli ( a max élete, azaz az Életerő tulajdonság fölé nem nőhet az érték.)
    
    
}
