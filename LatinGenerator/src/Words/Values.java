package Words;
import java.util.ArrayList;


public class Values {
	
	public Values(){
		highestDefinitions.add("zz");
		ArrayList<String> sumDefintions = new ArrayList<String>();
		sumDefintions.add("be");
		sumDefintions.add("was");
		sumDefintions.add("were");
		sumDefintions.add("will");
		sum = new Verb("sum", "esse", "fui", "futurus", -1, 1, sumDefintions);
	}
	
	//Noun land
	public static final int CASE_NOMINATIVE = 0;
	public static final int CASE_GENITIVE = 1;
	public static final int CASE_DATIVE= 2;
	public static final int CASE_ACCUSATIVE= 3;
	public static final int CASE_ABLATIVE = 4;
	//public static final int CASE_VOCATIVE= 5;
	//public static final int CASE_LOCATIVE = 6;
	
	public static final String[] CASE_NAMES_BY_INDEX = new String[]{"Nominative", "Genitive", "Dative", "Accusative", "Ablative"};
	
	public static Verb sum;
	
	public static String[] irrelevantEnglishWords = new String[]{"the", "a", "an"};
	
	public static ArrayList<String> highestDefinitions = new ArrayList<String>();
	
	public static final int GENDER_MASCULINE = 0;
	public static final int GENDER_FEMININE = 1;
	public static final int GENDER_NEUTER = 2;

	public static final double NOUN_CLAUSE_PROBABILITY_ATTACH_GENITIVE = 1; //these work like slices in a pie; if they add up to 8, and this is 2, there is a 1/4 chance of adding a genitive
	public static final double NOUN_CLAUSE_PROBABILITY_ATTACH_NOTHING = 7;
	
	public static final double[] NOUN_CLAUSE_PROBABILITY_ATTACH_TO_NOUN_CLAUSE = new double[]{NOUN_CLAUSE_PROBABILITY_ATTACH_NOTHING, NOUN_CLAUSE_PROBABILITY_ATTACH_GENITIVE};
	
	public static final int INDEX_NOUN_CLAUSE_ATTACH_NOTHING = 0;
	public static final int INDEX_NOUN_CLAUSE_ATTACH_GENITIVE = 1;
	
	public static final int NUMBER_PLURAL = 1;
	public static final int NUMBER_SINGULAR = 0;
	
	public static final int CHAPTER_VOID = 100; //we're giving words that don't have a chapter in jenney this "chapter" value.
	
	public static final char GENDER_NEUTER_CHAR = 'n';
	public static final char GENDER_MASCULINE_CHAR = 'm';
	public static final char GENDER_FEMININE_CHAR = 'f';
	
	public String[] TRANSLATIONS_CASE_NOMINATIVE = new String[]{""};
	public String[] TRANSLATIONS_CASE_GENITIVE = new String[]{"of", "'s"};
	public String[] TRANSLATIONS_CASE_DATIVE = new String[]{"to", "for"};
	public String[] TRANSLATIONS_CASE_ACCUSATIVE = new String[]{"to", "toward"};
	public String[] TRANSLATIONS_CASE_ABLATIVE = new String[]{"by, because"};
	
	public static String[][] DECLENSION_FIRST =  new String[][]{{"a", "ae", "ae", "am", "a"}, {"ae", "arum", "is", "as", "is"}};
	public static String[][] DECLENSION_SECOND = new String[][]{{"us", "i", "o", "um", "o"}, {"i", "orum", "is", "os", "is"}};
	public static String[][] DECLENSION_SECOND_N = new String [][]{{"um", "i", "o", "um", "o"}, {"a", "orum", "is", "a", "is"}};
	public static String[][] DECLENSION_THIRD = new String[][]{{"", "is", "i", "em", "e"}, {"es", "um", "ibus", "es", "ibus"}};
	public static String[][] DECLENSION_THIRD_I = new String[][]{{"", "is", "i", "em", "e"}, {"es", "ium", "ibus", "es", "ibus"}};
	public static String[][] DECLENSION_THIRD_I_N = new String[][]{{"", "is", "i", "", "i"}, {"ia", "ium", "ibus", "ia", "ibus"}};
	public static String[][] DECLENSION_FOURTH = new String[][]{{"us", "us", "ui", "um", "u"}, {"us", "uum", "ibus", "us", "ibus"}};
	public static String[][] DECLENSION_FOURTH_N = new String[][]{{"u", "us", "u", "u", "u"}, {"ua", "uum", "ibus", "ua", "ibus"}};
	public static String[][] DECLENSION_FIFTH = new String[][]{{"es","ei","ei","em","e"}, {"es","erum","ebus","es","ebus"}};
	
