package usantatecla.utils.models;

public class ClosedInterval {

    private int min;
    private int max;

    public ClosedInterval(int min, int max) {
        assert min <= max;

        this.min = min;
        this.max = max;
    }

    public boolean isIncluded(int value) {
        return this.min <= value && value <= this.max;
    }

    @Override
    public String toString() {
        return "[" + this.min + ", " + this.max + "]";
    }

    public boolean thereAreIntersect(ClosedInterval interval) {
        assert (interval != null);
        return (this.isIncluded(interval.min) || this.isIncluded(interval.max) || interval.isIncluded(this.min)
                || interval.isIncluded(this.max));
    }

    public ClosedInterval union(ClosedInterval interval) {
        assert (interval != null);
        int newMin = interval.min;
        if (this.min < interval.min) {
            newMin = this.min;
        }
        int newMax = interval.max;
        if (this.max > interval.max) {
            newMax = this.max;
        }
        return new ClosedInterval(newMin, newMax);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ClosedInterval other = (ClosedInterval) obj;
        if (min != other.min)
            return false;
        if (max != other.max)
            return false;
        return true;
    }

}
