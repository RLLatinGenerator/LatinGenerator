package Words;

public class ConjugatedWord extends Word{
	private String conjugatedWord;
	private int purpose;
	
	public ConjugatedWord(ConjugatedWord copy){
		super(new Word(copy.chapter, copy.definitions));
		this.conjugatedWord = copy.conjugatedWord;
		this.purpose = copy.purpose;
	}
	
	public ConjugatedWord(Word unConjugated, String conjugatedWord, int purpose){
		super(unConjugated);
		this.conjugatedWord = conjugatedWord;
		this.purpose = purpose;
	}
	
	public String toString(){
		return conjugatedWord;
	}
	
	public Clause asClause(){
		return new Clause(new ConjugatedWord[]{this});
	}
	
	public String getConjugatedWord(){
		return conjugatedWord;
	}

	public int getPurpose() {
		return purpose;
	}

	public void setPurpose(int purpose) {
		this.purpose = purpose;
	}

	public void setConjugatedWord(String conjugatedWord) {
		this.conjugatedWord = conjugatedWord;
	}
}
