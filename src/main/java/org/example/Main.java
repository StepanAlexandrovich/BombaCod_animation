package org.example;

public class Main {
    private AnimationFrame frame = new AnimationFrame();

    public static void main(String[] args) {
        new Main().start();
    }

    private void start(){
        while (frame.isVisible()){
            frame.update();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}