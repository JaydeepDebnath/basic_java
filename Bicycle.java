class Bicycle
{
protected int startGear;
protected int startSpeed;
public Bicycle(int startGear,int startSpeed)
{
  this.gear= startGear;
 this.speed= starSpeed;
}

public void setGear(int newValue)
{
 startGear=newValue;
}
public void applyBreak(int decrement)
{
speed-= decrement;
}
public void speedUp(int increment)
{
speed+= incerement;
}
}