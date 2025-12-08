package de.tum.cit.aet;

/**
 * Main class for testing the Lecture implementation.
 */
public class Main {
    
    /**
     * TODO 3: Test your implementation
     * 
     * Instantiate Lecture objects and test the methods to make sure they work properly.
     * Use System.out.println() to print out the return values.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // TODO 3: Add your test code here

        Lecture l = new Lecture("",10,7,3,5);
        System.out.println(l.getNumberOfStudentsPerTutor());
    }
}