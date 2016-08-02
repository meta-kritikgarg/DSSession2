package queue;

import java.util.ArrayList;
import java.util.Scanner;

public class CollegeCounseling {
	
	public static void main(String[] args) {
		CollegeCounseling collegeCounseling = new CollegeCounseling();
		MyQueue<Candidate> candidateQueue = new MyQueue<Candidate>(5);
		
		ArrayList<College> collegeList = collegeCounseling.getColleges();

		// To make queue of candidate according to rank
		for(int i = 1; i <= 5; i++ ) {
			Candidate tmp = collegeCounseling.getCandidate(i);
			candidateQueue.enqueue(tmp);
		}
		
		// College allocation according to seats and choices
		while(candidateQueue.isEmpty()!=true) {
			Candidate c = (Candidate) candidateQueue.dequeue(); 
			ArrayList<Integer> choices = c.choices;	
			boolean flag = false;
			//find college according to choice
			for (Integer choice : choices) {
				if(!collegeList.get(choice).isFull()) {
					collegeList.get(choice).addCandidate(c);
					System.out.println(c.getCandidateName() + " --> "+ collegeList.get(choice).getCollegeName());
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(c.getCandidateName() + " --> "+ "No Allocation, given choices are filled");
			}
		}
	}
	
	
	/**
	 * Method to get candidate object
	 * @param rank int
	 * @return Candidate
	 */
	public Candidate getCandidate(int rank) {
		Candidate c = new Candidate("Candidate"+rank, rank);
		while(true) {
			int input = getIntfromUser("Enter Choice for Candidate having rank "+rank + ", Enter 0 for next");
			if(input==0) {
				break;
			}
			
			if(input>0 && input <= getColleges().size()) {
				c.addChoice(input-1);
			}
			else {
				System.out.println("Wrong choice, try again");
			}
		}
		return c;
	}
	
	
	/**
	 * Method to get list of colleges
	 * @return ArrayList<College>
	 */
	public ArrayList<College> getColleges() {
		ArrayList<College> collegeLists = new ArrayList<College>();
		
		College college1 = new College("RTU Kota", 1,1);
		College college2 = new College("LNMIIT", 2,1);
		College college3 = new College("JECRC",3,1);
		College college4 = new College("SKIT",4,2);
		College college5 = new College("Poornima University", 5,3);
		
		collegeLists.add(college1);
		collegeLists.add(college2);
		collegeLists.add(college3);
		collegeLists.add(college4);
		collegeLists.add(college5);
		
		return collegeLists;
	}
	
	
	/**
	 * Method to read integer data from standard input
	 * @param Name of variable to print 
	 * @return int value of integer
	 */
	public int getIntfromUser(String Name) {
		Scanner s= new Scanner(System.in);
		int number = -1;		
		while(true){
			try {
				System.out.println("Enter "+Name);
				number=s.nextInt();
				if(number>=0){
					break;
				}
				else{
					System.out.println("Invalid, Try Again");
				}
			} catch (Exception e) {
				System.out.println("Invalid, Try again");
				s.next();
			}
		}
		return number;
	}
}
