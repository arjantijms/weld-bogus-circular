package test;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AppBean {

    @Inject
    private String string1;
    
    @Inject
    private String string2;
    
    public void print() {
        System.out.println("String 1:" + string1 + " String 2:" + string2);
    }
    
}
