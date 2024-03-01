package ru.gb.example1_seminar12.observer;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import ru.gb.example1_seminar12.model.Note;


@Getter
public class NoteCreateEvent extends ApplicationEvent {

    private Note note;

    public NoteCreateEvent(Object source, Note note) {
        super(source);
        this.note = note;
    }


}
