/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farm2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import static javafx.scene.CacheHint.SPEED;

/**
 *
 * @author jword
 */
public class Ecosystem extends JPanel {

    private Timer timer;
    private Chicken[] chickens;
    private Barn barn;
    private Sheep[] sheeps;
    private Cow[] cows;
    private Wolf wolf;
    private Farmer farmer;
    private ArrayList<Weapon> weapons;
 
   
        
    public Ecosystem() {
        super();
        setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1200, 1000/24);
        chickens = new Chicken[15];
        barn = new Barn();
        sheeps = new Sheep[15];
        wolf = new Wolf();
        farmer = new Farmer();
        weapons = new ArrayList<>();
        cows = new Cow[15];
        
        spawnChickens();
        spawnSheeps();
        spawnCows();
    
  
      
    }
   
     private void spawnChickens() {
        for(int i = 0; i < 15; i++){
        chickens[i] = new Chicken(25 + i * 3);
        }
    }
    
    public void spawnSheeps() {
        for (int i = 0; i < 15; i++) {
            sheeps[i] = new Sheep(25 + i * 3);
        }
    }
    
    public void spawnCows() {
        for (int i = 0; i < 15; i++) {
            cows[i] = new Cow(25 + i * 3);
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        barn.draw(g);
        wolf.draw(g);
        farmer.draw(g);
    
     
      
         for (Chicken chicken : chickens) {
             chicken.draw(g);
            
         } 
             for (Sheep sheep : sheeps) {
                sheep.draw(g);
        }
             
             for (Cow cow : cows) {
                cow.draw(g);
        }
               
        for (Weapon weapon : weapons) {
            if(weapon != null) {
            weapon.draw(g);
            }
        }
        
        
    }

    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            farmer.update();
           
         
            
            
            wolf.update();
          wallCollisions(wolf);
          collisionDetection(farmer, wolf);
          
          
            for (Weapon weapon : weapons) {
                if(weapon == null)
                    continue;
                //collisionDetection(wolf, weapon);
                weapon.update();
             }
             for (Sheep sheep : sheeps) {
               if (sheep == null||sheep.alive == false)
                   continue;
                 wallCollisions(sheep);
                 sheep.update();
          }
             
             for (Cow cow : cows) {
               if (cow == null)
                   continue;
                 wallCollisions(cow);
                 cow.update();
          }
             
             for (Chicken chicken : chickens) {
                if (chickens == null||chicken.alive == false)
                    continue;
                wallCollisions(chicken);
                chicken.update();
            }
            for (Chicken chicken : chickens) {
                 collisionDetection(chicken, wolf);
            }
            
            for (Sheep sheep : sheeps) {
                if(sheep == null||sheep.alive == false)
                    continue;
                collisionDetection(sheep, wolf);
            }
            
            

            repaint();
        }

        
    }
        
         private void collisionDetection(Creature c1, Creature c2) {
        if (c1.getBound().intersects(c2.getBound())) {
            c1.die();
           
        }
     
         }
           
        
     

    private void wallCollisions(Creature c) {
       if (c.getX() <= 0 || c.getX() + 20 >= this.getWidth()){
            c.setVx(-c.getVx());
        }
       if (c.getY() <= 0 || c.getY() + 20 >= this.getHeight()){
            c.setVy(-c.getVy());
        }
    }
     public void keyPressed(KeyEvent e) {
            final int SPEED = 4;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
              farmer.setVx(SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
              farmer.setVx(-SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
              farmer.setVy(-SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
              farmer.setVy(SPEED);
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
           farmer.setVx(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
           farmer.setVx(0);   
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
           farmer.setVy(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
           farmer.setVy(0);
        }     
            if (e.getKeyCode() == KeyEvent.VK_SPACE)
            weapons.add( new Weapon(farmer.getX(), farmer.getY()) );
           
    }
}

    
   
    
    
    
