int lengtha = 300;
int heighta = 300; 


void setup() {
  size(640, 360);
}

void draw(){
background (002); 

  pushMatrix();
  translate(width*0.5, height*0.5);
  rotate(frameCount / -100.0);
  star(0, 0, 30, 70, 5); 
  popMatrix();
}

void star(float x, float y, float r1, float r2, int npoints) {
  float theta = TWO_PI / npoints;
  float halftheta = theta/2.0;
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
  
