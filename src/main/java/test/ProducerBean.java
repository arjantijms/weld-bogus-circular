package test;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class ProducerBean {

    @Produces
    public String produce() {
        return "test";
    }
    
}
