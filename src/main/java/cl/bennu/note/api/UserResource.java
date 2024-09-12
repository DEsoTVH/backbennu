package cl.bennu.note.api;


import cl.bennu.note.domain.User;
import cl.bennu.note.service.NoteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private @Inject NoteService noteService;

    @GET
    public Response getAll() {
        List<User> users = noteService.getAllUser();
        return Response.ok(users).build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        User user = noteService.getUserById(id);
        return Response.ok(user).build();
    }

    @POST
    public Response insert(User user) {
        noteService.saveUser(user);
        return Response.ok(user).build();
    }

    @PUT
    public Response update(User user) {
        noteService.saveUser(user);
        return Response.ok(user).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(Long id) {
        noteService.deleteUserById(id);
        return Response.ok().build();
    }

}
