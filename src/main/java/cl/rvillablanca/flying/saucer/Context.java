package cl.rvillablanca.flying.saucer;

import cl.rvillablanca.flying.saucer.service.DefaultFlyingSaucerService;
import cl.rvillablanca.flying.saucer.service.FlyingSaucerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring context
 *
 * @author Rodrigo Villablanca
 */
@Configuration
public class Context {

    @Bean
    FlyingSaucerService flyingSaucerService() {
        return new DefaultFlyingSaucerService();
    }
}
