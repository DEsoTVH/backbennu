package cl.bennu.note.api;

import cl.bennu.note.domain.Category;
import cl.bennu.note.service.NoteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/category")
@Produces(MediaType.APPLICATION_JSON)
public class CategoryResource {

    private @Inject NoteService noteService;

    @GET
    public Response getAll() {
        List<Category> categories = noteService.getAllCategory();
        return Response.ok(categories).build();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        Category category = noteService.getCategoryById(id);
        return Response.ok(category).build();
    }

    @POST
    public Response insert(Category category) {
        noteService.saveCategory(category);
        return Response.ok(category).build();
    }

    @PUT
    public Response update(Category category) {
        noteService.saveCategory(category);
        return Response.ok(category).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(Long id) {
        noteService.deleteCategoryById(id);
        return Response.ok().build();
    }
}
