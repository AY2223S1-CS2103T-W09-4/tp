package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.logic.commands.CommandTestUtil.showPersonAtIndex;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.index.Index;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

/**
 * Contains integration tests (interaction with the Model) for {@code UnmarkCommand}.
 */
public class UnmarkCommandTest {

    private static final Index INDEX_FIRST_ITEM = Index.fromOneBased(1);

    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());

    public void setFullView(Index index) {
        model.setFullView();
        showPersonAtIndex(model, index);
    }

    public void setDayView() {
        model.setDayView();
    }

    public void setListView() {
        model.setListView();
    }

    @Test
    public void execute_inListView_failure() {
        setListView();
        UnmarkCommand unmarkCommand = new UnmarkCommand(new MarkPersonDescriptor());

        assertCommandFailure(unmarkCommand, model, UnmarkCommand.MESSAGE_NOT_VIEW_MODE);
    }

    @Test
    public void execute_inDayView_failure() {
        setDayView();
        UnmarkCommand unmarkCommand = new UnmarkCommand(new MarkPersonDescriptor());

        assertCommandFailure(unmarkCommand, model, UnmarkCommand.MESSAGE_NOT_VIEW_MODE);
    }



    @Test
    public void equals() {
        setFullView(INDEX_FIRST_ITEM);
        final UnmarkCommand standardCommand = new UnmarkCommand(new MarkPersonDescriptor());


        // same object -> returns true
        assertTrue(standardCommand.equals(standardCommand));

        // null -> returns false
        assertFalse(standardCommand.equals(null));

        // different types -> returns false
        assertFalse(standardCommand.equals(new ClearCommand()));

    }
}
