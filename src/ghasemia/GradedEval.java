package ghasemia;

/**
 * Assignment 2
 *
 * Program : Making a library
 *
 * This is a library, and it contains 4 classes. This class name is GradedEval,
 * and it consists of 2 fields, 3 constructors, and getter and setter of fields.
 *
 * @author Amirmahdi Ghasemi, June 2020
 */
/**
 * This class name is GradedEval, and it extends the evaluation class. This
 * class has all the above-mentioned information.
 *
 */
public class GradedEval extends Evaluation {

    /**
     * This is a private double, and its name is grade. The value of grade
     * cannot be less than 0, and the default value is 0.
     */
    private double grade = 0;
    /**
     * This is a private double, and its name is maxGrade. The value of maxGrade
     * cannot be less than 0, and the default value is 10.
     */
    private double maxGrade = 10;

    /**
     * This is a default constructor of GradedEval class and, it contains a
     * super keyword, and it means to call a method defined in the superclass.
     */
    public GradedEval() {
        super();
    }

    /**
     * This is the second constructor of GradedEval class and, it contains a
     * super keyword with 2 parameters, and it means that it is going to call
     * second constructor defined in the superclass.
     *
     * @param title
     * @param weight
     */
    public GradedEval(String title, double weight) {
        super(title, weight);
    }

    /**
     * This is the multi constructor of GradedEval class, it contains a super
     * keyword with 2 parameters, and it means that it is going to call
     * constructor defined in the superclass. It has two more parameters that
     * they are mentioned.
     *
     * @param title
     * @param weight
     * @param grade
     * @param maxGrade
     */
    public GradedEval(String title, double weight, double grade, double maxGrade) {
        super(title, weight);
        this.grade = grade;
        this.maxGrade = maxGrade;
    }

    /**
     * This method gets the grade that was entered by the user.
     *
     * @return this grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Creates a new grade with a given actual grade, and the only condition is
     * the grade cannot be less than 0. If the grade is less than 0, it will
     * throw an exception.
     *
     * @param grade
     */
    public void setGrade(double grade) {
        if (grade < 0) {
            throw new IllegalArgumentException("The grade must be greater than zero");
        } else {
            this.grade = grade;
        }
    }

    /**
     * This method gets the maxGrade that was entered by the user.
     *
     * @return this maxGrade
     */
    public double getMaxGrade() {
        return maxGrade;
    }

    /**
     * Creates a new maxGrade with a given maxGrade, and the only condition is
     * the maxGrade must be greater than 0. If the maxGrade is less than 0, it
     * will throw an exception. The default is value is 10.
     *
     * @param maxGrade
     */
    public void setMaxGrade(double maxGrade) {
        if (maxGrade < 0) {
            throw new IllegalArgumentException("The Max Grade must be greater than zero");
        } else {
            this.maxGrade = maxGrade;
        }
    }

    /**
     * This method return the String of getGrade and getMaxGrade with one
     * decimal place.
     *
     * @return this toString
     */
    @Override
    public String toString() {
        return String.format(getGrade() + " / " + getMaxGrade());
    }

    /**
     * This method return a double that was calculated by the below formula, the
     * value of these was entered by the user. The getWeight is going to call
     * the superclass.
     *
     * @return this achivedWeight
     */
    @Override
    public double achivedWeight() {
        double r = getGrade() / getMaxGrade() * getWeight();
        double rounder = Math.round(r * 10.0) / 10.0;
        return rounder;
    }
}
