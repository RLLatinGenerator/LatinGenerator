
public class Values {
	
	//Noun land
	public static final int CASE_NOMINATIVE = 0;
	public static final int CASE_GENTIVE = 1;
	public static final int CASE_DATIVE= 2;
	public static final int CASE_ACCUSATIVE= 3;
	public static final int CASE_ABLATIVE = 4;
	//public static final int CASE_VOCATIVE= 5;
	//public static final int CASE_LOCATIVE = 6;
	
	public static final int PLURALITY_PLURAL = 1;
	public static final int PLURALITY_SINGULAR = 0;
	
	public static String[][] DECLENSION_FIRST =  new String[][]{{"a", "ae", "ae", "am", "a"}, {"ae", "arum", "is", "as", "is"}};
	public static String[][] DECLENSION_SECOND = new String[][]{{"us", "i", "o", "um", "o"}, {"i", "orum", "is", "os", "is"}};
	public static String[][] DECLENSION_SECOND_N = new String [][]{{"um", "i", "o", "um", "o"}, {"a", "orum", "is", "a", "is"}};
	public static String[][] DECLENSION_THIRD = new String[][]{{"", "is", "i", "em", "e"}, {"es", "um", "ibus", "es", "ibus"}};
	public static String[][] DECLENSION_THIRD_I = new String[][]{{"", "is", "i", "em", "e"}, {"es", "ium", "ibus", "es", "ibus"}};
	public static String[][] DECLENSION_THIRD_I_N = new String[][]{{"", "is", "i", "", "i"}, {"ia", "ium", "ibus", "ia", "ibus"}};
	public static String[][] DECLENSION_FOURTH = new String[][]{{"us", "us", "ui", "um", "u"}, {"us", "uum", "ibus", "us", "ibus"}};
	public static String[][] DECLENSION_FOURTH_N = new String[][]{{"u", "us", "u", "u", "u"}, {"ua", "uum", "ibus", "ua", "ibus"}};
	public static String[][] DECLENSION_FIFTH = new String[][]{{"es","ei","ei","em","e"}, {"es","erum","ebus","es","ebus"}};	//TODO: fifth
	
	public static String[][][] DECLENSION_NOUNS = new String[][][]{DECLENSION_FIRST, DECLENSION_SECOND, DECLENSION_SECOND_N, DECLENSION_THIRD, DECLENSION_THIRD_I, DECLENSION_THIRD_I_N, DECLENSION_FOURTH, DECLENSION_FOURTH_N, DECLENSION_FIFTH};
	
	public static final int INDEX_DECLENSION_FIRST = 0;
	public static final int INDEX_DECLENSION_SECOND = 1;
	public static final int INDEX_DECLENSION_SECOND_N = 2;
	public static final int INDEX_DECLENSION_THIRD = 3;
	public static final int INDEX_DECLENSION_THIRD_N = 4;
	public static final int INDEX_DECLENSION_THIRD_I_N = 5;
	public static final int INDEX_DECLENSION_FOURTH = 6;
	public static final int INDEX_DECLENSION_FORTH_N = 7;
	public static final int INDEX_DECLENSION_FIFTH = 8;
	
	//Verb land
	public static String[][] CONJUGATION_FIRST = new String[][]{{"o","as","at"}, {"amus","atis","ant"}};
	public static String[][] CONJUGATION_SECOND = new String[][]{{"eo","es","et"}, {"emus","etis","ent"}};
	public static String[][] CONJUGATION_THIRD = new String[][]{{"o","is","it"}, {"imus","itis","unt"}};
	public static String[][] CONJUGATION_THIRD_IO = new String[][]{{"io","is","it"}, {"imus","itis","iunt"}};
	public static String[][] CONJUGATION_FOURTH = new String[][]{{"io","is","it"}, {"imus","itis","iunt"}};
	
	public static String[][][] CONJUGATION_VERBS = new String[][][]{CONJUGATION_FIRST, CONJUGATION_SECOND, CONJUGATION_THIRD, CONJUGATION_THIRD_IO, CONJUGATION_FOURTH};
	
	public static final int INDEX_CONJUGATION_FIRST = 0;
	public static final int INDEX_CONJUGATION_SECOND = 1;
	public static final int INDEX_CONJUGATION_THIRD = 2;
	public static final int INDEX_CONJUGATION_THIRDIO = 3;
	public static final int INDEX_CONJUGATION_FOURTH = 4;
}
