package Practice;

import java.util.*;

public class office{
  static void Rahul ()
  {
    try (Scanner st = new Scanner (System.in)) {
      System.out.println ("Enter the distance from home to office(in km): ");
    double dis = st.nextDouble ();
      dis = dis * 10;
      System.out.println ("Total distance covered by Rahul in a week is" +
			  dis);
    }

  }
  static void Sachin ()
  {
    try (Scanner sc = new Scanner (System.in)) {
      System.out.println ("Enter the distance of Sachin home from office(in km):");
      double dist = sc.nextDouble ();
      System.out.println("To reach hom in 30 minutes Sachin is currntly traveling at a speed of "+ (dist / 30) + "km/hr");
      System.out.println ("How many minutes before is he leaving the office:");
      double time = sc.nextDouble ();
      if (time < 30)
        {
double speed = dist / (30 - time);
System.out.println ("To reach home on time Sachin has to move at a speed of " +
         speed + "km/hr.");
        }
      else if (time == 30)
        {
System.out.println ("He will reach on exact time.");
        }
      else if (time > 30)
        {
double speed = dist / (30 + time);
System.out.println ("To reach home on time Sachin has to move at a speed of " +
         speed + "km/hr.");
        }
    }

  }


  public static void main (String[]args)
  {
    try (Scanner pu = new Scanner (System.in)) {
      System.out.println ("Select person:\n1)Rahul\n2)Sachin");
      int per = pu.nextInt ();
      if (per == 1)
        {
Rahul ();
        }
      else if (per == 2)
        {
Sachin ();
        }
      else
        System.out.println ("invalid option");
    }
  }
}