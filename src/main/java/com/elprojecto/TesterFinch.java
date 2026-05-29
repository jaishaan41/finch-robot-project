package com.elprojecto;

public class TesterFinch {
    public static void main(String[] args) {
        FinalFinch bird = new FinalFinch("A");



for (int i = 0; i < 2; i++) {
bird.setMove("F", 50, 50);
bird.setBeak(100, 100, 100);
bird.setTurn("R", 360.0, 40);
bird.setMove("B", 50, 50);
bird.setTurn("L", 360.0, 40);
}

    }


}