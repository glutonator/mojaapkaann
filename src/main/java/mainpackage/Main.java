package mainpackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MainConfig.class);
        context.refresh();

//        KlasaA klasaA = (KlasaA) context.getBean("giveKlasaA");
//        or
        KlasaA klasaA = context.getBean(KlasaA.class);
//        klasaA.setPole1("pppp");
        klasaA.func();

        context.close();
    }
}
