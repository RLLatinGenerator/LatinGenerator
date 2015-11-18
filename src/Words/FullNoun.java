package Words;

import Words.Adjective;
import Words.ConjugatedNoun;
import Words.Noun;

public class FullNoun extends Noun{
	Noun noun;
	Adjective[] adjectives;
	ConjugatedNoun owner;
	boolean hasAdjectives;
	boolean hasOwner;
	//needs to transition to AdjectiveClause
	public FullNoun(Noun noun){
		super(noun.getNominative(), noun.getGenitive(), noun.getChapter(), noun.getGender(), noun.getDeclension(), noun.getDefinitions());
		this.noun = noun;
	}
	public FullNoun(Noun noun, Adjective[] adjectives){
		super(noun.getNominative(), noun.getGenitive(), noun.getChapter(), noun.getGender(), noun.getDeclension(), noun.getDefinitions());
		this.noun = noun;
		this.adjectives = adjectives;
		hasAdjectives = true;
	}
	public FullNoun(Noun noun, Adjective[] adjectives, ConjugatedNoun owner){
		super(noun.getNominative(), noun.getGenitive(), noun.getChapter(), noun.getGender(), noun.getDeclension(), noun.getDefinitions());
		this.noun = noun;
		this.adjectives = adjectives;
		this.owner = owner;
		hasAdjectives = true;
		hasOwner = true;
	}
	
	@Override
	public ConjugatedNoun decline(int purpose, int Case, int number){
		ConjugatedNoun conjugatedNoun = noun.decline(purpose, Case, number);
		if(hasAdjectives){
			ConjugatedAdjective[] conjugatedAdjectives = new ConjugatedAdjective[adjectives.length];
			for(int i = 0; i < adjectives.length; i++){
				conjugatedAdjectives[i] = adjectives[i].decline(Case, number, noun.getGender(), purpose);
			}
			conjugatedNoun = new ConjugatedNoun(conjugatedNoun, conjugatedAdjectives);
		}
		if(hasOwner){
			conjugatedNoun = new ConjugatedNoun(conjugatedNoun, owner);
		}
		return conjugatedNoun;
	}
	
	
}
