package ghasemia;

/**
 *
 * Program : Making a library
 *
 * This is a library, and it contains 4 classes. This class name is FieldEval,
 * and it consists of 2 fields, 3 constructors, and getter and setter of fields.
 *
 * @author Amirmahdi Ghasemi, June 2020
 */
/**
 * This class name is FieldEval, and it extends the evaluation class. This class
 * has all the above-mentioned information.
 */
public class FieldEval extends Evaluation {

    /**
     * This is a private double, and its name is performance. The value of
     * performance has to be greater than 0, and it's usually out of 100.
     */
    private double performance;
    /**
     * This is a private double, and its name is employerEval. The value of
     * employerEval has to be greater than 0, and it's usually out of 100.
     */
    private double employerEval;

    /**
     * This is a default constructor of employerEval class and, it contains a
     * super keyword, and it means to call a method defined in the superclass.
     */
    public FieldEval() {
        super();
    }

    /**
     * This is the second constructor of employerEval class and, it contains a
     * super keyword with 2 parameters, and it means that it is going to call
     * second constructor defined in the superclass.
     *
     * @param title
     * @param weight
     */
    public FieldEval(String title, double weight) {
        super(title, weight);
    }

    /**
     * This is the multi constructor of employerEval class, it contains a super
     * keyword with 2 parameters, and it means that it is going to call
     * constructor defined in the superclass. It has two more parameters that
     * they are mentioned.
     *
     * @param title
     * @param weight
     * @param performance
     * @param employerEval
     */
    public FieldEval(String title, double weight, double performance, double employerEval) {
        super(title, weight);
        this.performance = performance;
        this.employerEval = employerEval;
    }

    /**
     * This method gets the performance that was entered by the user.
     *
     * @return this performance
     */
    public double getPerformance() {
        return performance;
    }

    /**
     * Creates a new performance with a given performance and the only condition
     * is the performance must be 0 or greater. If the performance is less than
     * 0, it will throw an exception.
     *
     * @param performance
     */
    public void setPerformance(double performance) {
        if (performance < 0) {
            throw new IllegalArgumentException("The performane must be greater than zero");
        } else {
            this.performance = performance;
        }
    }

    /**
     * This method gets the performance that was entered by the user.
     *
     * @return this employerEval
     */
    public double getEmployerEval() {
        return employerEval;
    }

    /**
     * Creates a new employerEval with a given employerEval, and the only
     * condition is the employerEval must be 0 or greater. If the employerEval
     * is less than 0, it will throw an exception.
     *
     * @param employerEval
     */
    public void setEmployerEval(double employerEval) {
        if (employerEval < 0) {
            throw new IllegalArgumentException("The employerEval must be greater than zero");
        } else {
            this.employerEval = employerEval;
        }
    }

    /**
     * This method return the String of getPerformance and getEmployerEval with
     * one decimal place.
     *
     * @return this toString
     */
    @Override
    public String toString() {
        return String.format(getPerformance() + " + " + getEmployerEval());
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
        double r = (getPerformance() + getEmployerEval()) / 200 * getWeight();
        double rounder = Math.round(r * 10.0) / 10.0;
        return rounder;
    }
}
