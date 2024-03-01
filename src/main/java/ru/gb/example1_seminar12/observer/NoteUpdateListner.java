package ru.gb.example1_seminar12.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import ru.gb.example1_seminar12.services.FileGateway;

@Component
public class NoteUpdateListner implements ApplicationListener<NoteCreateEvent> {
    @Autowired
    FileGateway fileGateway;

    @Override
    public void onApplicationEvent(NoteCreateEvent event) {
        fileGateway.writeToFile("addNotes_log.txt", event.getNote().toString());
        System.out.println("Добавлена заметка: " + event.getNote().toString());

    }
}
