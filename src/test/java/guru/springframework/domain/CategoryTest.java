package guru.springframework.domain;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.HashSet;
import java.util.Set;

public class CategoryTest extends TestCase {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    public void testGetId() {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    public void testGetDescription() {
        String description = "some text";

        category.setDescription("some text");

        assertEquals(description, category.getDescription());
    }

    public void testGetRecipes() {
        Set<Recipe> testRecipes = new HashSet<>();

        assertEquals(testRecipes, category.getRecipes());
    }
}