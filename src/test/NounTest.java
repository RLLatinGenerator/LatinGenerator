package test;
import org.junit.Test;

import Words.Noun;
import Words.Values;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class NounTest {
	
	@Test
	public void testMulti() {
		Noun noun = new Noun("nominativus", "gentivi", 5, Values.GENDER_MASCULINE, Values.INDEX_NOUN_TYPE_DECLENSION_SECOND,  new ArrayList<>(Arrays.asList("Derp")));
		assertEquals("Nominative singular case is incorrect", "nominativus", noun.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR));
	  }
	
}
