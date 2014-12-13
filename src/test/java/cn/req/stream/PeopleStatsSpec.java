package cn.req.stream;

import org.junit.Test;

import java.util.List;

import static cn.req.stream.PeopleStats.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Get people statistics: average age, count, maximum age, minimum age and sum og all ages.
 */
public class PeopleStatsSpec {

    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);

    @Test
    public void getStatsShouldReturnAverageAge() {
        assertThat(getStats7(collection).getAverage())
                .isEqualTo((double)(4 + 40 + 42) / 3);
    }

    @Test
    public void getStatsShouldReturnNumberOfPeople() {
        assertThat(getStats7(collection).getCount())
                .isEqualTo(3);
    }

    @Test
    public void getStatsShouldReturnMaximumAge() {
        assertThat(getStats7(collection).getMax())
                .isEqualTo(42);
    }

    @Test
    public void getStatsShouldReturnMinimumAge() {
        assertThat(getStats7(collection).getMin())
                .isEqualTo(4);
    }

    @Test
    public void getStatsShouldReturnSumOfAllAges() {
        assertThat(getStats7(collection).getSum())
                .isEqualTo(40 + 42 + 4);
    }

}
