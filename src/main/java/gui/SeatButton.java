package main.java.gui;

import main.java.logic.Seat;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class SeatButton extends JToggleButton {
    Seat seat;
    public SeatButton(Seat seat, ArrayList<Seat> seatsToCheck) {
        super();
        this.seat = seat;
        this.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    seatsToCheck.add(seat);
                } else {
                    seatsToCheck.remove(seat);
                }
            }
        });

    }
}
