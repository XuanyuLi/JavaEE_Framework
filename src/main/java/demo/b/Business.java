package demo.b;

/**
 * Created by lixuanyu
 * on 2017/7/6.
 */
public class Business {
    private DeviceWrite deviceWrite;
    public Business(DeviceWrite deviceWrite) {
        this.deviceWrite = deviceWrite;
    }


    public void write() {
        deviceWrite.writeToDevice();
    }
}
