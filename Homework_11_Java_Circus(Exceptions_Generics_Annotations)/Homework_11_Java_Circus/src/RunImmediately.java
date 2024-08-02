import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation to mark methods that should be run immediately a specified number of times.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediately {
	int times();
}
