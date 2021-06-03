/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String Noun = myApp.readNoun();
        String Verb = myApp.readVerb();
        String Adjective = myApp.readAdjective();
        String Adverb = myApp.readAdverb();
        String outputString = myApp.generateOutputString(Noun, Verb, Adjective, Adverb);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readNoun(){
        System.out.print("Enter a noun: ");
        return in.nextLine();
    }

    public String readVerb(){
        System.out.print("Enter a verb: ");
        return in.nextLine();
    }

    public String readAdjective(){
        System.out.print("Enter an adjective: ");
        return in.nextLine();
    }

    public String readAdverb() {
        System.out.print("Enter an adverb: ");
        return in.nextLine();
    }

    public String generateOutputString(String Noun, String Verb, String Adjective, String Adverb){
        return String.format("Do you %s your %s %s %s? That's hilarious!", Verb, Adjective, Noun, Adverb);
    }
}
