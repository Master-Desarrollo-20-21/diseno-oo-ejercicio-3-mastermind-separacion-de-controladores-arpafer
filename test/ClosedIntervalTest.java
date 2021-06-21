package usantatecla.utils.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ClosedIntervalTest {

    private ClosedInterval closedInterval;

    @BeforeEach
    public void beforeEach() {
        this.closedInterval = new ClosedInterval(-1, 1);
    }

    @Test
    public void testGivenClosedIntervalWhenIsIncludeThenOk() {
        assertThat(this.closedInterval.isIncluded(-1), is(true));
        assertThat(this.closedInterval.isIncluded(0), is(true));
        assertThat(this.closedInterval.isIncluded(1), is(true));
    }

    @Test
    public void testGivenClosedIntervalWhenIsIncludeThenNotOk() {
        assertThat(this.closedInterval.isIncluded(-666), is(false));
        assertThat(this.closedInterval.isIncluded(666), is(false));
    }

    @Test
    public void testGivenClosedIntervalWhenThereAreIntersectThenOk() {
        assertThat(this.closedInterval.thereAreIntersect(new ClosedInterval(-1, 0)), is(true));
        assertThat(this.closedInterval.thereAreIntersect(new ClosedInterval(0, 1)), is(true));
    }

    @Test
    public void testGivenClosedIntervalWhenNotThereAreIntersectThenFalse() {
        assertThat(this.closedInterval.thereAreIntersect(new ClosedInterval(-3, -2)), is(false));
        assertThat(this.closedInterval.thereAreIntersect(new ClosedInterval(2, 3)), is(false));
    }

    @Test
    public void testGivenClosedIntervalThatIncludeAnotherWhenUnionThenReturnTrue() {
        ClosedInterval unionInterval = this.closedInterval.union(new ClosedInterval(-2, 2));
        assertThat(unionInterval.equals(new ClosedInterval(-2, 2)), is(true));
    }

    @Test
    public void testGivenTwoClosedIntervalThatIncludePartialyAnotherWhenUnionThenReturnTrue() {
        ClosedInterval unionInterval1 = this.closedInterval.union(new ClosedInterval(-2, 0));
        assertThat(unionInterval1.equals(new ClosedInterval(-2, 1)), is(true));
        ClosedInterval unionInterval2 = this.closedInterval.union(new ClosedInterval(0, 2));
        assertThat(unionInterval2.equals(new ClosedInterval(-1, 2)), is(true));
    }

    @Test
    public void testGivenTwoClosedIntervalsIndependentsWhenUnionThenReturnUnionOfBoth() {
        ClosedInterval unionInterval1 = this.closedInterval.union(new ClosedInterval(-3, -2));
        assertThat(unionInterval1.equals(new ClosedInterval(-3, 1)), is(true));
        ClosedInterval unionInterval2 = this.closedInterval.union(new ClosedInterval(2, 3));
        assertThat(unionInterval2.equals(new ClosedInterval(-1, 3)), is(true));
    }

    @Test
    public void testGivenClosedIntervalWhenToStringThenOk() {
        assertThat(this.closedInterval.toString(), is("[-1, 1]"));
    }

}