	public static String[][][] DECLENSION_NOUNS = new String[][][]{DECLENSION_FIRST, DECLENSION_SECOND, DECLENSION_SECOND_N, DECLENSION_THIRD, DECLENSION_THIRD_I, DECLENSION_THIRD_I_N, DECLENSION_FOURTH, DECLENSION_FOURTH_N, DECLENSION_FIFTH};
	
	public static final int INDEX_ENDINGS_DECLENSION_FIRST = 0;
	public static final int INDEX_ENDINGS_DECLENSION_SECOND = 1;
	public static final int INDEX_ENDINGS_DECLENSION_SECOND_N = 2;
	public static final int INDEX_ENDINGS_DECLENSION_THIRD = 3;
	public static final int INDEX_ENDINGS_DECLENSION_THIRD_I = 4;
	public static final int INDEX_ENDINGS_DECLENSION_THIRD_N = 5;
	public static final int INDEX_ENDINGS_DECLENSION_THIRD_I_N = 6;
	public static final int INDEX_ENDINGS_DECLENSION_FOURTH = 7;
	public static final int INDEX_ENDINGS_DECLENSION_FOURTH_N = 8;
	public static final int INDEX_ENDINGS_DECLENSION_FIFTH = 9;
	
	public static String[][] DECLENSION_ADJECTIVES_SECOND_M = new String[][]{{"us", "i", "o", "um", "o"}, {"i", "orum", "is", "os", "is"}};
	public static String[][] DECLENSION_ADJECITVES_SECOND_F =  new String[][]{{"a", "ae", "ae", "am", "a"}, {"ae", "arum", "is", "as", "is"}};
	public static String[][] DECLENSION_ADJECTIVES_SECOND_N = new String [][]{{"um", "i", "o", "um", "o"}, {"a", "orum", "is", "a", "is"}};
	public static String[][] DECLENSION_ADJECTIVES_THIRD_M = new String[][]{{"", "is", "i", "em", "e"}, {"es", "ium", "ibus", "es", "ibus"}};
	public static String[][] DECLENSION_ADJECTIVES_THIRD_F = new String[][]{{"", "is", "i", "em", "e"}, {"es", "ium", "ibus", "es", "ibus"}};
	public static String[][] DECLENSION_ADJECTIVES_THIRD_N = new String[][]{{"", "is", "i", "", "i"}, {"ia", "ium", "ibus", "ia", "ibus"}};
	
	public static String[][][] DECLENSION_ADJECTIVES_SECOND = new String[][][]{DECLENSION_ADJECTIVES_SECOND_M, DECLENSION_ADJECITVES_SECOND_F, DECLENSION_ADJECTIVES_SECOND_N};
	public static String[][][] DECLENSION_ADJECTIVES_THIRD = new String[][][]{DECLENSION_ADJECTIVES_THIRD_M, DECLENSION_ADJECTIVES_THIRD_F, DECLENSION_ADJECTIVES_THIRD_N};
	
	public static String[][][][] DECLENSION_ADJECTIVES = new String[][][][]{DECLENSION_ADJECTIVES_SECOND, DECLENSION_ADJECTIVES_THIRD};
	
	public static final int[] declensionGenitiveLength = new int[]{2, 1, 1, 2, 2, 2, 2, 2, 2, 2};
	
	public static final int INDEX_NOUN_TYPE_DECLENSION_FIRST = 0;
	public static final int INDEX_NOUN_TYPE_DECLENSION_SECOND = 1;
	public static final int INDEX_NOUN_TYPE_DECLENSION_THIRD = 2;
	public static final int INDEX_NOUN_TYPE_DECLENSION_THIRD_I = 3;
	public static final int INDEX_NOUN_TYPE_DECLENSION_FOURTH = 4;
	public static final int INDEX_NOUN_TYPE_DECLENSION_FIFTH = 5;
	
