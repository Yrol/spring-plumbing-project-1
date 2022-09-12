package com.yrol.plumbing.services;

import com.yrol.plumbing.menu.IFood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Constructor injection using a Service
 * */
@Service
public class MenuService {

    private IFood iFood;

    /**
     * Method 1 - Injecting IFood to the constructor, the implementation Spaghetti (instead of Lasagna) will be injected since its marked as @Primary
     * */
    @Autowired
    public MenuService(IFood iFood) {
        super();
        this.iFood = iFood;
    }

    /**
     * Method 2 - Using a Qualifier.
     * Explicit injection assuming @Primary isn't defined in any of the implementation.
     * NOTE: the Bean (actual class) name must start with a lower case fot the Qualifier.
     * */
//    public MenuService(@Qualifier("lasagna"), IFood iFood) {
//        this.iFood = iFood;
//    }

}
