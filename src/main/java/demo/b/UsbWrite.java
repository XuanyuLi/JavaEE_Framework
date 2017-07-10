package demo.b;

/**
 * Created by lixuanyu
 * on 2017/7/6.
 */
public class UsbWrite implements DeviceWrite {
    @Override
    public void writeToDevice() {
        System.out.println("write to USB...");
    }
}