	public static final int INDEX_VERB_TYPE_CONJUGATION_FIRST = 0;
	public static final int INDEX_VERB_TYPE_CONJUGATION_SECOND = 1;
	public static final int INDEX_VERB_TYPE_CONJUGATION_THIRD = 2;
	public static final int INDEX_VERB_TYPE_CONJUGATION_THIRDIO = 3;
	public static final int INDEX_VERB_TYPE_CONJUGATION_FOURTH = 4;
	
	//Verb land
	public static String[][] PRESENT_CONJUGATION_FIRST = new String[][]{{"o","as","at"}, {"amus","atis","ant"}};
	public static String[][] PRESENT_CONJUGATION_SECOND = new String[][]{{"eo","es","et"}, {"emus","etis","ent"}};
	public static String[][] PRESENT_CONJUGATION_THIRD = new String[][]{{"o","is","it"}, {"imus","itis","unt"}};
	public static String[][] PRESENT_CONJUGATION_THIRD_IO = new String[][]{{"io","is","it"}, {"imus","itis","iunt"}};
	public static String[][] PRESENT_CONJUGATION_FOURTH = new String[][]{{"io","is","it"}, {"imus","itis","iunt"}};
	
	public static String[][] FUTURE_CONJUGATION_FIRST = new String[][]{{"abo", "abis", "abit"}, {"abimus", "abitis", "abunt"}};
	public static String[][] FUTURE_CONJUGATION_SECOND = new String[][]{{"ebo", "ebis", "ebit"}, {"ebimus", "ebitis", "ebunt"}};
	public static String[][] FUTURE_CONJUGATION_THIRD = new String[][]{{"am", "es", "et"}, {"emus", "etis", "ent"}};
	public static String[][] FUTURE_CONJUGATION_THIRD_IO = new String[][]{{"iam", "ies", "iet"}, {"iemus", "ietis", "ient"}};
	public static String[][] FUTURE_CONJUGATION_FOURTH = new String[][]{{"iam", "ies", "iet"}, {"iemus", "ietis", "ient"}};
	
	public static String[][] IMPERFECT_CONJUGATION_FIRST = new String[][]{{"bam", "bas", "bat"}, {"bamus", "batis", "bant"}};
	public static String[][] IMPERFECT_CONJUGATION_SECOND = new String[][]{{"bam", "bas", "bat"}, {"bamus", "batis", "bant"}};
	public static String[][] IMPERFECT_CONJUGATION_THIRD = new String[][]{{"ebam", "ebas", "ebat"}, {"ebamus", "ebatis", "ebant"}};
	public static String[][] IMPERFECT_CONJUGATION_THIRD_IO = new String[][]{{"iebam", "iebas", "iebat"}, {"iebamus", "iebatis", "iebant"}};
	public static String[][] IMPERFECT_CONJUGATION_FOURTH = new String[][]{{"iebam", "iebas", "iebat"}, {"iebamus", "iebatis", "iebant"}};
	
	public static String[][] PERFECT_CONJUGATION_FIRST = new String[][]{{"i", "isti", "it"}, {"imus", "istis", "erunt"}};
	public static String[][] PERFECT_CONJUGATION_SECOND= new String[][]{{"i", "isti", "it"}, {"imus", "istis", "erunt"}};
	public static String[][] PERFECT_CONJUGATION_THIRD = new String[][]{{"i", "isti", "it"}, {"imus", "istis", "erunt"}};
	public static String[][] PERFECT_CONJUGATION_THIRD_IO = new String[][]{{"i", "isti", "it"}, {"imus", "istis", "erunt"}};
	public static String[][] PERFECT_CONJUGATION_FOURTH = new String[][]{{"i", "isti", "it"}, {"imus", "istis", "erunt"}};
	
