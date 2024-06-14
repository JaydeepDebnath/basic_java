class MountainBike extends Bicycle
{
public int seatHeight;
public MountainBike(int seatHeight,int startGear,int startSpeed)
{
super(startGear,startSpeed);
this.seatHeight = startHeight;
}
 public void seatHeight(int newValue)
{
 seatHeight = newValue;
}
}