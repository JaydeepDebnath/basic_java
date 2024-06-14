class inheritanceDemo
{
 public static void main(String[] args)
{
MountainBike mountainBike= new MountainBike( 20, 10, 2);
System.out.println("Gear is" + mountainBike.Gear);
System.out.println("Seat height is "+ mountainBike.seatHeight);
System.out.println("Bike speed is"+ mountainBike.Speed);
mountainBike.applyBreak(1);
mountainBike.speedUp(10);
mountainBike.setGear(4);
System.out.println("Apply break" + mountainBike.applyBreak);
System.out.println("After speed up" + mountainBike.speedUp);
System.out.println(" After Set new gear" + mountainBike.setGear);
}
}