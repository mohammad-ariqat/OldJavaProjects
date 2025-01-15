
package com.mycompany.oop22;


public class setget {
    private int stId;
    private String stname;
    private int grades []=new int [3];
    private double avg;

    public setget() {
    
    
    
    }

    public setget(int stId, String stname, double avg) {
        this.stId = stId;
        this.stname = stname;
        this.avg = avg;
    }

    /**
     * @return the stId
     */
    public int getStId() {
        return stId;
    }

    /**
     * @param stId the stId to set
     */
    public void setStId(int stId) {
        this.stId = stId;
    }

    /**
     * @return the stname
     */
    public String getStname() {
        return stname;
    }

    /**
     * @param stname the stname to set
     */
    public void setStname(String stname) {
        this.stname = stname;
    }

    /**
     * @return the grades
     */
    public int[] getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    /**
     * @return the avg
     */
    public double getAvg() {
        return avg;
    }

    /**
     * @param avg the avg to set
     */
    public void setAvg(double avg) {
        this.avg = avg;
    }
    
    
    
            
}
