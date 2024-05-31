class MobileException
{
	boolean playGames;
	boolean watchReels;
	public void playGames(boolean playGames)
	{
		this.playGames = playGames;
		if(playGames==true)
		{
			System.out.println("Start game");
		}
		else
		{
			System.out.println("Don't start game");
		}
	}
	public void watchReels(boolean watchReels)
	{
		this.watchReels = watchReels;
		if(watchReels==true)
		{
			System.out.println("Start watching reels");
		}
		else
		{
			System.out.println("Don't start watching reels");
		}
	}
}
class MobileExceptionDriver
{
	static MobileException m;
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try
		{
			MobileExceptionDriver.m.playGames=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try
			{
				MobileException obj = new MobileException();
				obj.playGames(true);
				MobileExceptionDriver.m.watchReels = true;
				obj.watchReels(true);
			}
			catch(Exception ee)
			{
				ee.printStackTrace();
			}
		}
		System.out.println("Main ends");		
	}
}