package Words;

public class ConjugatedNoun extends ConjugatedWord{
	int number;
	int Case;
	int gender;
	boolean hasAdjectives;
	ConjugatedAdjective[] adjectives;
	
	public ConjugatedNoun(Noun unConjugated, String noun, int purpose, int number, int Case, int gender){
		super(unConjugated, noun, purpose);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
		hasAdjectives = false;
	}
	public ConjugatedNoun(Noun unConjugated, String noun, int purpose, int number, int Case, int gender, ConjugatedAdjective[] adjectives){
		super(unConjugated, noun, purpose);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
		this.adjectives = adjectives;
		hasAdjectives = true;
	}
	public ConjugatedNoun(Noun unConjugated, String noun, int purpose, int number, int Case, int gender, ConjugatedNoun owner){
		super(unConjugated, owner.toString() + " " + noun, purpose);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
		hasAdjectives = false;
	}
	public ConjugatedNoun(Noun unConjugated, String noun, int purpose, int number, int Case, int gender, ConjugatedAdjective[] adjectives, ConjugatedNoun owner){
		super(unConjugated, owner.toString() + " " + noun, purpose);
		this.number = number;
		this.Case = Case;
		this.gender = gender;
		this.adjectives = adjectives;
		hasAdjectives = true;
	}
	public ConjugatedNoun(ConjugatedNoun noun, ConjugatedAdjective[] adjectives){
		//adds adjectives
		super(new Word(noun.chapter, noun.definitions), noun.toString(), noun.getPurpose());
		this.number = noun.getNumber();
		this.Case = noun.getCase();
		this.gender = noun.getGender();
		this.adjectives = adjectives;
		hasAdjectives = true;
	}
	public ConjugatedNoun(ConjugatedNoun noun, ConjugatedNoun owner){
		//adds owner
		super(new Word(noun.chapter, noun.definitions), owner.toString() + " " + noun.toString(), noun.getPurpose());
		this.number = noun.getNumber();
		this.Case = noun.getCase();
		this.gender = noun.getGender();
		hasAdjectives = false;
	}
	public ConjugatedNoun(ConjugatedNoun noun, ConjugatedAdjective[] adjectives, ConjugatedNoun owner){
		//adds owner + adjectives
		super(new Word(noun.chapter, noun.definitions), owner.toString() + " " + noun.toString(), noun.getPurpose());
		this.number = noun.getNumber();
		this.Case = noun.getCase();
		this.gender = noun.getGender();
		this.adjectives = adjectives;
		hasAdjectives = true;
	}
	
	public int getNumber(){
		return number;
	}
	public int getCase() {
		return Case;
	}
	public int getGender() {
		return gender;
	}
	@Override
	public String toString(){
		String string = getConjugatedWord();
		if(hasAdjectives){
			string = string + " " + adjectives[0].getConjugatedWord();
			if(adjectives.length > 1){
				for(ConjugatedAdjective adjective : adjectives){
					string = string + " et " + adjective;
				}
			}
		}
		return string;	
	}
	

}
