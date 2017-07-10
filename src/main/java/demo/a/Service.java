package demo.a;

/**
 * Created by lixuanyu
 * on 2017/7/6.
 */
public class Service {
    public static void main(String[] args) {
        Business business = new Business(new UsbWrite());
        business.write();
    }
}
