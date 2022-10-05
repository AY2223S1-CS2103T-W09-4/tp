package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's lesson plan in the address book.
 * Guarantees: immutable; is valid
 */
public class LessonPlan {
    public final String value;

    public LessonPlan(String lessonPlan) {
        requireNonNull(lessonPlan);
        value = lessonPlan;
    }
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof LessonPlan // instanceof handles nulls
                && value.equals(((LessonPlan) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
