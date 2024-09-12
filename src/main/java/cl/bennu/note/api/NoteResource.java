package cl.bennu.note.api;


import cl.bennu.note.domain.Note;
import cl.bennu.note.service.NoteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/note")
@Produces(MediaType.APPLICATION_JSON)
public class NoteResource {

    private @Inject NoteService noteService;

    @GET
    public Response getAll(){
        List<Note> noteList = noteService.getAllNotes();
        return Response.ok(noteList).build();
    }

    @GET
    @Path("/{id}")
    public  Response getById(@PathParam("id") Long id){
        Note note = noteService.getNoteById(id);
        return Response.ok(note).build();
    }

    @POST
    public Response insert(Note note){
        noteService.saveNote(note);
        return Response.ok(note).build();
    }

    @PUT
    public Response update(Note note){
        noteService.saveNote(note);
        return Response.ok(note).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        noteService.deleteNoteById(id);
        return Response.ok().build();
    }

}
