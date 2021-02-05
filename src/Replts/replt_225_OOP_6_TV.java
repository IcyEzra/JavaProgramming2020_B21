package Replts;

public class replt_225_OOP_6_TV {

    public int channel = 1, volumeLevel = 1;
    public boolean on = false;
    public String brand = "undefined";

    public replt_225_OOP_6_TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public replt_225_OOP_6_TV(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel(){
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel){
        if(volumeLevel < 1 || volumeLevel > 7 && on == false){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

        this.volumeLevel = volumeLevel;

    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel <= 0 || channel >= 120){
            System.out.println("ERROR: TV is either OFF or invalid channel");
        }else{
            this.channel = channel;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        channel += 1;
    }

    public void channelDown(){
        channel -= 1;
    }

    public void volumeUp(){
        volumeLevel += 1;
    }

    public void volumeDown(){
        volumeLevel -= 1;
    }

    public boolean isOn(){
        if(on == true){
            return true;
        }else{
            return false;
        }
    }

    public void turnOn(){
        if(on == true){
            System.out.println("TV is already ON");
        }else{
            on = true;
        }
    }

    public void turnOff(){
        if(on == false){
            System.out.println("TV is already OFF");
        }else{
            on = false;
        }
    }



}
