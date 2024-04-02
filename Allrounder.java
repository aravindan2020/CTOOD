package Array1;

public class Allrounder implements Cricketplayer1,Cricketmatch {
  String name,stadium;
  int age,runs,wickets;
  public void batsman(String name,int age,int runs)
  {
	  this.name=name;
	  this.age=age;
	  this.runs=runs;
  }
public void bowler(String name,int age,int wickets)
{
	this.name=name;
	 this.age=age;
	 this.wickets=wickets;
}
public void venue(String stadium)
{
	this.stadium=stadium;
}
}