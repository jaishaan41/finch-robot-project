package com.elprojecto;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
//static variable to control speed
static int speed = 100;
    public FinalFinch (String device) {
        super(device);
    }
    //main method used to make finch "dance"
    public void dance() {
        //shows image on the leds
        showImage();
       pause(2);

       playSong();
        //2 loops of a dance
        for (int i = 0; i < 2; i++) {
            setMove("F", 25, speed);
            setBeak(100, 100, 100);
            setTurn("R", 360.0, speed);
            setMove("B", 25, speed);
            setTurn("L", 360.0, speed);
        }
    }
    //plays a song using notes from a 1d array.
    public void playSong() {
        int[] notes = {64, 64, 65, 67, 49, 67, 52, 47, 64, 72, 73, 49, 67};
/*
        enhanced for loop to input 1d array into play note methods and play each note
*/ 
        for (int note : notes) {
            playNote(note, 1);
            pause(1);
        }
    }
    //shows image using the array which contains the values on which light is either on or off
    public void showImage() {
        int patternArray[] = {0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,1,1,0};
        setDisplay(patternArray);
    }

}