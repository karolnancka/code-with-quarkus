package com.karolnancka.learning;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingConfig {
    String receipient = "Karol student";

    public void setReceipient(String receipient) {
        this.receipient = receipient;
    }

    public String getReceipient() {
        return receipient;
    }
}

