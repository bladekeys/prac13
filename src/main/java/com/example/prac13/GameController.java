package com.example.prac13;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.File;

public class GameController {
    private int tap;
    boolean[] mask = new boolean[9];
    boolean[] maso = new boolean[9];

    public GameController() {
        tap = 0;
    }

    @FXML
    private Label label;

    @FXML
    public ImageView imageView0;
    public ImageView imageView1;
    public ImageView imageView2;
    public ImageView imageView3;
    public ImageView imageView4;
    public ImageView imageView5;
    public ImageView imageView6;
    public ImageView imageView7;
    public ImageView imageView8;

    @FXML
    public void onButtonClick0() {
        if (!mask[0] && !maso[0]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView0.setImage(image);
                mask[0] = true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView0.setImage(image);
                maso[0] = true;
            }
        }
        win();
        tap++;
    }

    public void onButtonClick1() {
        if (!mask[1] && !maso[1]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView1.setImage(image);
                mask[1] = true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView1.setImage(image);
                maso[1] = true;
            }
        }
        win();
        tap++;
    }

    public void onButtonClick2() {
        if (!mask[2] && !maso[2]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView2.setImage(image);
                mask[2] = true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView2.setImage(image);
                maso[2] = true;
            }
        }
        win();
        tap++;
    }

    public void onButtonClick3() {
        if (!mask[3] && !maso[3]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView3.setImage(image);
                mask[3] = true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView3.setImage(image);
                maso[3] = true;
            }
        }
        win();
        tap++;
    }

    public void onButtonClick4() {
        if (!mask[4] && !maso[4]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView4.setImage(image);
                mask[4] = true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView4.setImage(image);
                maso[4] = true;

            }
        }
        win();
        tap++;
    }

    public void onButtonClick5() {
        if (!mask[5] && !maso[5]) {
                                if (tap % 2 == 0) {
                                    File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                                    String localUrl = file.toURI().toString();
                                    Image image = new Image(localUrl);
                                    imageView5.setImage(image);
                                    mask[5] = true;
                                }
                                if (tap % 2 == 1) {
                                    File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                                    String localUrl = file.toURI().toString();
                                    Image image = new Image(localUrl);
                                    imageView5.setImage(image);
                                    maso[5] = true;

                                }
                            }
        win();
        tap++;
    }

    public void onButtonClick6() {
        if (!mask[6] && !maso[6]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView6.setImage(image);
                mask[6] = true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView6.setImage(image);
                maso[6] = true;
            }
        }
        win();
        tap++;
    }

    public void onButtonClick7() {
        if (!mask[7] && !maso[7]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView7.setImage(image);
                mask[7] = true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView7.setImage(image);
                maso[7] = true;

            }
        }
        win();
        tap++;
    }

    public void onButtonClick8() {
        if (!mask[8] && !maso[8]) {
            if (tap % 2 == 0) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/1.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView8.setImage(image);
                mask[8]=true;
            }
            if (tap % 2 == 1) {
                File file = new File("C:/Users/vladl/IdeaProjects/prac13/src/main/java/com/example/prac13/2.png");
                String localUrl = file.toURI().toString();
                Image image = new Image(localUrl);
                imageView8.setImage(image);
                maso[8]=true;
            }
            win();
        }
        tap++;
    }

    private void win() {
        if ((mask[0] && mask[1] && mask[2]) | (mask[3] && mask[4] && mask[5]) | (mask[6] && mask[7] && mask[8]) | (mask[0] && mask[3] && mask[6]) | (mask[1] && mask[4] && mask[7]) | (mask[2] && mask[5] && mask[8]) | (mask[0] && mask[4] && mask[8]) | (mask[2] && mask[4] && mask[6])) {
            label.setText("Крестики победили");
            imageView0.setImage(null);
            imageView1.setImage(null);
            imageView2.setImage(null);
            imageView3.setImage(null);
            imageView4.setImage(null);
            imageView5.setImage(null);
            imageView6.setImage(null);
            imageView7.setImage(null);
            imageView8.setImage(null);
            for (int i = 0; i <= 8; i++) mask[i] = false;
        } else {
            if ((maso[0] && maso[1] && maso[2]) | (maso[3] && maso[4] && maso[5]) | (maso[6] && maso[7] && maso[8]) | (maso[0] && maso[3] && maso[6]) | (maso[1] && maso[4] && maso[7]) | (maso[2] && maso[5] && maso[8]) | (maso[0] && maso[4] && maso[8]) | (maso[2] && maso[4] && maso[6])) {
                label.setText("Нолики победили");
                imageView0.setImage(null);
                imageView1.setImage(null);
                imageView2.setImage(null);
                imageView3.setImage(null);
                imageView4.setImage(null);
                imageView5.setImage(null);
                imageView6.setImage(null);
                imageView7.setImage(null);
                imageView8.setImage(null);
                for (int i = 0; i <= 8; i++) maso[i] = false;
            }
        }
    }
    }