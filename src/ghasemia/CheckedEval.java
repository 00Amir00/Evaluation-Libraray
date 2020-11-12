package ghasemia;

/**
 *
 * Program : Making a library
 *
 * This is a library, and it contains 4 classes. This class name is CheckedEval,
 * and it consists of 1 field, 3 constructors, and getter and setter of field.
 *
 * @author Amirmahdi Ghasemi, June 2020
 */
/**
 * This class name is CheckedEval, and it extends the gradedEval class. This
 * class has all the above-mentioned information.
 *
 */
public class CheckedEval extends GradedEval {

    /**
     * This is a private boolean, and its name is complete. The default value of
     * complete is false.
     */
    private boolean complete = false;

    /**
     * This is a default constructor of CheckedEval class and, it contains a
     * super keyword, and it means to call a method defined in the superclass.
     */
    public CheckedEval() {
        super();
    }

    /**
     * This is the second constructor of CheckedEval class and, it contains a
     * super keyword with 2 parameters, and it means that it is going to call
     * second constructor defined in the superclass.
     *
     * @param title
     * @param weight
     */
    public CheckedEval(String title, double weight) {
        super(title, weight);
    }

    /**
     * This is the multi constructor of CheckedEval class, it contains a super
     * keyword with 2 parameters, and it means that it is going to call
     * constructor defined in the superclass. It has two more parameters that
     * they are mentioned.
     *
     * @param title
     * @param weight
     * @param grade
     * @param maxGrade
     */
    public CheckedEval(String title, double weight, double grade, double maxGrade, boolean complete) {
        super(title, weight, grade, maxGrade);
        this.complete = complete;
    }

    /**
     * This method gets complete that was entered by the user.
     *
     * @return this complete
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Creates a new complete with a given complete, and the default value of
     * complete is false.
     *
     * @param complete
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    /**
     * This method return the String of getGrade and getMaxGrade with one
     * decimal place. There is only one condition. If isComplete is true, it
     * will print (COMPLETE) with the above data, and if isComplete is false, it
     * will print (INCOMPLETE) with the above data.
     *
     * @return this toString
     */
    @Override
    public String toString() {
        if (isComplete() == true) {
            return String.format(getGrade() + " / " + getMaxGrade() + " (COMPLETE)");
        } else {
            return String.format(getGrade() + " / " + getMaxGrade() + " (INCOMPLETE)");
        }
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
