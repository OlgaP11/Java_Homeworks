package homework_6;

import java.util.HashMap;

public class NoteBook {
    private String model;
    private String ram;
    private String hdd;
    private String os;
    private String color;

    public NoteBook(String model, String ram, String hdd, String os, String color)  {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os ;
        this.color = color;
        
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setMemory(String hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public HashMap <String, String> createMap (NoteBook n) {
        HashMap <String, String> map = new HashMap<>();
        map.put("model", n.getModel());
        map.put("RAM", n.getRam());
        map.put("HDD", n.getHdd());
        map.put("OS", n.getOs());
        map.put("Color", n.getColor());
        return map;
    }
}
