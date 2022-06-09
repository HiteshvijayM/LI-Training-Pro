package Intro;

import Intro.Desktop.DesktopSet;

class Desktop
{
	public Desktop()
	{
		
	}
	enum DesktopSet {CPU , Ram , Rom , Keyboard}
    DesktopSet set;
	
}

public class EnumEx 
{
	public static void main(String args[])
	{
		Desktop set1 = new Desktop();
		set1.set = DesktopSet.CPU;
		System.out.println("Set is " + set1.set);
		
	}
}