	public static String[][] PLUPERFECT_CONJUGATION_FIRST = new String[][]{{"eram", "eras", "erat"}, {"eramus", "eratis", "erant"}};
	public static String[][] PLUPERFECT_CONJUGATION_SECOND = new String[][]{{"eram", "eras", "erat"}, {"eramus", "eratis", "erant"}};
	public static String[][] PLUPERFECT_CONJUGATION_THIRD = new String[][]{{"eram", "eras", "erat"}, {"eramus", "eratis", "erant"}};
	public static String[][] PLUPERFECT_CONJUGATION_THIRD_IO = new String[][]{{"eram", "eras", "erat"}, {"eramus", "eratis", "erant"}};
	public static String[][] PLUPERFECT_CONJUGATION_FOURTH = new String[][]{{"eram", "eras", "erat"}, {"eramus", "eratis", "erant"}};
	
	public static String[][] FUTURE_PERFECT_CONJUGATION_FIRST = new String[][]{{"ero", "eris", "erit",}, {"erimus", "eritis", "erunt"}};
	public static String[][] FUTURE_PERFECT_CONJUGATION_SECOND = new String[][]{{"ero", "eris", "erit",}, {"erimus", "eritis", "erunt"}};
	public static String[][] FUTURE_PERFECT_CONJUGATION_THIRD = new String[][]{{"ero", "eris", "erit",}, {"erimus", "eritis", "erunt"}};
	public static String[][] FUTURE_PERFECT_CONJUGATION_THIRD_IO = new String[][]{{"ero", "eris", "erit",}, {"erimus", "eritis", "erunt"}};
	public static String[][] FUTURE_PERFECT_CONJUGATION_FOURTH = new String[][]{{"ero", "eris", "erit",}, {"erimus", "eritis", "erunt"}};
	
	public static String[][] PRESENT_PASSIVE_CONJUGATION_FIRST = new String[][]{{"or", "ris", "tur"}, {"mur", "mini", "ntur"}};
	public static String[][] PRESENT_PASSIVE_CONJUGATION_SECOND = new String[][]{{"or", "ris", "tur"}, {"mur", "mini", "ntur"}};
	public static String[][] PRESENT_PASSIVE_CONJUGATION_THIRD = new String[][]{{"or", "eris", "itur"}, {"imur", "imini", "untur"}};
	public static String[][] PRESENT_PASSIVE_CONJUGATION_THIRD_IO = new String[][]{{"ior", "eris", "itur"}, {"imur", "imini", "iuntur"}};
	
	public static String[][] PERFECT_IRREGULAR_CONJUGATION = new String[][]{{"ii", "isti", "iit"}, {"iimus", "istis", "ierunt"}};
	
	public static String[][][] PRESENT_CONJUGATION = new String[][][]{PRESENT_CONJUGATION_FIRST, PRESENT_CONJUGATION_SECOND, PRESENT_CONJUGATION_THIRD, PRESENT_CONJUGATION_THIRD_IO, PRESENT_CONJUGATION_FOURTH};
	public static String[][][] FUTURE_CONJUGATION = new String[][][]{FUTURE_CONJUGATION_FIRST, FUTURE_CONJUGATION_SECOND, FUTURE_CONJUGATION_THIRD, FUTURE_CONJUGATION_THIRD_IO, FUTURE_CONJUGATION_FOURTH};
	public static String[][][] IMPERFECT_CONJUGATION = new String[][][]{IMPERFECT_CONJUGATION_FIRST, IMPERFECT_CONJUGATION_SECOND, IMPERFECT_CONJUGATION_THIRD, IMPERFECT_CONJUGATION_THIRD_IO, IMPERFECT_CONJUGATION_FOURTH};
	public static String[][][] PERFECT_CONJUGATION = new String[][][]{PERFECT_CONJUGATION_FIRST, PERFECT_CONJUGATION_SECOND, PERFECT_CONJUGATION_THIRD, PERFECT_CONJUGATION_THIRD_IO, PERFECT_CONJUGATION_FOURTH};
	public static String[][][] PLUPERFECT_CONJUGATION = new String[][][]{PLUPERFECT_CONJUGATION_FIRST, PLUPERFECT_CONJUGATION_SECOND, PLUPERFECT_CONJUGATION_THIRD, PLUPERFECT_CONJUGATION_THIRD_IO, PLUPERFECT_CONJUGATION_FOURTH};
	public static String[][][] FUTURE_PERFECT_CONJUGATION = new String[][][]{FUTURE_PERFECT_CONJUGATION_FIRST, FUTURE_PERFECT_CONJUGATION_SECOND, FUTURE_PERFECT_CONJUGATION_THIRD, FUTURE_PERFECT_CONJUGATION_THIRD_IO, FUTURE_PERFECT_CONJUGATION_FOURTH};
	
