package de.andrena.junit.hamcrest13;

import java.util.Collection;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class IsEmptyCollection extends TypeSafeMatcher<Collection<?>> {

	@Override public void describeTo(Description description) {
		description.appendText("empty");
	}

	@Override protected boolean matchesSafely(Collection<?> collection) {
		return collection.isEmpty();
	}

	@Override public void describeMismatchSafely(Collection<?> collection, Description description) {
		description.appendText("size was " + collection.size());
	}

	@Factory public static Matcher<Collection<?>> empty() {
		return new IsEmptyCollection();
	}
}
