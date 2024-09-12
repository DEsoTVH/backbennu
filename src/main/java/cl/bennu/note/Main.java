package cl.bennu.note;

import cl.bennu.note.domain.Category;
import cl.bennu.note.domain.Country;
import cl.bennu.note.domain.Note;
import cl.bennu.note.domain.User;
import cl.bennu.note.factory.MapperFactory;
import cl.bennu.note.mapper.iface.CategoryMapper;
import cl.bennu.note.mapper.iface.CountryMapper;
import cl.bennu.note.mapper.iface.NoteMapper;
import cl.bennu.note.mapper.iface.UserMapper;
import cl.bennu.note.mapper.jdbc.CategoryImpl;
import cl.bennu.note.mapper.jdbc.NoteImpl;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CategoryMapper categoryMapper = MapperFactory.getCategoryMapper();

        //crear categoria
        Category category1 = new Category();
        category1.setUserId(50L);
        category1.setLabelId(1L);
        category1.setName("hola mundo");
        category1.setActive(true);
        categoryMapper.insert(category1);

        //listar categoria
        List<Category> categories = categoryMapper.getAll();
        System.out.println("Todas las categorias");
        categories.forEach(System.out::println);

        //actualizar categoria

        Category updatedCategory = categories.get(0);
        updatedCategory.setId(1L);
        updatedCategory.setUserId(50L);
        updatedCategory.setLabelId(1L);
        updatedCategory.setName("segunda posi");
        updatedCategory.setActive(true);
        categoryMapper.update(updatedCategory);
        System.out.println("Categoria "+ updatedCategory);

        //ver categoria por id
        categoryMapper.getById(2L);
        System.out.println("id seleccionada:" + " " + updatedCategory);

        //Borrar categoria

        categoryMapper.deleteById(99L);
    }

}



