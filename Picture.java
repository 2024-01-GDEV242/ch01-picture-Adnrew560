/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square pole;
    private Square poleHighlight;
    private Triangle cover;
    private Triangle coverHighlight;
    private Triangle light;
    private Circle bulbHighlight;
    private Circle bulb;
    private Person guy;
    private Person guyHighlight;
    private boolean drawn;
    private boolean lit;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        pole = new Square();
        poleHighlight = new Square();
        cover = new Triangle();
        coverHighlight = new Triangle();
        light = new Triangle();
        bulbHighlight = new Circle();
        bulb = new Circle();
        guy = new Person();
        guyHighlight = new Person();
        drawn = false;
        lit = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            poleHighlight.changeColor("white");
            poleHighlight.moveTo(605,0);
            poleHighlight.changeSize(70);
            poleHighlight.makeVisible();
            
            light.changeColor("yellow");
            light.moveTo(640,80);
            light.changeSize(800,1200);
            light.makeVisible();
            
            bulbHighlight.changeColor("white");
            bulbHighlight.moveTo(595, 80);
            bulbHighlight.changeSize(80);
            bulbHighlight.makeVisible();
            
            bulb.changeColor("yellow");
            bulb.moveTo(605, 80);
            bulb.changeSize(80);
            bulb.makeVisible();
            
            coverHighlight.changeColor("white");
            coverHighlight.moveTo(640, 50);
            coverHighlight.changeSize(70,400);
            coverHighlight.makeVisible();
            
            pole.changeColor("black");
            pole.moveTo(615,0);
            pole.changeSize(70);
            pole.makeVisible();
            
            cover.changeColor("black");
            cover.moveTo(670, 45);
            cover.changeSize(70,400);
            cover.makeVisible();
            
            //not visible yet
            guyHighlight.changeColor("white");
            guyHighlight.moveTo(640,500);
            guyHighlight.changeSize(300,210);
            
            guy.changeColor("blue");
            guy.moveTo(640,510);
            guy.changeSize(300,210);
            
            

            drawn = true;
            lit = true;
        }
    }

    /**   
     * Redraw everything lmao
    */
    public void toggleLight()
    {
        int scene = 0;
        poleHighlight.makeInvisible();
        bulbHighlight.makeInvisible();
        coverHighlight.makeInvisible();
        bulb.makeInvisible();
        light.makeInvisible();
        cover.makeInvisible();
        pole.makeInvisible();
        guy.makeInvisible();
        guyHighlight.makeInvisible();
        if(!lit)
        {
            light.makeVisible();
            bulb.changeColor("yellow");
            lit = true;
            scene = (int) (4 * Math.random());
            //chooses one of 4 random scenes
        } 
        else 
        {
            bulb.changeColor("black");
            lit = false;
        }
        poleHighlight.makeVisible();
        bulbHighlight.makeVisible();
        coverHighlight.makeVisible();
        bulb.makeVisible();
        cover.makeVisible();
        pole.makeVisible();
        switch(scene)
            {
                // i was going to add more of these but i didn't lmao
                case 1:
                guyHighlight.makeVisible();
                guy.makeVisible();
                break;
                case 2:
                break;
                case 3:
                break;
                default:
                break;
            }
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        poleHighlight.changeColor("white");
        light.changeColor("white");
        bulbHighlight.changeColor("white");
        if(lit)
        {
            bulb.changeColor("white");
        } else 
        {
            bulb.changeColor("black");
        }
        coverHighlight.changeColor("white");
        pole.changeColor("black");
        cover.changeColor("black");
        guyHighlight.changeColor("white");
        guy.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        poleHighlight.changeColor("white");
        light.changeColor("yellow");
        bulbHighlight.changeColor("white");
        if(lit)
        {
            bulb.changeColor("yellow");
        } else 
        {
            bulb.changeColor("black");
        }
        coverHighlight.changeColor("white");
        pole.changeColor("black");
        cover.changeColor("black");
        guyHighlight.changeColor("white");
        guy.changeColor("blue");
    }
}
