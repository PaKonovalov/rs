import org.example.StringGroups;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testFindStringGroups() {
        String[] input = {"qwe", "wqe", "qwee", "a", "a"};
        Map<String, List<Integer>> result = StringGroups.findStringGroups(input);

        assertEquals(List.of(0, 1), result.get("eqw"));
        assertEquals(List.of(3, 4), result.get("a"));
    }
}
