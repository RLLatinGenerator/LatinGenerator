package Test;
import org.junit.Test;

import Words.Noun;
import Words.Values;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class NounTest {
	
	@Test
	public void testDeclension() {
		
		Noun firstDeclension = new Noun("nominativa", "genitivae", Values.MAX_CHAPTER, Values.GENDER_MASCULINE, Values.INDEX_ENDINGS_DECLENSION_FIRST,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("First Declension: Nominative singular case is incorrect", "nominativa", firstDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("First Declension: Genitive singular case is incorrect", "genitivae", firstDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("First Declension: Dative singular case is incorrect", "genitivae", firstDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("First Declension: Accusative singular case is incorrect", "genitivam", firstDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("First Declension: Ablative singular case is incorrect", "genitiva", firstDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("First Declension: Nominative plural case is incorrect", "genitivae", firstDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("First Declension: Genitive plural case is incorrect", "genitivarum", firstDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("First Declension: Dative plural case is incorrect", "genitivis", firstDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("First Declension: Accusative plural case is incorrect", "genitivas", firstDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("First Declension: Ablative plural case is incorrect", "genitivis", firstDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun secondDeclension = new Noun("nominativus", "genitivi", Values.MAX_CHAPTER, Values.GENDER_MASCULINE, Values.INDEX_ENDINGS_DECLENSION_SECOND,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Second Declension (Normal): Nominative singular case is incorrect", "nominativus", secondDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Normal): Genitive singular case is incorrect", "genitivi", secondDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Normal): Dative singular case is incorrect", "genitivo", secondDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Normal): Accusative singular case is incorrect", "genitivum", secondDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Normal): Ablative singular case is incorrect", "genitivo", secondDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Normal): Nominative plural case is incorrect", "genitivi", secondDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Normal): Genitive plural case is incorrect", "genitivorum", secondDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Normal): Dative plural case is incorrect", "genitivis", secondDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Normal): Accusative plural case is incorrect", "genitivos", secondDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Normal): Ablative plural case is incorrect", "genitivis", secondDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun secondDeclensionN= new Noun("nominativum", "genitivi", Values.MAX_CHAPTER, Values.GENDER_MASCULINE, Values.INDEX_ENDINGS_DECLENSION_SECOND_N,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Second Declension (Neuter): Nominative singular case is incorrect", "nominativum", secondDeclensionN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Genitive singular case is incorrect", "genitivi", secondDeclensionN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Dative singular case is incorrect", "genitivo", secondDeclensionN.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Accusative singular case is incorrect", "genitivum", secondDeclensionN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Ablative singular case is incorrect", "genitivo", secondDeclensionN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Nominative plural case is incorrect", "genitiva", secondDeclensionN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Genitive plural case is incorrect", "genitivorum", secondDeclensionN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Dative plural case is incorrect", "genitivis", secondDeclensionN.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Accusative plural case is incorrect", "genitiva", secondDeclensionN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Second Declension (Neuter): Ablative plural case is incorrect", "genitivis", secondDeclensionN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun thirdDeclension = new Noun("nominative", "genitivis", Values.MAX_CHAPTER, Values.GENDER_MASCULINE, Values.INDEX_ENDINGS_DECLENSION_THIRD,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Third Declension (Normal): Nominative singular case is incorrect", "nominative", thirdDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Normal): Genitive singular case is incorrect", "genitivis", thirdDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Normal): Dative singular case is incorrect", "genitivi", thirdDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Normal): Accusative singular case is incorrect", "genitivem", thirdDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Normal): Ablative singular case is incorrect", "genitive", thirdDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Normal): Nominative plural case is incorrect", "genitives", thirdDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Normal): Genitive plural case is incorrect", "genitivum", thirdDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Normal): Dative plural case is incorrect", "genitivibus", thirdDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Normal): Accusative plural case is incorrect", "genitives", thirdDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Normal): Ablative plural case is incorrect", "genitivibus", thirdDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun thirdDeclensionI = new Noun("nominative", "genitivis", Values.MAX_CHAPTER, Values.GENDER_MASCULINE, Values.INDEX_ENDINGS_DECLENSION_THIRD_I,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Third Declension (I-stem): Nominative singular case is incorrect", "nominative", thirdDeclensionI.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Genitive singular case is incorrect", "genitivis", thirdDeclensionI.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Dative singular case is incorrect", "genitivi", thirdDeclensionI.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Accusative singular case is incorrect", "genitivem", thirdDeclensionI.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Ablative singular case is incorrect", "genitive", thirdDeclensionI.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Nominative plural case is incorrect", "genitives", thirdDeclensionI.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Genitive plural case is incorrect", "genitivium", thirdDeclensionI.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Dative plural case is incorrect", "genitivibus", thirdDeclensionI.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Accusative plural case is incorrect", "genitives", thirdDeclensionI.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-stem): Ablative plural case is incorrect", "genitivibus", thirdDeclensionI.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun thirdDeclensionN = new Noun("nominative", "genitivis", Values.MAX_CHAPTER, Values.GENDER_NEUTER, Values.INDEX_ENDINGS_DECLENSION_THIRD_N,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Third Declension (Neuter): Nominative singular case is incorrect", "nominative", thirdDeclensionN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Genitive singular case is incorrect", "genitivis", thirdDeclensionN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Dative singular case is incorrect", "genitivi", thirdDeclensionN.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Accusative singular case is incorrect", "nominative", thirdDeclensionN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Ablative singular case is incorrect", "genitive", thirdDeclensionN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Nominative plural case is incorrect", "genitiva", thirdDeclensionN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Genitive plural case is incorrect", "genitivum", thirdDeclensionN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Dative plural case is incorrect", "genitivibus", thirdDeclensionN.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Accusative plural case is incorrect", "genitiva", thirdDeclensionN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (Neuter): Ablative plural case is incorrect", "genitivibus", thirdDeclensionN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun thirdDeclensionIN = new Noun("nominative", "genitivis", Values.MAX_CHAPTER, Values.GENDER_NEUTER, Values.INDEX_ENDINGS_DECLENSION_THIRD_I_N,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Third Declension (I-Stem, Neuter): Nominative singular case is incorrect", "nominative", thirdDeclensionIN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Genitive singular case is incorrect", "genitivis", thirdDeclensionIN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Dative singular case is incorrect", "genitivi", thirdDeclensionIN.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Accusative singular case is incorrect", "nominative", thirdDeclensionIN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Ablative singular case is incorrect", "genitivi", thirdDeclensionIN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Nominative plural case is incorrect", "genitivia", thirdDeclensionIN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Genitive plural case is incorrect", "genitivium", thirdDeclensionIN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Dative plural case is incorrect", "genitivibus", thirdDeclensionIN.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Accusative plural case is incorrect", "genitivia", thirdDeclensionIN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Third Declension (I-Stem, Neuter): Ablative plural case is incorrect", "genitivibus", thirdDeclensionIN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun fourthDeclension = new Noun("nominativus", "genitivus", Values.MAX_CHAPTER, Values.GENDER_MASCULINE, Values.INDEX_ENDINGS_DECLENSION_FOURTH,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Fourth Declension (Normal): Nominative singular case is incorrect", "nominativus", fourthDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Genitive singular case is incorrect", "genitivus", fourthDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Dative singular case is incorrect", "genitivui", fourthDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Accusative singular case is incorrect", "genitivum", fourthDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Ablative singular case is incorrect", "genitivu", fourthDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Nominative plural case is incorrect", "genitivus", fourthDeclension.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Genitive plural case is incorrect", "genitivuum", fourthDeclension.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Dative plural case is incorrect", "genitivibus", fourthDeclension.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Accusative plural case is incorrect", "genitivus", fourthDeclension.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Normal): Ablative plural case is incorrect", "genitivibus", fourthDeclension.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		Noun fourthDeclensionN = new Noun("nominativu", "genitivus", Values.MAX_CHAPTER, Values.GENDER_NEUTER, Values.INDEX_ENDINGS_DECLENSION_FOURTH_N,  new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Fourth Declension (Neuter): Nominative singular case is incorrect", "nominativu", fourthDeclensionN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Genitive singular case is incorrect", "genitivus", fourthDeclensionN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Dative singular case is incorrect", "genitivu", fourthDeclensionN.decline(101, Values.CASE_DATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Accusative singular case is incorrect", "genitivu", fourthDeclensionN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Ablative singular case is incorrect", "genitivu", fourthDeclensionN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_SINGULAR).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Nominative plural case is incorrect", "genitivua", fourthDeclensionN.decline(101, Values.CASE_NOMINATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Genitive plural case is incorrect", "genitivuum", fourthDeclensionN.decline(101, Values.CASE_GENITIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Dative plural case is incorrect", "genitivibus", fourthDeclensionN.decline(101, Values.CASE_DATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Accusative plural case is incorrect", "genitivua", fourthDeclensionN.decline(101, Values.CASE_ACCUSATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		assertEquals("Fourth Declension (Neuter): Ablative plural case is incorrect", "genitivibus", fourthDeclensionN.decline(101, Values.CASE_ABLATIVE, Values.NUMBER_PLURAL).getConjugatedWord());
		
		
	}
}
	