package com.example.cardencalendar;


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class PlanOfArea {
    Canvas canvas;

    public PlanOfArea() {

        this.canvas = new Canvas(1162, 572);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(0.5);

        Color colorCircle = Color.BLACK;
        gc.setStroke(colorCircle);
        gc.setFill(Color.LAVENDERBLUSH);
        gc.setStroke(colorCircle);
        //2.1
        gc.fillOval(40, 40, 50, 50);
        gc.strokeOval(40, 40, 50, 50);
        //  gc.strokeText("2.1", 57, 70);
        //2.2
        gc.fillOval(40, 110, 50, 50);
        gc.strokeOval(40, 110, 50, 50);
        //  gc.strokeText("2.2", 57, 140);
        //2.3
        gc.fillOval(310, 40, 50, 50);
        gc.strokeOval(310, 40, 50, 50);
        //   gc.strokeText("2.3", 327, 70);
        //2.4
        gc.fillOval(310, 110, 50, 50);
        gc.strokeOval(310, 110, 50, 50);
        //  gc.strokeText("2.4", 327, 140);
        //2.5
        gc.fillOval(310, 180, 50, 50);
        gc.strokeOval(310, 180, 50, 50);
        // gc.strokeText("2.5", 327, 210);
        //2.6
        gc.fillOval(310, 250, 50, 50);
        gc.strokeOval(310, 250, 50, 50);
        //  gc.strokeText("2.6", 327, 280);
        //2.7
        gc.fillOval(310, 320, 50, 50);
        gc.strokeOval(310, 320, 50, 50);
        //  gc.strokeText("2.7", 327, 350);
        //2.10
        gc.fillOval(510, 90, 50, 50);
        gc.strokeOval(510, 90, 50, 50);
        //  gc.strokeText("2.10", 524, 120);
        //2.11
        gc.fillOval(510, 160, 50, 50);
        gc.strokeOval(510, 160, 50, 50);
        //   gc.strokeText("2.11", 524, 190);
        //2.12
        gc.fillOval(510, 230, 50, 50);
        gc.strokeOval(510, 230, 50, 50);
        // gc.strokeText("2.12", 524, 260);
        //2.13
        gc.fillOval(510, 300, 50, 50);
        gc.strokeOval(510, 300, 50, 50);
        // gc.strokeText("2.13", 524, 330);
        //2.14
        gc.fillOval(510, 370, 50, 50);
        gc.strokeOval(510, 370, 50, 50);
        //  gc.strokeText("2.14", 524, 400);
        //2.15
        gc.fillOval(510, 440, 50, 50);
        gc.strokeOval(510, 440, 50, 50);
        //  gc.strokeText("2.15", 524, 470);
        //2.25
        gc.fillOval(600, 60, 50, 50);
        gc.strokeOval(600, 60, 50, 50);
        //  gc.strokeText("2.25", 614, 90);
        //2.17
        gc.fillOval(660, 40, 50, 50);
        gc.strokeOval(660, 40, 50, 50);
        //   gc.strokeText("2.17", 674, 70);
        //2.16
        gc.fillOval(660, 520, 50, 50);
        gc.strokeOval(660, 520, 50, 50);
        // gc.strokeText("2.16", 674, 550);
        //2.18
        gc.fillOval(750, 40, 50, 50);
        gc.strokeOval(750, 40, 50, 50);
        //   gc.strokeText("2.18", 764, 70);
        //2.19
        gc.fillOval(750, 450, 50, 50);
        gc.strokeOval(750, 450, 50, 50);
        //  gc.strokeText("2.19", 764, 480);
        //2.20
        gc.fillOval(750, 520, 50, 50);
        gc.strokeOval(750, 520, 50, 50);
        //  gc.strokeText("2.20", 764, 550);
        //2.21
        gc.fillOval(1110, 340, 50, 50);
        gc.strokeOval(1110, 340, 50, 50);
        // gc.strokeText("2.21", 1124, 370);
        //2.22
        gc.fillOval(1110, 400, 50, 50);
        gc.strokeOval(1110, 400, 50, 50);
        //  gc.strokeText("2.22", 1124, 430);
        //2.23
        gc.fillOval(1110, 460, 50, 50);
        gc.strokeOval(1110, 460, 50, 50);
        // gc.strokeText("2.23", 1124, 490);
        //2.24
        gc.fillOval(1110, 520, 50, 50);
        gc.strokeOval(1110, 520, 50, 50);
        // gc.strokeText("2.24", 1124, 550);


        gc.setFill(Color.LEMONCHIFFON);
        //1.1
        gc.fillRect(40, 180, 50, 250);
        gc.strokeRect(40, 180, 50, 250);
        //  gc.strokeText("1.1", 57, 210);
        //1.2
        gc.fillRect(130, 110, 50, 350);
        gc.strokeRect(130, 110, 50, 350);
        //  gc.strokeText("1.2", 147, 140);
        //1.3
        gc.fillRect(220, 90, 50, 170);
        gc.strokeRect(220, 90, 50, 170);
        //  gc.strokeText("1.3", 237, 120);
        //1.4
        gc.fillRect(220, 260, 50, 230);
        gc.strokeRect(220, 260, 50, 230);
        //  gc.strokeText("1.4", 237, 290);
        //1.5
        gc.fillRect(400, 90, 50, 50);
        gc.strokeRect(400, 90, 50, 50);
        // gc.strokeText("1.5", 417, 120);
        //1.6
        gc.fillRect(400, 140, 50, 50);
        gc.strokeRect(400, 140, 50, 50);
        // gc.strokeText("1.6", 417, 170);
        //1.7
        gc.fillRect(400, 190, 50, 70);
        gc.strokeRect(400, 190, 50, 70);
        //  gc.strokeText("1.7", 417, 220);
        //1.8
        gc.fillRect(400, 260, 50, 230);
        gc.strokeRect(400, 260, 50, 230);
        // gc.strokeText("1.8", 417, 290);
        //1.9
        gc.fillRect(750, 100, 50, 50);
        gc.strokeRect(750, 100, 50, 50);
        // gc.strokeText("1.9", 767, 130);
        //1.10
        gc.fillRect(750, 150, 50, 50);
        gc.strokeRect(750, 150, 50, 50);
        //gc.strokeText("1.10", 764, 180);
        //1.11
        gc.fillRect(750, 200, 50, 50);
        gc.strokeRect(750, 200, 50, 50);
        // gc.strokeText("1.11", 764, 230);
        //1.12
        gc.fillRect(750, 250, 50, 50);
        gc.strokeRect(750, 250, 50, 50);
        // gc.strokeText("1.12", 764, 280);
        //1.13
        gc.fillRect(750, 330, 50, 100);
        gc.strokeRect(750, 330, 50, 100);
        // gc.strokeText("1.13", 764, 360);
        //1.14
        gc.fillRect(840, 80, 50, 450);
        gc.strokeRect(840, 80, 50, 450);
        // gc.strokeText("1.14", 854, 110);
        //1.15
        gc.fillRect(930, 180, 50, 350);
        gc.strokeRect(930, 180, 50, 350);
        // gc.strokeText("1.15", 944, 210);
        //1.16
        gc.fillRect(1020, 230, 50, 300);
        gc.strokeRect(1020, 230, 50, 300);
        // gc.strokeText("1.16", 1034, 270);
        //1.17
        gc.fillRect(1110, 200, 50, 65);
        gc.strokeRect(1110, 200, 50, 65);
        // gc.strokeText("1.17", 1124, 230);
        //1.18
        gc.fillRect(1110, 265, 50, 65);
        gc.strokeRect(1110, 265, 50, 65);
        // gc.strokeText("1.18", 1124, 295);

        gc.setFill(Color.LIGHTGREEN);
        //3.3
        gc.fillRect(130, 520, 50, 50);
        gc.strokeRect(130, 520, 50, 50);
        //  gc.strokeText("3.3", 147, 550);
        //3.2
        gc.fillRect(310, 390, 50, 50);
        gc.strokeRect(310, 390, 50, 50);
        //  gc.strokeText("3.2", 327, 420);
        //3.1
        gc.fillRect(660, 110, 50, 50);
        gc.strokeRect(660, 110, 50, 50);
        //  gc.strokeText("3.1", 677, 140);


        gc.setFill(Color.GOLD);
        //4.4
        gc.fillOval(1020, 20, 50, 50);
        gc.strokeOval(1020, 20, 50, 50);
        //  gc.strokeText("4.4", 1037, 50);
        //4.5
        gc.fillOval(1020, 90, 50, 50);
        gc.strokeOval(1020, 90, 50, 50);
        //  gc.strokeText("4.5", 1037, 120);
        //4.6
        gc.fillOval(1020, 160, 50, 50);
        gc.strokeOval(1020, 160, 50, 50);
        //  gc.strokeText("4.6", 1037, 190);
        //4.1
        gc.fillOval(1110, 20, 50, 50);
        gc.strokeOval(1110, 20, 50, 50);
        //  gc.strokeText("4.1", 1127, 50);
        //4.2
        gc.fillOval(1110, 80, 50, 50);
        gc.strokeOval(1110, 80, 50, 50);
        // gc.strokeText("4.2", 1127, 110);
        //4.3
        gc.fillOval(1110, 140, 50, 50);
        gc.strokeOval(1110, 140, 50, 50);
        // gc.strokeText("4.3", 1127, 170);

    }

    public Canvas getCanvas() {
        return canvas;
    }
}

