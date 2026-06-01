package com.elprojecto;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {

static int speed = 100;
    public FinalFinch (String device) {
        super(device);
    }

    public void dance() {
        //showImage();
       // pause(2);

       // playSong();

        for (int i = 0; i < 2; i++) {
            setMove("F", 30, speed);
            setBeak(100, 100, 100);
            setTurn("R", 360.0, speed);
            setMove("B", 30, speed);
            setTurn("L", 360.0, speed);
        }
    }

    public void playSong() {
        int[] notes = {64, 64, 65, 67, 49, 67, 52, 47, 64, 72, 73, 49, 67};

        for (int note : notes) {
            playNote(note, 1);
            pause(1);
        }
    }

    public void showImage() {
        int patternArray[] = {0,0,0,0,0,0,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,1,1,0};
        setDisplay(patternArray);
    }

}