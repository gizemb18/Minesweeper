

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.List;
import java.*;
import java.util.*;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.audio.*;

public class Mines {

    boolean lockButton = false;

    public void putMines(JPanel panel, JFrame frame, int width, int height, int minesCount) {

        int btnW = 35;
        int btnH = 35;
        int offset = 70;
        frame.setSize(((btnW * width) + 6), (height * btnH) + offset + btnH + 70);
        lockButton = false;
        panel.removeAll();

        boolean[] isMines = new boolean[width * height];
        int[] mined = new int[minesCount];
        int isMine = 0;
        Random rnd = new Random();
        for (int i = 0; i < minesCount; i++) {

            do {
                isMine = rnd.nextInt(isMines.length - 1);
            } while (isMines[isMine]);
            isMines[isMine] = true;
            mined[i] = isMine;
        }

        int cnt = 0;
        for (int _y = 0; _y < height; _y++) {
            for (int _x = 0; _x < width; _x++) {
                JButton button = new JButton();
                button.setName("btn" + cnt);
                button.setSize(btnW, btnH);
                button.setMargin(new Insets(0, 0, 0, 0));
                button.getInsets().set(0, 0, 0, 0);
                button.getInsets().bottom = 0;
                button.getInsets().top = 0;
                button.getInsets().left = 0;
                button.getInsets().right = 0;
                button.setHorizontalAlignment(0);
                button.setVerticalAlignment(0);
                button.setPreferredSize(new Dimension(btnW, btnH));

                cnt++;
                button.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!lockButton) {

                            JButton btn = (JButton) e.getSource();
                            int index = Integer.parseInt(btn.getName().replace("btn", ""));

                            if (isMines[index]) {

                                try {

                                    try {
                                        btn.setIcon(new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("\\virus.png"))));
                                        for (int ind = 0; ind < mined.length; ind++) {
                                            ((JButton) panel.getComponent(mined[ind])).setIcon(new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("\\virus.png"))));
                                        }
                                    } catch (IOException ex) {
                                        Logger.getLogger(Mines.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                   lockButton = true;  
                                    try {
                                        InputStream a = new FileInputStream("oyunBitti.wav");
                                        AudioStream b = new AudioStream(a);
                                        AudioPlayer.player.start(b);
                                        
                                    } catch (IOException iOException) {
                                    }

                                    JOptionPane.showMessageDialog(null, null, "Minesweeper", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(ImageIO.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("\\pictureGame.png"))));
                                } catch (IOException ex) {
                                    Logger.getLogger(Mines.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }}
                    }
                });
                button.setLocation(btnW * _x, btnH * _y);
                panel.add(button);
            }
        }
        panel.updateUI();

    }
}
