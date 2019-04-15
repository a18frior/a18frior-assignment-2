package org.brohede.marcus.listviewapp;

public class Mountain {
    private String namn;
    private String plats;
    private int hojd;

    public Mountain(){


        super();
    }
    public String info(){
        String tmp;
        tmp= this.plats+" "+ this.hojd;
        return tmp;
    }


    public Mountain(String namn, String plats, int hojd){
        super();
        this.namn= namn;
        this.plats=plats;
        this.hojd=hojd;
    }


    @Override
    public String toString() {

        return this.namn;
    }

}
