import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

public class JoinerTest {

    @Test
    public void testStringJoining() {
        //given
        String firstPart = "firstPart";
        String secondPart = "secondPart";

        //when
        Joiner joiner = Joiner.on(" ");
        String resultOfJoining = joiner.join(firstPart, secondPart);

        //then
        Assert.assertEquals(firstPart + " " + secondPart, resultOfJoining);
    }
}
