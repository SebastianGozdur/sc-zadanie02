import org.junit.Assert;
import org.junit.Test;

public class BuilderExampleTest {

    @Test
    public void  testCreatingObjectFromBuilder() {
        //given //when
        BuilderExample builderExample = BuilderExample.builder()
                                            .name("test")
                                            .createdBy("Sebastian")
                                            .description("Sample builder")
                                            .build();
        //then
        Assert.assertNotNull(builderExample);
        Assert.assertEquals("test", builderExample.getName());
        Assert.assertEquals("Sebastian", builderExample.getCreatedBy());
        Assert.assertEquals("Sample builder", builderExample.getDescription());
    }
}

