import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1700, 1000, 1);
        
        Me me = new Me();
        addObject(me, 200,200);
        
        Hit hit = new Hit();
        addObject(hit, 1500,200);
    }
}
