 import java.awt.Color;
 import java.awt.Graphics;

 public class Cell {
    int x,y;
    int size = 35;
    
    public Cell(int x, int y, Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x*35+10, y*35+10, 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(x*35+10, y*35+10, 35, 35);
        }
 }