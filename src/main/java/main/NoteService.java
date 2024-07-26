package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteService {
    private List<Note> notes = new ArrayList<>();

    public void addNote(Scanner scanner) {
        System.out.println("Add Note:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Content: ");
        String content = scanner.nextLine();
        System.out.print("Category: ");
        String category = scanner.nextLine();

        Note note = new Note(title, content, category);
        notes.add(note);
        System.out.println("Note added successfully!");
    }

    public void editNote(Scanner scanner) {
        // Implementation for editing a note
    }

    public void deleteNote(Scanner scanner) {
        // Implementation for deleting a note
    }

    public void searchNotes(Scanner scanner) {
        // Implementation for searching notes
    }

    public void viewNotes() {
        System.out.println("Your Notes:");
        for (Note note : notes) {
            System.out.println("Title: " + note.getTitle());
            System.out.println("Content: " + note.getContent());
            System.out.println("Category: " + note.getCategory());
            System.out.println("-------------------------");
        }
    }
}
