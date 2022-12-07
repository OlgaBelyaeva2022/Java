package Seminar6;

import java.util.Objects;

public class Laptop {
    
    private int id;
    private String brand;
    private int ram_volume;
    private int sdd_volume;
    private String os;
    private int display_size;
    

    public Laptop(int id, String brand, int ram_volume, int sdd_volume, String os, int display_size){
        this.id = id;
        this.brand = brand;
        this.ram_volume = ram_volume;
        this.sdd_volume = sdd_volume;
        this.os = os;
        this.display_size = display_size;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String name) {
        this.brand = name;
    }

    public int getRAMvolume() {
        return ram_volume;
    }
    public void setRAMvolume(int volume) {
        this.ram_volume = volume;
    }

    public int getSDDvolume() {
        return sdd_volume;
    }
    public void setSDDvolume(int volume) {
        this.sdd_volume = volume;
    }

    public String getOS() {
        return os;
    }
    public void setOS(String type) {
        this.os = type;
    }

    public int getDispsize() {
        return display_size;
    }
    public void setDispsize(int size) {
        this.display_size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop){
            Laptop anotherLaptop = (Laptop) obj;
            if (!brand.equals(anotherLaptop.brand)) return false;
            if (!os.equals(anotherLaptop.os)) return false;
            if (display_size != anotherLaptop.display_size) return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, os, display_size);
    }

    @Override
    public String toString() {
        return "{id=" + id +", brand=" + brand +", ram_volume=" + ram_volume +", sdd_volume="+ sdd_volume +", os=" + os +", display_size=" + display_size +"}";
    }
}


