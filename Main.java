import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args){
        shop DNS = new shop("DNS");
        PC product1 = new PC("GTX 2210",
                "ZXC 421","i9-5700","16 GB");
        notebook product2 = new notebook("GTX-670M",
                "intel-MX009","i5-9900",
                "8 GB",60000,"16x9",10);
        product1.setBody("small ACP 40x20");
        product1.setBodyPrice(7000);
        product1.setMotherPrice(14000);
        product1.setProcesorPrice(26000);
        product1.setRamPrice(4000);
        product1.setVideoCardPrice(32000);
        System.out.println(product1.getPrice() + " руб");
    }
}
