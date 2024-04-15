import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

   public void draw() {

    // row one
    drawLamp(50, 40);
    drawLamp(150, 40);
    drawLamp(250, 40);
    drawLamp(350, 40);
    drawLamp(450, 40);

    // row two
    drawDoor(40, 130, 245, 235, 95);
    drawDoor(140, 130, 245, 235, 95);
    drawDoor(240, 130, 245, 235, 95);
    drawDoor(340, 130, 245, 235, 95);
    drawDoor(440, 130, 245, 235, 95);

    // row three   
    drawLamp(50, 240);
    drawLamp(150, 240);
    drawLamp(250, 240);
    drawLamp(350, 240);
    drawLamp(450, 240);

    // row four
    drawDoor(40, 330, 230, 173, 237 );
    drawDoor(140, 330, 230, 173, 237);
    drawDoor(240, 330, 230, 173, 237);
    drawDoor(340, 330, 230, 173, 237);
    drawDoor(440, 330, 230, 173, 237);

    // row five
    drawLamp(50, 440);
    drawLamp(150, 440);
    drawLamp(250, 440);
    drawLamp(350, 440);
    drawLamp(450, 440);
  }

  public void drawDoor(float doorX, float doorY, float knobColourOne, float KnobColourTwo, float KnobColourThree) {

    // Door
    noStroke();
    fill(135, 105, 70);
    rect(doorX, doorY, 35, 70);

    // Knob
    fill(knobColourOne, KnobColourTwo, KnobColourThree);
    //fill(245, 235, 95);
    ellipse(doorX + 25, doorY + 35, 5, 5);
  }

  public void drawLamp(float lightX, float lightY) {

    // Light
    strokeWeight(1);
    stroke(125);
    fill(252, 239, 154);
    ellipse(lightX, lightY, 24, 24);  
  
    // Shade
    fill(125);
    rect(lightX + 2, lightY - 12, 11, 24);
  
    // Stand
    strokeWeight(5);
    stroke(125);
    line(lightX + 4, lightY + 45, lightX + 4, lightY + 5);

    // Bottom
    rect(lightX - 17, lightY + 48, 40, 6);
  }

  /**
   * Program that draws rows of lamps and door based on coordinates given
   * 
   * @param doorX X coordinate door is drawn at
   * @param doorY Y coordinate door is drawn at
   * @param knobColourOne Fill colour for door knob (red)
   * @param knobColourTwo Fill colour for door knob (green)
   * @param knobColourThree Fill colour for door knob (blue)
   * @param lightX X coordinate lamp is drawn at
   * @param lightY Y coordinate lamp is drawn at
   * @return The
   * @author: A. Waqar
   */

  
  
}