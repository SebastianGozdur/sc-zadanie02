import com.google.common.base.Splitter;
import org.junit.Assert;
import org.junit.Test;
import java.util.Iterator;

public class SplitterTest {

    @Test
    public void testStringSplitting() {
        //given
        String stringToSplit = "firstPart secondPart";

        //when
        Iterable<String> resultOfSplitting = Splitter.on(" ").split(stringToSplit);

        //then
        Boolean isFirstPartValid = false;
        Boolean isSecondPartValid = false;

        Iterator<String> iterator = resultOfSplitting.iterator();

        while (iterator.hasNext()) {
            String currentValue = iterator.next();

            if(currentValue.equals("firstPart")) {
                isFirstPartValid = true;
            } else if(currentValue.equals("secondPart")) {
                isSecondPartValid = true;
            }
        }

        Assert.assertEquals(true, isFirstPartValid);
        Assert.assertEquals(true, isSecondPartValid);
    }
}
