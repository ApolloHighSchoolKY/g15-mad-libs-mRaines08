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
		loadAdjectives();
		loadVerbs();

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
			String word = "";
			String file = "";

			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech
			Scanner reader = new Scanner(new File("story.dat"));

			while(reader.hasNext())
				file += "" + reader.next() + " ";

			reader.close();

			System.out.println("file = " + file);

			Scanner chopper = new Scanner(file);

			System.out.println(story);

			while(chopper.hasNext())
			{
				word = chopper.next();

				if(word.equals("@"))
					story += getRandomVerb() + " ";
				else if(word.equals("&"))
					story += getRandomAdjective() + " ";
				else if(word.equals("#"))
					story += getRandomNoun() + " ";
				else
					story += word + " ";
			}

			chopper.close();

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
			Scanner reader = new Scanner(new File("nouns.dat"));

			while(reader.hasNext())
				nouns.add(reader.next());

			reader.close();
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

			reader.close();
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
			Scanner reader = new Scanner(new File("adjectives.dat"));

			while(reader.hasNext())
				adjectives.add(reader.next());

			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		int pos = 0;

		pos = (int)(Math.random()*verbs.size());

		return "" + verbs.get(pos);
	}

	public String getRandomNoun()
	{
		int pos = 0;

		pos = (int)(Math.random()*nouns.size());

		return "" + nouns.get(pos);
	}

	public String getRandomAdjective()
	{
		int pos = 0;

		pos = (int)(Math.random()*adjectives.size());

		return "" + adjectives.get(pos);
	}

	public String toString()
	{
		return "" + story;
	}
}