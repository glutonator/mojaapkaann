package mainpackage;

import org.springframework.beans.factory.annotation.Value;

public class KlasaA {
    @Value("xxxx")
    private String pole1;

    public void setPole1(String pole1) {
        this.pole1 = pole1;
    }

    public void func() {
        System.out.println(pole1);
        System.out.println("test");
    }
}
