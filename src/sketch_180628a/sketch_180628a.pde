   int xpos;
void setup() {
    size(800, 200);
     xpos = 0;
}

void draw()
{
  //3. make it a nice color
background(#E56FDA);
    //4. if the mouse is pressed...
if(mousePressed)
{
xpos = xpos+=15;
}
    //5. ... change the X co-ordinate so that the dot moves to the right
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
   fill(#4EBACB);
    ellipse(xpos,100,100,100);
    //6. Make your dot move really fast so that it can win the race 
      //  (you have to figure out what part of your code to change)
    //7. Use this method to play a ding when your dot crosses the finish line. 
    if(xpos == 800)
    {
      playSound();
    }
}


import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("screaming.wav");
        sound.trigger();
        soundPlayed = true;

    }
}