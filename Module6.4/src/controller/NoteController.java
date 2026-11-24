
package controller;

import model.Note;
import model.Notebook;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ListView;

public class NoteController {

    @FXML
    private TextField titleField;

    @FXML
    private TextArea contentArea;

    @FXML
    private ListView<Note> notesList;

    private Notebook notebook = new Notebook();

    @FXML
    public void initialize() {
        notesList.setItems(notebook.getNotes());

        notesList.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldNote, selectedNote) -> {
                    if (selectedNote != null) {
                        titleField.setText(selectedNote.getTitle());
                        contentArea.setText(selectedNote.getContent());
                    }
                });
    }

    @FXML
    private void handleAdd() {

        String title = titleField.getText().trim();
        String content = contentArea.getText().trim();

        if (title.isEmpty() || content.isEmpty()) {
            return;
        }

        Note note = new Note(title, content);

        notebook.addNote(note);

        titleField.clear();
        contentArea.clear();
    }

    @FXML
    private void handleUpdate() {

        Note selected = notesList.getSelectionModel()
                .getSelectedItem();

        if (selected != null) {

            selected.setTitle(titleField.getText());
            selected.setContent(contentArea.getText());

            int index = notesList.getSelectionModel()
                    .getSelectedIndex();

            notesList.getItems().set(index, selected);
        }
    }

    @FXML
    private void handleDelete() {

        Note selected = notesList.getSelectionModel()
                .getSelectedItem();

        if (selected != null) {
            notebook.removeNote(selected);
            titleField.clear();
            contentArea.clear();
        }
    }
}
