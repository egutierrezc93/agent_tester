package com.runfalcon.agent_tester;

import spark.Request;
import spark.Response;
import spark.Route;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class MainClass {

    private static List<MyClass> myList = new ArrayList<>();

    private static final int PORT = 80;

    public static void main(String[] args) {
        System.out.println("Hello World!!");

        port(PORT);

        get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                myList.add(new MyClass());
                response.type("application/json");
                response.status(201);
                return "{\"response-message\": \"Hello World!!\"}";
            }
        });
    }
}
