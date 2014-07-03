package com.spark.guice;

import com.google.inject.Inject;
import com.google.inject.Module;
import com.google.inject.name.Named;
import spark.servlet.SparkGuiceApplication;

import static spark.Spark.get;

public class ExampleService implements SparkGuiceApplication {

    @Inject @Named("welcome-message") String welcomeMessage;

    @Override public void init() {

        get("/ping", (request, response) -> {
            System.out.println("** ping request");
            response.type("text/plain");
            return welcomeMessage;
        });

    }

    @Override public Module[] modules() {
        return new Module[] {new ExampleModule()} ;
    }

    @Override public void destroy() {
        System.out.println("** destroy");
        // called when destroying context
    }

}