/*
 *      (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *          - One birth every 7 seconds
 *          - One death every 13 seconds
 *          - One new immigrant every 45 seconds
 *      Write a program to display the population for each of the next five years.
 *      Assume the current population is 312,032,486 and one year has 365 days.
 */
public class population { 
	public static void main(String args[])
	{
		double bseconds=7.0;
		double dseconds=13.0;
		double iseconds=45.0;
		double currentpop= 312032486.0;
		double secinyear= 60*60*24*365;
		double birth, death, immi,total=0.0;
		
		for(int i =0; i <5 ; i++)
		{
			birth = secinyear / bseconds;
			death= secinyear / dseconds;
			immi = secinyear / iseconds;
			currentpop=  birth + currentpop + immi - death;
			System.out.println("Total population of year "+(i+1)+" is "+ (int)currentpop);
			
		}
		
	}

}
