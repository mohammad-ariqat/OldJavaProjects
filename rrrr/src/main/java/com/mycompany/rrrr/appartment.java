
package com.mycompany.rrrr;


public class appartment {
    private char size;
    private int rooms;

    public appartment() {
        this.size = 'S';
        this.rooms = 3;
    }

    public appartment(char size, int rooms) {
        setSize(size);
        setRooms(rooms);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        if (size == 'S' || size == 'L') {
             this.size = size;
        }else{
            System.out.println("not allowed has to be S or L");
        }
      
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms >=1 && rooms<=8) {
             this.rooms = rooms; 
        }else{
            System.out.println("not allowed rooms has to be between 1 and 8");
        }
    }
    public double getSizeCost(){
        double sizeCost =0;
        if (size == 'S') {
            sizeCost = 15000;
            return sizeCost;
        }else{
            sizeCost = 30000;
            return sizeCost;
        
        }
            
    }
    
    public double getroomsCost(){
        double roomsCost =0;
        if (rooms >=1 && rooms <=2) {
            roomsCost = rooms * 4000;
            return roomsCost;
        }else if (rooms >=3 && rooms <=5) {
            roomsCost = rooms * 3000;
            return roomsCost;
    }else if (rooms >=6 && rooms <=8) {
            roomsCost = rooms * 2500;
            return roomsCost;
    }
     return roomsCost;
}
    public double getSaleCost(){
        double saleCost = getSizeCost() + getroomsCost() + 5000;
        return saleCost;
    }

    @Override
    public String toString() {
        return "appartment{" + "size=" + size + ", rooms=" + rooms + '}';
    }
    
}