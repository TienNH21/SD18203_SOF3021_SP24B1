package fplhn.ptpm.sd18203.configs;

import fplhn.ptpm.sd18203.dto.mau_sac.StoreRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfig {
    @Bean("white")
    public StoreRequest configBean1()
    {
        StoreRequest r1 = new StoreRequest(1, "#000", "WHITE");
        return r1;
    }

    @Bean("red")
    public StoreRequest configBean2()
    {
        StoreRequest r2 = new StoreRequest(2, "#ff0000", "RED");
        return r2;
    }
}
