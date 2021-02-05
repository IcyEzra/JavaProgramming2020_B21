package day_45_Exceptions.PhoneTask;

public class Walmart {

    public static void main(String[] args) {

        long number = 911;
        iPhone iPhone = new iPhone("12 Pro Max",1300);
        Samsung samsung = new Samsung("S20",1200);
        Nokia nokia = new Nokia("Brick",70);
        HuaWei huaWei = new HuaWei("iSpy",300);

        iPhone.call(number);
        samsung.call(number);
        nokia.call(number);
        huaWei.call(number);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println(huaWei);

        iPhone.faceTime(123456);
        // samsung.faceTime(123456); won't work

        samsung.freeze();
        nokia.selfDefense();
        huaWei.spy();

    }

}
