 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Point;

 public class Cell {
    int x,y;
    int size = 35;
    
    public Cell(int x, int y, Graphics g, Point p){
        g.setColor(Color.WHITE);
        g.fillRect(x * size + 10, y * size + 10, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x * size + 10, y * size + 10, size, size);
        }
 }