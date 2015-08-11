package Test;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

import Words.Values;

import static org.junit.Assert.*;

import Words.Verb;

public class VerbTest {

	@Test
	public void testConjugation() {
		// Still needs passive tests
		
		Verb firstConjugation = new Verb("testo", "testare", "testavi", "testatum", Values.INDEX_CONJUGATION_FIRST, Values.MAX_CHAPTER, new ArrayList<>(Arrays.asList("Test")));
		assertEquals("First Conjugation: Present tense first person singular incorrect", "testo", firstConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Present tense second person singular incorrect", "testas", firstConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Present tense third person singular incorrect", "testat", firstConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("First Conjugation: Present tense first person plural incorrect", "testamus", firstConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Present tense second person plural incorrect", "testatis", firstConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Present tense third person plural incorrect", "testant", firstConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("First Conjugation: Future tense first person singular incorrect", "testabo", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Future tense second person singular incorrect", "testabis", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Future tense third person singular incorrect", "testabit", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("First Conjugation: Future tense first person plural incorrect", "testabimus", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Future tense second person plural incorrect", "testabitis", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Future tense third person plural incorrect", "testabunt", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("First Conjugation: Imperfect tense first person singular incorrect", "testabam", firstConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Imperfect tense second person singular incorrect", "testabas", firstConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Imperfect tense third person singular incorrect", "testabat", firstConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("First Conjugation: Imperfect tense first person plural incorrect", "testabamus", firstConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Imperfect tense second person plural incorrect", "testabatis", firstConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Imperfect tense third person plural incorrect", "testabant", firstConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("First Conjugation: Perfect tense first person singular incorrect", "testavi", firstConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Perfect tense second person singular incorrect", "testavisti", firstConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Perfect tense third person singular incorrect", "testavit", firstConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("First Conjugation: Perfect tense first person plural incorrect", "testavimus", firstConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Perfect tense second person plural incorrect", "testavistis", firstConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Perfect tense third person plural incorrect", "testaverunt", firstConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("First Conjugation: Future Perfect tense first person singular incorrect", "testavero", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Future Perfect tense second person singular incorrect", "testaveris", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Future Perfect tense third person singular incorrect", "testaverit", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("First Conjugation: Future Perfect tense first person plural incorrect", "testaverimus", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Future Perfect tense second person plural incorrect", "testaveritis", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Future Perfect tense third person plural incorrect", "testaverint", firstConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("First Conjugation: Pluperfect tense first person singular incorrect", "testaveram", firstConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Pluperfect tense second person singular incorrect", "testaveras", firstConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Pluperfect tense third person singular incorrect", "testaverat", firstConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("First Conjugation: Pluperfect tense first person plural incorrect", "testaveramus", firstConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("First Conjugation: Pluperfect tense second person plural incorrect", "testaveratis", firstConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("First Conjugation: Pluperfect tense third person plural incorrect", "testaverant", firstConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		
		
		Verb secondConjugation = new Verb("testeo", "testere", "testavi", "testatum", Values.INDEX_CONJUGATION_SECOND, Values.MAX_CHAPTER, new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Second Conjugation: Present tense first person singular incorrect", "testeo", secondConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Present tense second person singular incorrect", "testes", secondConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Present tense third person singular incorrect", "testet", secondConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Second Conjugation: Present tense first person plural incorrect", "testemus", secondConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Present tense second person plural incorrect", "testetis", secondConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Present tense third person plural incorrect", "testent", secondConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Second Conjugation: Future tense first person singular incorrect", "testebo", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Future tense second person singular incorrect", "testebis", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Future tense third person singular incorrect", "testebit", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Second Conjugation: Future tense first person plural incorrect", "testebimus", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Future tense second person plural incorrect", "testebitis", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Future tense third person plural incorrect", "testebunt", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Second Conjugation: Imperfect tense first person singular incorrect", "testebam", secondConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Imperfect tense second person singular incorrect", "testebas", secondConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Imperfect tense third person singular incorrect", "testebat", secondConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Second Conjugation: Imperfect tense first person plural incorrect", "testebamus", secondConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Imperfect tense second person plural incorrect", "testebatis", secondConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Imperfect tense third person plural incorrect", "testebant", secondConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Second Conjugation: Perfect tense first person singular incorrect", "testavi", secondConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Perfect tense second person singular incorrect", "testavisti", secondConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Perfect tense third person singular incorrect", "testavit", secondConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Second Conjugation: Perfect tense first person plural incorrect", "testavimus", secondConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Perfect tense second person plural incorrect", "testavistis", secondConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Perfect tense third person plural incorrect", "testaverunt", secondConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Second Conjugation: Future Perfect tense first person singular incorrect", "testavero", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Future Perfect tense second person singular incorrect", "testaveris", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Future Perfect tense third person singular incorrect", "testaverit", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Second Conjugation: Future Perfect tense first person plural incorrect", "testaverimus", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Future Perfect tense second person plural incorrect", "testaveritis", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Future Perfect tense third person plural incorrect", "testaverint", secondConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Second Conjugation: Pluperfect tense first person singular incorrect", "testaveram", secondConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Pluperfect tense second person singular incorrect", "testaveras", secondConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Pluperfect tense third person singular incorrect", "testaverat", secondConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Second Conjugation: Pluperfect tense first person plural incorrect", "testaveramus", secondConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Second Conjugation: Pluperfect tense second person plural incorrect", "testaveratis", secondConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Second Conjugation: Pluperfect tense third person plural incorrect", "testaverant", secondConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		
		
		Verb thirdConjugation = new Verb("testo", "testere", "testavi", "testatum", Values.INDEX_CONJUGATION_THIRD, Values.MAX_CHAPTER, new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Third Conjugation (Normal): Present tense first person singular incorrect", "testo", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Present tense second person singular incorrect", "testis", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Present tense third person singular incorrect", "testit", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Present tense first person plural incorrect", "testimus", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Present tense second person plural incorrect", "testitis", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Present tense third person plural incorrect", "testunt", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (Normal): Future tense first person singular incorrect", "testam", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future tense second person singular incorrect", "testes", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future tense third person singular incorrect", "testet", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future tense first person plural incorrect", "testemus", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future tense second person plural incorrect", "testetis", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future tense third person plural incorrect", "testent", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (Normal): Imperfect tense first person singular incorrect", "testebam", thirdConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Imperfect tense second person singular incorrect", "testebas", thirdConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Imperfect tense third person singular incorrect", "testebat", thirdConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Imperfect tense first person plural incorrect", "testebamus", thirdConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Imperfect tense second person plural incorrect", "testebatis", thirdConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Imperfect tense third person plural incorrect", "testebant", thirdConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (Normal): Perfect tense first person singular incorrect", "testavi", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Perfect tense second person singular incorrect", "testavisti", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Perfect tense third person singular incorrect", "testavit", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Perfect tense first person plural incorrect", "testavimus", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Perfect tense second person plural incorrect", "testavistis", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Perfect tense third person plural incorrect", "testaverunt", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (Normal): Future Perfect tense first person singular incorrect", "testavero", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future Perfect tense second person singular incorrect", "testaveris", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future Perfect tense third person singular incorrect", "testaverit", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future Perfect tense first person plural incorrect", "testaverimus", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future Perfect tense second person plural incorrect", "testaveritis", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Future Perfect tense third person plural incorrect", "testaverint", thirdConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (Normal): Pluperfect tense first person singular incorrect", "testaveram", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Pluperfect tense second person singular incorrect", "testaveras", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Pluperfect tense third person singular incorrect", "testaverat", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Pluperfect tense first person plural incorrect", "testaveramus", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Pluperfect tense second person plural incorrect", "testaveratis", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (Normal): Pluperfect tense third person plural incorrect", "testaverant", thirdConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		
		
		Verb thirdIOConjugation = new Verb("testio", "testere", "testavi", "testatum", Values.INDEX_CONJUGATION_THIRD_IO, Values.MAX_CHAPTER, new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Third Conjugation (IO): Present tense first person singular incorrect", "testio", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Present tense second person singular incorrect", "testis", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Present tense third person singular incorrect", "testit", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Present tense first person plural incorrect", "testimus", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Present tense second person plural incorrect", "testitis", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Present tense third person plural incorrect", "testiunt", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (IO): Future tense first person singular incorrect", "testiam", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future tense second person singular incorrect", "testies", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future tense third person singular incorrect", "testiet", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future tense first person plural incorrect", "testiemus", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future tense second person plural incorrect", "testietis", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future tense third person plural incorrect", "testient", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (IO): Imperfect tense first person singular incorrect", "testiebam", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Imperfect tense second person singular incorrect", "testiebas", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Imperfect tense third person singular incorrect", "testiebat", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Imperfect tense first person plural incorrect", "testiebamus", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Imperfect tense second person plural incorrect", "testiebatis", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Imperfect tense third person plural incorrect", "testiebant", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (IO): Perfect tense first person singular incorrect", "testavi", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Perfect tense second person singular incorrect", "testavisti", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Perfect tense third person singular incorrect", "testavit", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Perfect tense first person plural incorrect", "testavimus", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Perfect tense second person plural incorrect", "testavistis", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Perfect tense third person plural incorrect", "testaverunt", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (IO): Future Perfect tense first person singular incorrect", "testavero", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future Perfect tense second person singular incorrect", "testaveris", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future Perfect tense third person singular incorrect", "testaverit", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future Perfect tense first person plural incorrect", "testaverimus", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future Perfect tense second person plural incorrect", "testaveritis", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Future Perfect tense third person plural incorrect", "testaverint", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Third Conjugation (IO): Pluperfect tense first person singular incorrect", "testaveram", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Pluperfect tense second person singular incorrect", "testaveras", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Pluperfect tense third person singular incorrect", "testaverat", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Pluperfect tense first person plural incorrect", "testaveramus", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Pluperfect tense second person plural incorrect", "testaveratis", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Third Conjugation (IO): Pluperfect tense third person plural incorrect", "testaverant", thirdIOConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		
		
		Verb fourthConjugation = new Verb("testio", "testire", "testavi", "testatum", Values.INDEX_CONJUGATION_FOURTH, Values.MAX_CHAPTER, new ArrayList<>(Arrays.asList("Test")));
		assertEquals("Fourth Conjugation: Present tense first person singular incorrect", "testio", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Present tense second person singular incorrect", "testis", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Present tense third person singular incorrect", "testit", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Fourth Conjugation: Present tense first person plural incorrect", "testimus", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Present tense second person plural incorrect", "testitis", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Present tense third person plural incorrect", "testiunt", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PRESENT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Fourth Conjugation: Future tense first person singular incorrect", "testiam", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future tense second person singular incorrect", "testies", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future tense third person singular incorrect", "testiet", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future tense first person plural incorrect", "testiemus", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future tense second person plural incorrect", "testietis", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future tense third person plural incorrect", "testient", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Fourth Conjugation: Imperfect tense first person singular incorrect", "testiebam", fourthConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Imperfect tense second person singular incorrect", "testiebas", fourthConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Imperfect tense third person singular incorrect", "testiebat", fourthConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Fourth Conjugation: Imperfect tense first person plural incorrect", "testiebamus", fourthConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Imperfect tense second person plural incorrect", "testiebatis", fourthConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Imperfect tense third person plural incorrect", "testiebant", fourthConjugation.conjugate(1, Values.INDEX_TENSE_IMPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Fourth Conjugation: Perfect tense first person singular incorrect", "testavi", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Perfect tense second person singular incorrect", "testavisti", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Perfect tense third person singular incorrect", "testavit", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Fourth Conjugation: Perfect tense first person plural incorrect", "testavimus", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Perfect tense second person plural incorrect", "testavistis", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Perfect tense third person plural incorrect", "testaverunt", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Fourth Conjugation: Future Perfect tense first person singular incorrect", "testavero", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future Perfect tense second person singular incorrect", "testaveris", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future Perfect tense third person singular incorrect", "testaverit", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future Perfect tense first person plural incorrect", "testaverimus", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future Perfect tense second person plural incorrect", "testaveritis", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Future Perfect tense third person plural incorrect", "testaverint", fourthConjugation.conjugate(1, Values.INDEX_TENSE_FUTURE_PERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		
		assertEquals("Fourth Conjugation: Pluperfect tense first person singular incorrect", "testaveram", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Pluperfect tense second person singular incorrect", "testaveras", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Pluperfect tense third person singular incorrect", "testaverat", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_SINGULAR, Values.INDEX_PERSON_THIRD).getConjugatedWord());
		assertEquals("Fourth Conjugation: Pluperfect tense first person plural incorrect", "testaveramus", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_FIRST).getConjugatedWord());
		assertEquals("Fourth Conjugation: Pluperfect tense second person plural incorrect", "testaveratis", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_SECOND).getConjugatedWord());
		assertEquals("Fourth Conjugation: Pluperfect tense third person plural incorrect", "testaverant", fourthConjugation.conjugate(1, Values.INDEX_TENSE_PLUPERFECT, Values.NUMBER_PLURAL, Values.INDEX_PERSON_THIRD).getConjugatedWord());

	}

}
