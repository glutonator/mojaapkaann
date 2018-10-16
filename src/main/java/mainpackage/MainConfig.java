package mainpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    public KlasaA giveKlasaA() {
        return new KlasaA();
    }
}
