package de.andrena.junit.hamcrest13;

import java.util.Collection;
import org.hamcrest.Factory;
import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;

public class CollectionSizeMatcher extends FeatureMatcher<Collection<?>, Integer> {

	public CollectionSizeMatcher(Matcher<? super Integer> subMatcher) {
		super(subMatcher, "collection with size", "size");
	}

	@Override protected Integer featureValueOf(Collection<?> actual) {
		return actual.size();
	}

	@Factory public static Matcher<Collection<?>> hasSize(Matcher<? super Integer> matcher) {
		return new CollectionSizeMatcher(matcher);
	}
}
