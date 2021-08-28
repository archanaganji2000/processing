import processing.core.PApplet;

public class Main extends PApplet
{

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    float circlex,x1,x2,x3;
    float xspeed=1;
    float xspeed1=2;
    float xspeed2=3;
    float xspeed3=4;

    public static void main(String[] args) {
        PApplet.main("Main",args );
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        circlex=0;
        x1=0;
        x2=0;
        x3=0;

    }

    @Override
    public void draw() {
        drawCircle();
    }
    private void drawCircle()
    {
        ellipse(circlex,HEIGHT/5,10,10);
        ellipse(x1,HEIGHT*2/5,10,10);
        ellipse(x2,HEIGHT*3/5,10,10);
        ellipse(x3,HEIGHT*4/5,10,10);
        circlex=circlex+xspeed;
        x1=x1+xspeed1;
        x2=x2+xspeed2;
        x3=x3+xspeed3;
    }

}
