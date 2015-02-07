
public class ConjugatedWord {
	String conjugatedWord;
	
	public ConjugatedWord(String conjugatedWord){
		this.conjugatedWord = conjugatedWord;
	}
	
	public String toString(){
		return conjugatedWord;
	}
	
	public Clause asClause(){
		return new Clause(new ConjugatedWord[]{this});
	}
}
