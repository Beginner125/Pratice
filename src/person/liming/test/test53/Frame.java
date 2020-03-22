package person.liming.test.test53;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

/**
 * @author liuliming
 * @Description
 * @Date: Created in 18:182019/12/3
 */
public class Frame extends JFrame {
    JButton next;
    JButton pre;
    ZPlane pic;
    JLabel label;
    JTextArea textArea;
    File[] pics;
    String path = "F:\\grammerResource\\move";
    int pic_point = 0;
    {
        next = new JButton("下一张图");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    nextPic();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        pre = new JButton("上一张图");
        pre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    prePic();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        pic = new ZPlane();
        pic.setSize(500, 300);
        textArea = new JTextArea();
        label = new JLabel("图片标签");
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("arg0.getModifiers()=" + e.getModifiers());
                System.out.println("arg0.getKeyCode()=" + e.getKeyCode());
                // CTRL+ENTER按下
                if (e.getModifiers() == 2 && e.getKeyCode() == 10) {
                    System.out.println("CTRL+Enter......");
                    String text = textArea.getText().replaceAll("\n", " ");
                    File file = new File(path+"\\"+text+".jpg");
                    pics[pic_point].renameTo(file);
                    pics[pic_point] = file;
                    next.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    Frame(){
        add(next, BorderLayout.EAST);
        add(pre, BorderLayout.WEST);
        add(pic, BorderLayout.CENTER);
        add(label, BorderLayout.NORTH);
        add(textArea, BorderLayout.SOUTH);
        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setBounds(300, 0, 800, 750);
        setVisible(true);
    }

    private void init() throws Exception {
        File file = new File(path);
        if(!file.exists()){
            throw new Exception("没有图片文件路径");
        }
        pics = file.listFiles();
        pic.setImage(ImageIO.read(pics[pic_point]));
        label.setText(pics[pic_point].getName());
    }

    private void nextPic() throws IOException {
        pic_point++;
        label.setText(pics[pic_point].getName());
        pic.setImage(ImageIO.read(pics[pic_point]));
        textArea.setText(pics[pic_point].getName().split("\\.")[0]);
        pic.repaint();
    }

    private void prePic() throws IOException {
        pic_point--;
        label.setText(pics[pic_point].getName());
        pic.setImage(ImageIO.read(pics[pic_point]));
        pic.repaint();
    }
}
