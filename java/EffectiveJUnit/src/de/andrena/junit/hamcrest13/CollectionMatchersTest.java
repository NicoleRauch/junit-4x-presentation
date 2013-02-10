package de.andrena.junit.hamcrest13;

import static de.andrena.junit.hamcrest13.IsEmptyCollection.empty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;

public class CollectionMatchersTest {

	@Test public void isEmpty() {
		Set<String> set = new TreeSet<String>();
		set.add("a");
 
		assertThat(set, new IsEmptyCollection());   // direct instantiation
		assertThat(set, IsEmptyCollection.empty()); // using @Factory method
		assertThat(set, empty());                   // using static import
		assertThat(set, is(empty()));               // syntactic sugar
	}
}
