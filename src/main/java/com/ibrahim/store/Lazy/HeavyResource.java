package com.ibrahim.store.Lazy;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // this mean that HeavyResource is not created until we need it
public class HeavyResource {

    public HeavyResource() {
        System.out.println("Heavy Resource CREATED");
    }
}
