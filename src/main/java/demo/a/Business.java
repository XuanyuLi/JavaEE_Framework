package demo.a;

/**
 * Created by lixuanyu
 * on 2017/7/6.
 */
public class Business {

//    private FloppyWrite floppyWrite;
    private UsbWrite usbWrite;
//    public Business(FloppyWrite floppyWrite) {
//        this.floppyWrite = floppyWrite;
//    }

    public Business(UsbWrite usbWrite) {
        this.usbWrite = usbWrite;
    }

    public void write() {
//        floppyWrite.writeToFloppy();
        usbWrite.writeToUsb();
    }
}
