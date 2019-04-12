/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Farm2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author jword
 */
public abstract class Creature {
    
    //Fields
    protected int size;
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    protected Color color;
    protected Rectangle bound;
    protected boolean alive = true;
    
    

    //Constructor
    public Creature() {
        size = 75;
        color = Color.RED;
        x = (int)(Math.random()* 1000 + x);
        y = (int)(Math.random()* 1000 + y);
        vx = 4;
        vy = 4;
    }
    
    
    public Creature(int x, int y) {
        size = 75;
        color = Color.RED;
        this.x = (int)(Math.random()* 1000 + x);
        this.y = (int)(Math.random()* 1000 + y);
        this.vx = 4;
        this.vy = 4;
        bound = new Rectangle(this.x, this.y, this.size, this.size);
    }
     public Rectangle getBound() {
        return bound;
    }

  

    
    public void draw(Graphics g) {
       Graphics2D g2d = (Graphics2D) g;
        g2d.draw(bound);
    }
    
    public void update() {
        x += vx;
        y += vy;
        bound = new Rectangle(this.x, this.y, this.size, this.size);
         
    }
    
    public void moveTo() {
        
    }
    
    public void shoot() {
        
    }
  
    public void die() {
        x = -500;
        y = -500;
    }
   
     public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }
    
}
