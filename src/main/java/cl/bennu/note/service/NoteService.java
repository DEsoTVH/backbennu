package cl.bennu.note.service;

import cl.bennu.note.domain.NoteType;
import cl.bennu.note.domain.User;
import cl.bennu.note.mapper.iface.NoteTypeMapper;
import cl.bennu.note.mapper.iface.UserMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class NoteService {

    private @Inject NoteTypeMapper noteTypeMapper;

    private @Inject UserMapper userMapper;

    public List<NoteType> getAllNoteType() {
        List<NoteType> noteTypes = noteTypeMapper.getAll();
        return noteTypes;
    }

    public NoteType getNoteTypeById(Long id) {
        NoteType noteType = noteTypeMapper.getById(id);
        return noteType;
    }

    public void saveNoteType(NoteType noteType) {
        if (noteType.getId() == null) {
            noteTypeMapper.insert(noteType);

        } else {
            noteTypeMapper.update(noteType);

        }
    }

    public void deleteNoteTypeById(Long id) {
        noteTypeMapper.deleteById(id);
    }


    // mi shit

    public List<User> getAllUser() {
        List<User> users = userMapper.getAll();
        return users;
    }

    public User getUserById(Long id) {
        User user = userMapper.getById(id);
        return user;
    }

    public void saveUser (User user) {
        if (user.getId() == null) {
            userMapper.insert(user);

        } else {
            userMapper.update(user);

        }
    }

    public void deleteUserById(Long id) {
        userMapper.deleteById(id);
    }
}
