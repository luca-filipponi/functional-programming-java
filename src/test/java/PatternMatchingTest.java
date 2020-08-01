import org.junit.Assert;
import org.junit.Test;
import static io.vavr.API.*;


public class PatternMatchingTest {

    @Test
    public void testPatternMatching() {

        int i = 1;

        String s = Match(i).of(
                Case($(1), "one"),
                Case($(2), "two"),
                Case($(), "?")
        );

        Assert.assertEquals(s, "one");
    }
}
