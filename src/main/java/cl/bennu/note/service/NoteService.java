package cl.bennu.note.service;

import cl.bennu.note.domain.Note;
import cl.bennu.note.domain.Category;
import cl.bennu.note.domain.NoteType;
import cl.bennu.note.domain.Profile;
import cl.bennu.note.mapper.iface.NoteMapper;
import cl.bennu.note.mapper.iface.CategoryMapper;
import cl.bennu.note.domain.User;
import cl.bennu.note.mapper.iface.NoteTypeMapper;
import cl.bennu.note.mapper.iface.ProfileMapper;
import cl.bennu.note.mapper.iface.UserMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class NoteService {

    private @Inject NoteTypeMapper noteTypeMapper;
    private @Inject NoteMapper noteMapper;
    private @Inject CategoryMapper categoryMapper;
    private @Inject ProfileMapper profileMapper;

    private @Inject UserMapper userMapper;

    /*UNO */
    public List<Profile> getAllProfiles(){
        List<Profile> profiles = profileMapper.getAll();
        return profiles;
    }

    /*DOS */
    public Profile getProfileById(Long id){
        Profile profile = profileMapper.getById(id);
        return profile;
    }

    /*TRES Y CUATRO */
    public void saveProfile(Profile profile){
        if (profile.getId() == null) {
            profileMapper.insert(profile);
        } else {
            profileMapper.update(profile);
        }
    }

    /*CINCO */
    public void deleteProfileById(Long id){
        profileMapper.deleteById(id);
    }

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

    public List<Category> getAllCategory() {
        List<Category> categories = categoryMapper.getAll();
        return categories;
    }

    public Category getCategoryById(Long id) {
        Category category = categoryMapper.getById(id);
        return category;
    }

    public void saveCategory(Category category) {
        if (category.getId() == null) {
            categoryMapper.insert(category);

        } else {
            categoryMapper.update(category);

        }
    }

    public void deleteCategoryById(Long id) {
        categoryMapper.deleteById(id);
    }

//    NOTE

    public List<Note> getAllNotes(){
        List<Note> noteList = noteMapper.getAll();
        return noteList;
    }

    public Note getNoteById(Long id){
        Note note = noteMapper.getById(id);
        return note;
    }


    public void saveNote(Note note){
        if (note.getId()==null){
         noteMapper.insert(note);
        } else {
            noteMapper.update(note);
        }
    }

    public void deleteNoteById(Long id){
        noteMapper.deleteById(id);
    }

}
