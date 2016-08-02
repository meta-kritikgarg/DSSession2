package queue;

import java.util.ArrayList;

public class Candidate {
	
	private String candidateName;
	private int candidateRank;
	ArrayList<Integer> choices = new ArrayList<Integer>();
	
	/**
	 * Constructor to set up the fields of candidate
	 * @param candidateName
	 * @param candidateRank
	 */
	public Candidate(String candidateName, int candidateRank) {
		this.candidateName = candidateName;
		this.candidateRank = candidateRank;
	}
	
	
	/**
	 * Getter for candidateName
	 * @return candidateName
	 */
	public String getCandidateName() {
		return this.candidateName;
	}
	
	
	/**
	 * Getter for candidateRank
	 * @return candidateRank
	 */
	public int getCandidateRank() {
		return this.candidateRank;
	}
	
	
	/**
	 * To add choices
	 * @param c int
	 */
	public void addChoice(int c) {
		if(!choices.contains(c)) {
			choices.add(c);
		}
	}

}
