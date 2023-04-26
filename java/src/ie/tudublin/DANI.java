package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	public void settings() {
		size(1000, 1000);
		// fullScreen(SPAN);
	}

	// loading a file
	public void loadFile(String filename) {
		String[] lines = loadStrings(filename);
			split(lines,' ');
			w.replaceAll("[^\\w\\s]","");
			s.toLowerCase()
	}

	// printing
	public void printmodel() {
		for (Word w : words.values()) {
			System.out.println(w.toString());
		}
	}

	String[] sonnet;

	public String[] writeSonnet() {
		return null;
	}

	public void setup() {
		colorMode(HSB);

	}

	// generate new sonnet on spacebar press
	public void keyPressed() {
		if (key == ' ') {
			for (String line : sonnet) {
				System.out.println(line);
			}
		}
	}

	public Class Follow() {
		String word;
		int count;
		//constructor
		public Follow(String word, int count) {
			this.word = word;
			this.count = count;
		}
		//accessors
		public String getWord() {
			return word;
		}
	
		public int getCount() {
			return count;
		}
		
		//to string method
		public String toString() {
			return word + " " + count;
		}
		return null;

	}

	public Class word(){
		String word;
    	ArrayList<Follow> follows;

		//getting access to word and follows
		String getWord() {
			return word;
		}
	
		public ArrayList<Follow> getFollows() {
			return follows;
		}

		// Constructor
		public Word(String word, ArrayList<Follow> follows) {
			this.word = word;
			this.follows = follows;
		}
		public String toString() {
			return word + " " + follows;
		}
		return null;

	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
		textAlign(CENTER, CENTER);

		for (String lines : sonnet) {
			text(lines, X, Y, X, Y);
		}

	}
}
