package de.tum.cit.aet;

/**
 * This class represents a lecture with various attributes and methods.
 * 
 * Part 1: Attributes and Constructor
 * Part 2: Methods (getters, setters, and additional methods)
 * Part 3: Test your implementation (optional)
 */
public class Lecture {
    
  
    private String lectureName;
    private int numberOfInscribedStudents;
    private int numberOfGuestStudents;
    private int numberOfLecturers;
    private int numberOfTutors;
    private int alumniStudents;
    private int lectureCapacity;
    private int numberofRecurringTutors;
    
    public Lecture(String lectureName, int numberOfInscribedStudents,int numberOfGuestStudents, int numberOfLecturers, int numberOfTutors, int lectureCapacity) {
        this.lectureName = lectureName;
        this.numberOfGuestStudents = numberOfGuestStudents;
        this.numberOfInscribedStudents = numberOfInscribedStudents;
        this.numberOfLecturers = numberOfLecturers;
        this.numberOfTutors = numberOfTutors;
        this.lectureCapacity = lectureCapacity;        
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

     public int getNumberOfRecurringTutors() {
        return numberofRecurringTutors;
    }

    public void setnumberOfRecurringTutors(int numberOfRecurringTutors) {
        this.numberofRecurringTutors = numberOfRecurringTutors;
    }




     @Override
     public String toString(){
        return "Lecture{lectureName='"+lectureName+"', numberOfInscribedStudents='"+numberOfInscribedStudents+"',numberOfGuestStudents='"+numberOfGuestStudents+"', numberOfLecturers='"+numberOfLecturers+"', numberOfTutors='"+numberOfTutors+"'}";
     }
 
    public int getTotalNumberOfStudents(){
        return getNumberOfGuestStudents() + getNumberOfInscribedStudents();
    }


     public String getNameAndTotalNumberOfStudents(){
        return ""+lectureName+" ("+getTotalNumberOfStudents()+")";
     }

    public int getNumberOfStudentsPerTutor(){
        return getTotalNumberOfStudents()/getNumberOfTutors();
    }


     public double getRatioOfRecurrentTutors(){
        return (getNumberOfRecurringTutors()/getNumberOfTutors());
    
    }

    
    public boolean addStudents(int amount){
        //TODO : implement this!
        return false;
    }

    
   public double studentToGuestRatio(){
    return (getNumberOfGuestStudents()/getTotalNumberOfStudents());
    }

    private boolean checkIfInCapacity(){
        return getTotalNumberOfStudents() <= lectureCapacity;
    }
}
