package de.tum.cit.aet;

/**
 * This class represents a lecture with various attributes and methods.
 * 
 * Part 1: Attributes and Constructor
 * Part 2: Methods (getters, setters, and additional methods)
 * Part 3: Test your implementation (optional)
 */
public class Lecture {
    
    /**
     * TODO 1.1: Add Attributes to Lecture Class
     * 
     * Take a look at the UML Diagram and add the corresponding attributes:
     * - lectureName (String)
     * - numberOfInscribedStudents (int)
     * - numberOfGuestStudents (int)
     * - numberOfLecturers (int)
     * - numberOfTutors (int)
     */
    private String lectureName;
    private int numberOfInscribedStudents;
    private int numberOfGuestStudents;
    private int numberOfLecturers;
    private int numberOfTutors;
    private int numberOfAlumni;

    public Lecture(String lectureName, int numberOfInscribedStudents,int numberOfGuestStudents, int numberOfLecturers, int numberOfTutors) {
        this.lectureName = lectureName;
        this.numberOfGuestStudents = numberOfGuestStudents;
        this.numberOfInscribedStudents = numberOfInscribedStudents;
        this.numberOfLecturers = numberOfLecturers;
        this.numberOfTutors = numberOfTutors;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public int getNumberOfInscribedStudents() {
        return numberOfInscribedStudents;
    }

    public void setNumberOfInscribedStudents(int numberOfInscribedStudents) {
        this.numberOfInscribedStudents = numberOfInscribedStudents;
    }

    public int getNumberOfGuestStudents() {
        return numberOfGuestStudents;
    }

    public void setNumberOfGuestStudents(int numberOfGuestStudents) {
        this.numberOfGuestStudents = numberOfGuestStudents;
    }

    public int getNumberOfLecturers() {
        return numberOfLecturers;
    }

    public void setNumberOfLecturers(int numberOfLecturers) {
        this.numberOfLecturers = numberOfLecturers;
    }

    public int getNumberOfTutors() {
        return numberOfTutors;
    }

    public void setNumberOfTutors(int numberOfTutors) {
        this.numberOfTutors = numberOfTutors;
    }

    /**
     * TODO 1.2: Implement a Constructor for Lecture Class
     * 
     * Create a constructor that initialises every attribute of the Lecture class.
     * Pay attention to the order of the attributes in the constructor, and make sure
     * it follows the same order from the UML diagram.
     * 
     * @param lectureName the name of the lecture
     * @param numberOfInscribedStudents the number of inscribed students
     * @param numberOfGuestStudents the number of guest students
     * @param numberOfLecturers the number of lecturers
     * @param numberOfTutors the number of tutors
     */

    /**
     * TODO 2.1: Implement Getters
     * 
     * Implement getters for each attribute of the Lecture class:
     * - getLectureName()
     * - getNumberOfInscribedStudents()
     * - getNumberOfGuestStudents()
     * - getNumberOfLecturers()
     * - getNumberOfTutors()
     */

    /**
     * TODO 2.2: Implement Setters
     * 
     * Implement setters for each attribute of the Lecture class:
     * - setLectureName(String)
     * - setNumberOfInscribedStudents(int)
     * - setNumberOfGuestStudents(int)
     * - setNumberOfLecturers(int)
     * - setNumberOfTutors(int)
     */

    /**
     * TODO 2.3: Implement Custom String
     * 
     * Implement a custom toString() method which describes the lecture in detail.
     * It has to make use of every attribute, but feel free to format it as you like.
     * 
     * Example format:
     * Lecture{lectureName='Introduction to Programming', numberOfInscribedStudents='600',
     * numberOfGuestStudents='200', numberOfLecturers='14', numberOfTutors='40'}
     * 
     * @return a string representation of the lecture
     */

     @Override
     public String toString(){
        return "Lecture{lectureName='"+lectureName+"', numberOfInscribedStudents='"+numberOfInscribedStudents+"',numberOfGuestStudents='"+numberOfGuestStudents+"', numberOfLecturers='"+numberOfLecturers+"', numberOfTutors='"+numberOfTutors+"'}";
     }
    /**
     * TODO 2.4: Implement Total Number of Students
     * 
     * Implement a getTotalNumberOfStudents() method which returns the total number
     * of students (inscribed + guest students).
     * Tip: Check the expected return type in the UML diagram.
     * 
     * @return the total number of students
     */
    public int getTotalNumberOfStudents(){
        return getNumberOfGuestStudents() + getNumberOfInscribedStudents();
    }

    /**
     * TODO 2.5: Implement Lecture Name and Total Number of Students
     * 
     * Implement a getNameAndTotalNumberOfStudents() method which returns a String
     * of the following format: LectureName (TotalNumberOfStudents)
     * 
     * @return lecture name with total number of students in parentheses
     */

     public String getNameAndTotalNumberOfStudents(){
        return ""+lectureName+" ("+getTotalNumberOfStudents()+")";
     }
    /**
     * TODO 2.6: Implement Number of Students Per Tutor
     * 
     * Implement a getNumberOfStudentsPerTutor() method which returns the number
     * of students per tutor calculated using the total number of students.
     * This exercise assumes that the total number of tutors is never 0.
     * 
     * @return the number of students per tutor
     */
    public int getNumberOfStudentsPerTutor(){
        return getTotalNumberOfStudents()/getNumberOfTutors();
    }

    /**
     * TODO 2.7: Implement Add Guest Students
     * 
     * Implement a addGuestStudents(int) method which adds a new number of guest
     * students to the lecture.
     * 
     * @param numberOfNewGuestStudents the number of guest students to add
     */

     public void addGuestStudents(int amount){
        this.numberOfGuestStudents += amount;
    
     }
     
     public void addAlumni(int alumniCount) {
        this.numberOfAlumni += alumniCount;
     }

    public double ratioOfStudentsToGuestsInNextSemester(int newGuestStudents){
        return (newGuestStudents+getNumberOfGuestStudents()/getNumberOfInscribedStudents());
    }
}
