 import java.awt.Color;
 import java.awt.Graphics;

 public class Cell {
    int x,y;
    int size = 35;
    
    public Cell(int x, int y, Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(i*35+10, j*35+10, 35, 35);
        g.setColor(Color.BLACK);
        g.drawRect(i*35+10, j*35+10, 35, 35);
        }
 }