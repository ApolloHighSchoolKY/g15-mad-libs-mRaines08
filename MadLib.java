//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Walmart");
		adjectives.add("massive");
		story = "I punched Walmart in a massive way.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();


		//read from story.dat
		//need a second scanner to chop up the string
		//once you have a chopped up string check if a word is one of the symbols

		//@ = random verb  
		//& = random adjective  
		//# = random noun     
		//else concatinate the word onto the story

		//problem do not use more then one .next in the has next loop

		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech


			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{

		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner reader = new Scanner(new File("verbs.dat"));

			while(reader.hasNext())
				verbs.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner reader = new Scanner(new File("nouns.dat"));

			while(reader.hasNext())
				nouns.add(reader.next());
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{

		return "";
	}

	public String getRandomNoun()
	{
		return "";
	}

	public String getRandomAdjective()
	{
		return "";
	}

	public String toString()
	{
		return "" + story;
	}
}