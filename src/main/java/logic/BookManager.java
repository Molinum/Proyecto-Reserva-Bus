package main.java.logic;

import java.util.ArrayList;

public class BookManager {
    private Passenger user;
    private ArrayList<Seat> takenSeats;

    private static BookManager manager;
    private BookManager(){}

    public static BookManager getInstance(){
        if (BookManager.manager == null){
            BookManager.manager = new BookManager();
        }
        return BookManager.manager;
    }
    public boolean checkAvailability(ArrayList<Seat> seatsToCheck){
        this.takenSeats = new ArrayList<>();
        for (Seat s : seatsToCheck){
            if (!s.isAvailable()){
                takenSeats.add(s);
            }
        }
        return this.takenSeats.isEmpty();
    }

    public ArrayList<Seat> getTakenSeats() {
        return takenSeats;
    }

    public void setTakenSeats(ArrayList<Seat> takenSeats) {
        this.takenSeats = takenSeats;
    }

    public Passenger getUser() {
        return user;
    }

    public void setUser(Passenger user) {
        this.user = user;
    }
}
