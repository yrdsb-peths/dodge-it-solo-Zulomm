import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(800, 800, 1);
        
        Banana banini = new Banana();
        addObject(banini, 100, 100);
    }
}
