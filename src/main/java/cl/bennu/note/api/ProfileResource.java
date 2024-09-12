package cl.bennu.note.api;

import java.util.List;

import cl.bennu.note.domain.Profile;
import cl.bennu.note.service.NoteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/profile")
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
    private @Inject NoteService noteService;

    @GET
    public Response getAll(){
        List<Profile> profiles = noteService.getAllProfiles();
        return Response.ok(profiles).build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id){
        Profile profile = noteService.getProfileById(id);
        return Response.ok(profile).build();
    }

    @POST
    public Response insert(Profile profile){
        noteService.saveProfile(profile);
        return Response.ok(profile).build();
    }

    @PUT
    public Response update(Profile profile){
        noteService.saveProfile(profile);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id){
        noteService.deleteProfileById(id);
        return Response.ok().build();
    }

}