	public static String[][][][] CONJUGATION_VERBS = new String[][][][]{PRESENT_CONJUGATION, FUTURE_CONJUGATION, IMPERFECT_CONJUGATION, PERFECT_CONJUGATION, PLUPERFECT_CONJUGATION, FUTURE_PERFECT_CONJUGATION};
	
	public static final int INDEX_CONJUGATION_FIRST = 0;
	public static final int INDEX_CONJUGATION_SECOND = 1;
	public static final int INDEX_CONJUGATION_THIRD = 2;
	public static final int INDEX_CONJUGATION_THIRD_IO = 3;
	public static final int INDEX_CONJUGATION_FOURTH = 4;
	
	public static final int INDEX_TENSE_PRESENT = 0;
	public static final int INDEX_TENSE_FUTURE = 1;
	public static final int INDEX_TENSE_IMPERFECT = 2;
	public static final int INDEX_TENSE_PERFECT = 3;
	public static final int INDEX_TENSE_FUTURE_PERFECT = 4;
	public static final int INDEX_TENSE_PLUPERFECT = 5;
	
	
	public static final int NOUN_DATA_ARRAY_LENGTH_CORRECT = 3; //[chapter] [nom, gen, gender] [definition]. Based on tabs.
	public static final int VERB_DATA_ARRAY_LENGTH_CORRECT = 3;
	public static final int PREPOSITION_DATA_ARRAY_LENGTH_CORRECT = 3;
	public static final int ADJECTIVE_DATA_ARRAY_LENGTH_CORRECT = 3;
	public static final int CONJUNCTION_DATA_ARRAY_LENGTH_CORRECT = 3;
	public static final int ADVERB_DATA_ARRAY_LENGTH_CORRECT = 3;
	
	public static final String CASE_NOMINATIVE_SHORTHAND = "nom";
	public static final String CASE_GENITIVE_SHORTHAND = "gen";
	public static final String CASE_DATIVE_SHORTHAND = "dat";
	public static final String CASE_ACCUSATIVE_SHORTHAND = "acc";
	public static final String CASE_ABLATIVE_SHORTHAND = "abl";
	
	public static final int DELCENSION_ADJECTIVE_FIRST_AND_SECOND = 0;
	public static final int DELCENSION_ADJECTIVE_THIRD_1 = 1;//based on how many forms are given; acer, acris, acre is a 3.
	public static final int DELCENSION_ADJECTIVE_THIRD_2 = 2;
	public static final int DELCENSION_ADJECTIVE_THIRD_3 = 3;
	
