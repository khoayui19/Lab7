package lab7;

class MoveableCircle implements Moveable{

    private MoveablePoint    center;
    private int             radius;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center      = new MoveablePoint();
        this.radius = radius;
    }

    public void moveUp() {
    	System.out.println("di len phia truoc");
    }

    public void moveDown() {
    	System.out.println("di lui lai");
    }

    public void moveLeft() {
    	System.out.println("di qua trai");
    }

    public void moveRight() {
    	System.out.println("di qua phai");  
    }
    
    public String toString() {
        return String.format("MoveableCircle at point %1$s with radius = %2$d"
                            , center.toString(), radius);
    }
}