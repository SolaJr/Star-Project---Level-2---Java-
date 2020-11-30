import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Project_3___Star_Resubnmitssion___Extra_Credit extends PApplet {

int lengtha = 300;
int heighta = 300; 


public void setup() {
  
}

public void draw(){
background (002); 

  pushMatrix();
  translate(width*0.5f, height*0.5f);
  rotate(frameCount / -100.0f);
  star(0, 0, 30, 70, 5); 
  popMatrix();
}

public void star(float x, float y, float r1, float r2, int npoints) {
  float theta = TWO_PI / npoints;
  float halftheta = theta/2.0f;
  beginShape();
  for (float angle = 0; angle < TWO_PI; angle += theta) {
    float delta_x = x + cos(angle) * r2;
    float delta_y = y + sin(angle) * r2;
    vertex(delta_x, delta_y);
    delta_x = x + cos(angle + halftheta + mouseX ) * r1;
    delta_y = y + sin(angle + halftheta + mouseY) * r1;
    vertex(delta_x, delta_y);
  }
  endShape(CLOSE);
}
  
  public void settings() {  size(640, 360); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "Project_3___Star_Resubnmitssion___Extra_Credit" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
