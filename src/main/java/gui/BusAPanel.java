package main.java.gui;

import main.java.logic.BookManager;
import main.java.logic.BusA;
import main.java.logic.Seat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BusAPanel extends JPanel implements ActionListener {

    BusA bus;
    BookManager manager = BookManager.getInstance();
    ArrayList<Seat> seatsToCheck = new ArrayList<>();
    JButton bookButton;
    JButton backButton;

    public BusAPanel(BusA bus) {
        super();
        this.setLayout(new GridLayout(3,10));
        this.setVisible(false);
        this.bus = bus;
        this.setBounds(0,0,GuiUtil.WIDTH,GuiUtil.HEIGHT);
        this.setBackground(Color.GRAY);
        bookButton = new JButton("BOOK");
        bookButton.setBounds(GuiUtil.WIDTH/2,GuiUtil.HEIGHT-50,150,80);

        backButton = new JButton("BACK");
        backButton.setBounds(0,0,150,80);
        backButton.addActionListener(this);

        this.add(bookButton);
        this.add(backButton);

        for(Seat s : bus.getSeats()){
            SeatButton sb = new SeatButton(s,seatsToCheck);
            this.add(sb);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bookButton){
            if(manager.checkAvailability(seatsToCheck)){
                for(Seat s : seatsToCheck){
                    s.setAvailable(false);
                }
            }else {
                for(Seat s : manager.getTakenSeats()){
                    JOptionPane.showMessageDialog(this,"El asiento "+s.getId()+"ya esta ocupado.", "Error!",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }if(e.getSource() == backButton){
            this.setVisible(false);


        }
    }
}
