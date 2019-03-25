package Chapter10.Example11;
/**
 Relatable interface
 */
public interface Relatable
{
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}