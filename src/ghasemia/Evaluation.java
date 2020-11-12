package ghasemia;

/**
 * Assignment 2
 *
 * Program : Making a library
 *
 * This is a library, and it contains 4 classes. This class name is Evaluation,
 * and it consists of 2 fields, 2 constructors, and getter and setter of fields.
 *
 * @author Amirmahdi Ghasemi, June 2020
 */
/**
 * This abstract class name is Evaluation, and it contains all the
 * above-mentioned information.
 */
public abstract class Evaluation {

    /**
     * This is a private String, and its name is title. The value of title is
     * TBD which stands for To Be Determined.
     */
    private String title = "TBD";
    /**
     * This is a private double, and its name is weight. The value of weight is
     * 10, and The weight cannot be 0 or less.
     */
    private double weight = 10;

    /**
     * This is a default constructor of Evaluation class and, it does not
     * contain any parameters.
     */
    public Evaluation() {
    }

    /**
     * This is the second constructor, and it contains 2 parameters that you can
     * find them here.
     *
     * @param title
     * @param weight
     */
    public Evaluation(String title, double weight) {
        this.title = title;
        this.weight = weight;
    }

    /**
     * This method gets the title that was entered by the user.
     *
     * @return this title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates a new title with a given title, and the only condition is the
     * title cannot be null. If the title is empty, it will throw an exception.
     *
     * @param title
     */
    public void setTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("The title cannot be null");
        } else {
            this.title = title;
        }
    }

    /**
     * This method gets the weight that was entered by the user, and its default
     * is 10.
     *
     * @return this weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Creates a new weight with a given weight, and the only condition is the
     * weight cannot be 0 or less. If the weight is 0 or less, it will throw an
     * exception.
     *
     * @param weight
     */
    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("The weight must be greater than zero");
        } else {
            this.weight = weight;
        }
    }

    /**
     * This is an abstract toString method, and the abstract method cannot have
     * body.
     *
     * This abstract toString method has been overridden.
     */
    @Override
    public abstract String toString();

    /**
     * This is an abstract achivedWeight, and the abstract method cannot have
     * body. This abstract method has 3 implementations.
     *
     * @return this achivedWeight
     */
    public abstract double achivedWeight();
}
