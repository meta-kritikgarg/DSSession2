package queue;

import java.util.ArrayList;

public class College {
	
	private String collegeName;
	private int collegeRank , collegeSeats;
	ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
	
	/**
	 * Constructor for setting up the name , rank and seats of college
	 * @param collegeName
	 * @param collegeRank
	 * @param collegeSeats
	 */
	public College(String collegeName, int collegeRank, int collegeSeats){
		this.collegeName = collegeName;
		this.collegeRank = collegeRank;
		this.collegeSeats = collegeSeats;
	}
	
	
	/**
	 * Method to add a candidate in list 
	 * @param c Candidate
	 */
	public void addCandidate(Candidate c) {
		if(candidateList.size()<collegeSeats) {
			candidateList.add(c);
		}
		else {
			throw new IndexOutOfBoundsException("No empty seat in college");
		}
	}
	
	
	/**
	 * Getter for college name
	 * @return collegeName
	 */
	public String getCollegeName() {
		return this.collegeName;
	}
	
	
	/**
	 * Getter for collegeRank
	 * @return collegeRank
	 */
	public int getCollegeRank() {
		return this.collegeRank;
	}
	

	/**
	 * Getter for collegeSeats
	 * @return collegeSeats
	 */
	public int getCollegeSeats(){
		return this.collegeSeats;
	}
	
	
	/**
	 * Method to get empty seats in this college
	 * @return
	 */
	public int getEmptySeats() {
		return collegeSeats-candidateList.size();
	}
	
	
	/**
	 * Method to check college is full or not
	 * @return
	 */
	public boolean isFull() {
		if(getEmptySeats()<=0) {
			return true;
		}
		return false;
	}

}
