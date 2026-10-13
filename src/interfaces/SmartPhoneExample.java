package interfaces;

class Phone {
    public void call() {
        System.out.println("Phone calling!");
    }
    public void sms() {
        System.out.println("Phone is sending sms!");
    }
}
interface ICamera{
    void click();
    void recordVideo();
}
interface IMusic{
    void play();
    void stop();
}
class SmartPhone extends Phone implements ICamera, IMusic{
    @Override
    public void click() {
        System.out.println("ICamera clicks picture!");
    }
    @Override
    public void recordVideo() {
        System.out.println("ICamera recording video!");
    }
    @Override
    public void play() {
        System.out.println("IMusic is playing music!");
    }
    @Override
    public void stop(){
        System.out.println("IMusic has stopped music!");
    }
}

public class SmartPhoneExample {
    static void main() {
        SmartPhone mySmartPhone = new SmartPhone();
        mySmartPhone.call();
        mySmartPhone.sms();
        mySmartPhone.click();
        mySmartPhone.recordVideo();
        mySmartPhone.play();
        mySmartPhone.stop();
    }
}
