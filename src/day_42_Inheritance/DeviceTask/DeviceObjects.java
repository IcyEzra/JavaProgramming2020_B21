package day_42_Inheritance.DeviceTask;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv = new TV("Samsung","LX32",499.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOff();
        tv.turnOn();

        Phone phone = new Phone("iPhone","12 Pro Max",999.99);
        phone.turnOff();
        phone.turnOn();
        phone.call(911);
        phone.texting(1234567891);

        System.out.println(TV.hasBattery);

        Radio radio = new Radio("Panasonic","Super Radio Max",59.99);
        radio.turnOff();
        radio.changeFrequency("AM");
        radio.changeStation("Z100");

    }

}
