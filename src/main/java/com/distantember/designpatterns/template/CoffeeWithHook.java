package com.distantember.designpatterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jondann on 2/11/17.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    public void brew(){
        System.out.println("dripping coffee through filter");
    }

    public void addCondiments(){
        System.out.println("adding sugar and milk");
    }

    public boolean customerWantsCondiments(){

        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput(){

        String answer = "no";

        System.out.println("Would you like milk and sugar with your coffee (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e){
            System.err.println("IO error trying to read your answer");
        }

        return answer;
    }
}
