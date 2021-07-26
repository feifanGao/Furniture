public class Television extends Furniture implements Electric {

    private boolean on = false;
    private int width;
    private int height;

    public Television(int x, int y, int width, int height){
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public String display(){
        String status;
        if(on==false) status = "off";
        else status = "on";
        return "A "+width+"x"+height+" television in the "+status+" state.";
    }

    public void togglePowerState(){
        if(on == false) on = true;
        else on = false;
    }

    public boolean getPowerState(){
        return on;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
