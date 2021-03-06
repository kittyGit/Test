package cn.req.stream;

import org.junit.Test;

import java.util.List;

import static cn.req.stream.Sum.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Sum all elements of a collection
 */
public class SumSpec {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate7(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
