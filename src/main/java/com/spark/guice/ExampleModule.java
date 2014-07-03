package com.spark.guice;


import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

public class ExampleModule extends AbstractModule {

    @Provides @Singleton @Named("welcome-message")
    public String welcomeMessage() {
        return "Welcome from Spark Guice";
    }

    @Override protected void configure() {
    }

}
