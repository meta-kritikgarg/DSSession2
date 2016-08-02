package queue;

public class College {
	
	private String collegeName;
	private int collegeRank , collegeSeats;
	
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

}