	public static final int MAX_CHAPTER = 101;
	
	
	public static String[][][] SUM_DECLENSION = {{{"sum", "es", "est"}, {"sumus", "estis", "sunt"}},
												{{"ero", "eris", "erit"}, {"erimus", "eritis", "erunt"}},
												{{"eram", "eras", "erat"}, {"eramus", "eratis", "erant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] ABSUM_DECLENSION = {{{"absum", "abes", "abest"}, {"absumus", "abestis", "absunt"}},
												{{"abero", "aberis", "aberit"}, {"aberimus", "aberitis", "aberunt"}},
												{{"aberam", "aberas", "aberat"}, {"aberamus", "aberatis", "aberant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] ADSUM_DECLENSION = {{{"adsum", "ades", "adest"}, {"adsumus", "adestis", "adsunt"}},
												{{"adero", "aderis", "aderit"}, {"aderimus", "aderitis", "aderunt"}},
												{{"aderam", "aderas", "aderat"}, {"aderamus", "aderatis", "aderant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] POSSUM_DECLENSION = {{{"possum", "potes", "potest"}, {"possumus", "potestis", "possunt"}},
												{{"potero", "poteris", "poterit"}, {"poterimus", "poteritis", "poterunt"}},
												{{"poteram", "poteras", "poterat"}, {"poteramus", "poteratis", "poterant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] EO_DECLENSION = {{{"eo", "is", "it"}, {"imus", "itis", "eunt"}},
		   									{{"ibo", "ibis", "ibit"}, {"ibimus", "ibitis", "ibunt"}},
		   									{{"ibam", "ibas", "ibat"}, {"ibamus", "ibatis", "ibant"}},
											{{"", "", ""}, {"", "", ""}},
											{{"", "", ""}, {"", "", ""}},
											{{"", "", ""}, {"", "", ""}}};
	public static String[][][] EXEO_DECLENSION = {{{"exeo", "exis", "exit"}, {"eximus", "exitis", "exeunt"}},
		   										{{"exibo", "exibis", "exibit"}, {"exibimus", "exibitis", "exibunt"}},
		   										{{"exibam", "exibas", "exibat"}, {"exibamus", "exibatis", "exibant"}},
		   										{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] REDEO_DECLENSION = {{{"redeo", "redis", "redit"}, {"redimus", "reditis", "redeunt"}},
												{{"redibo", "redibis", "redibit"}, {"redibimus", "redibitis", "redibunt"}},
												{{"redibam", "redibas", "redibat"}, {"redibamus", "redibatis", "redibant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] ABEO_DECLENSION = {{{"abeo", "abis", "abit"}, {"abimus", "abitis", "abeunt"}},
												{{"abibo", "abibis", "abibit"}, {"abibimus", "abibitis", "abibunt"}},
												{{"abibam", "abibas", "abibat"}, {"abibamus", "abibatis", "abibant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] ADEO_DECLENSION = {{{"adeo", "adis", "adit"}, {"adimus", "aditis", "adeunt"}},
												{{"adibo", "adibis", "adibit"}, {"adibimus", "adibitis", "adibunt"}},
												{{"adibam", "adibas", "adibat"}, {"adibamus", "adibatis", "adibant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] INEO_DECLENSION = {{{"ineo", "inis", "init"}, {"inimus", "initis", "ineunt"}},
												{{"inibo", "inibis", "inibit"}, {"inibimus", "inibitis", "inibunt"}},
												{{"inibam", "inibas", "inibat"}, {"inibamus", "inibatis", "inibant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] TRANSEO_DECLENSION = {{{"transeo", "transis", "transit"}, {"transimus", "transitis", "transeunt"}},
													{{"transibo", "transibis", "transibit"}, {"transibimus", "transibitis", "transibunt"}},
													{{"transibam", "transibas", "transibat"}, {"transibamus", "transibatis", "transibant"}},
													{{"", "", ""}, {"", "", ""}},
													{{"", "", ""}, {"", "", ""}},
													{{"", "", ""}, {"", "", ""}}};
	public static String[][][] FERO_DECLENSION = {{{"fero", "fers", "fert"}, {"ferimus", "fertis", "ferunt"}},
												{{"feram", "feres", "feret"}, {"feremus", "feretis", "ferent"}},
												{{"ferebam", "ferebas", "ferebat"}, {"ferebamus", "ferebatis", "ferebant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] ADFERO_DECLENSION = {{{"adfero", "adfers", "adfert"}, {"adferimus", "adfertis", "adferunt"}},
												{{"adferam", "adferes", "adferet"}, {"adferemus", "adferetis", "adferent"}},
												{{"adferebam", "adferebas", "adferebat"}, {"adferebamus", "adferebatis", "adferebant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] CONFERO_DECLENSION = {{{"confero", "confers", "confert"}, {"conferimus", "confertis", "conferunt"}},
													{{"conferam", "conferes", "conferet"}, {"conferemus", "conferetis", "conferent"}},
													{{"conferebam", "conferebas", "conferebat"}, {"conferebamus", "conferebatis", "conferebant"}},
													{{"", "", ""}, {"", "", ""}},
													{{"", "", ""}, {"", "", ""}},
													{{"", "", ""}, {"", "", ""}}};
	public static String[][][] INFERO_DECLENSION = {{{"infero", "infers", "infert"}, {"inferimus", "infertis", "inferunt"}},
												{{"inferam", "inferes", "inferet"}, {"inferemus", "inferetis", "inferent"}},
												{{"inferebam", "inferebas", "inferebat"}, {"inferebamus", "inferebatis", "inferebant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	public static String[][][] REFERO_DECLENSION = {{{"refero", "refers", "refert"}, {"referimus", "refertis", "referunt"}},
												{{"referam", "referes", "referet"}, {"referemus", "referetis", "referent"}},
												{{"referebam", "referebas", "referebat"}, {"referebamus", "referebatis", "referebant"}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}},
												{{"", "", ""}, {"", "", ""}}};
	
	public static final String[] CASE_SHORTHAND = new String[]{CASE_NOMINATIVE_SHORTHAND, CASE_GENITIVE_SHORTHAND, CASE_DATIVE_SHORTHAND, CASE_ACCUSATIVE_SHORTHAND, CASE_ABLATIVE_SHORTHAND};
	
	
	
	public static Noun makeHighestChapterNoun(int chapter){
		return new Noun("aus", "ai", chapter, Values.INDEX_NOUN_TYPE_DECLENSION_SECOND, GENDER_MASCULINE, highestDefinitions);
	}
	
	public static Verb makeHighestChapterVerb(int chapter){
		return new Verb("ao", "aare", "aavi", "aatus", Values.INDEX_CONJUGATION_FIRST, chapter, highestDefinitions);
	}
	
	public static Adjective makeHighestChapterAdjective(int chapter){
		return new FirstSecondAdjective("a", "a", "a", chapter, highestDefinitions);
	}
	
	public static Adverb makeHighestChapterAdverb(int chapter){
		return new Adverb("-", chapter, highestDefinitions);
	}
	
	public static Conjunction makeHighestChapterConjunction(int chapter){
		return new Conjunction("-", chapter, highestDefinitions);
	}
	
	public static Pronoun makeHighestChapterPronoun(int chapter){
		return new Pronoun(chapter, highestDefinitions);
	}
	
	public static Preposition makeHighestChapterPreposition(int chapter){
		return new Preposition("-", chapter, Values.CASE_NOMINATIVE, highestDefinitions);
	}
	
	public static int getGenderIndex(char gender){
		if(gender == Values.GENDER_MASCULINE_CHAR){
			return Values.GENDER_MASCULINE;
		} else if(gender == Values.GENDER_FEMININE_CHAR){
			return Values.GENDER_FEMININE;
		} else if(gender == Values.GENDER_NEUTER_CHAR){
			return Values.GENDER_NEUTER;
		} else return -1;
	}
	
	public static void betterStringArrayPrint(String[] input){
		System.out.println("=======");
		for(String s : input){
			System.out.println(s);
		}
		System.out.println("=======");
	}
	
	public static void betterStringArrayPrint(ArrayList<String> input){
		System.out.println("=======");
		for(String s : input){
			System.out.println(s);
		}
		System.out.println("=======");
	}
	public static Word getWord(String word){
		//Preinitializes, eclipse made me do it :P
		Word returnedWord = null;
		//All the checks, sets var to the word
		for(Noun i : FileParser.getNounsToChapter(MAX_CHAPTER)){
			if(i.toString().equals(word)){
				returnedWord = i;
			}
		}
		for(Verb i : FileParser.getVerbsToChapter(MAX_CHAPTER)){
			if(i.firstPP().equals(word)){
				returnedWord = i;
			}
		}
		for(Adjective i : FileParser.getAdjectivesToChapter(MAX_CHAPTER)){
			if(i.stem.equals(word)){
				returnedWord = i;
			}
		}
		for(Adverb i : FileParser.getAdverbsToChapter(MAX_CHAPTER)){
			if(i.toString().equals(word)){
				returnedWord = i;
			}
		}
		for(Conjunction i : FileParser.getConjunctionsToChapter(MAX_CHAPTER)){
			if(i.toString().equals(word)){
				returnedWord = i;
			}
		}
		//returns the word
		return returnedWord;
		
	}

	public static int getCaseFromString(String shorthand){ //passed "acc.", will return Values.CASE_ACCUSATIVE
		for(int i = 0; i < 5; i++){
		if(shorthand.toLowerCase().contains(Values.CASE_SHORTHAND[i]))
			return i;
		}
		System.out.println("Could not find an appropriate case for String: " + shorthand);
		return -1;
	}
	
	
}
