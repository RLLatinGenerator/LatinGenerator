package Words;

public class ConjugatedWord extends Word{
	String conjugatedWord;
	
	public ConjugatedWord(Word unConjugated, String conjugatedWord){
		super(unConjugated);
		this.conjugatedWord = conjugatedWord;
	}
	
	public String toString(){
		return conjugatedWord;
	}
	
	public Clause asClause(){
		return new Clause(new ConjugatedWord[]{this});
	}
}
