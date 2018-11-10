void setup(){
  size(300,300);

}
void draw(){
background(0,0,255); fill(0,0,255);
stroke(0,255,0);
fill(0,255,0);
ellipse(0,100,50,50);
int birdYVelocity= 30;
int gravity = 1;
fill(0,255,0);
rect(150,0,50,100);
int upperPipeHeight = (int) random(100,400);
fill(0,255,0);
rect(250,200,50,100);

boolean intersectsPipes(){
  if(birdY < upperPipeHeight && birdX > pipeX && birdX <(pipeX+pipeWidth)){
    return true;}
    else if (bordY>lowerPipeTop && birdX > pipeX && birdX < (pipeX+pipeWidth)){
      return true;}
      else { return false;}
}
      

  