package epam.assignment2.premchaluvadi;
public class HouseConstructionCost 
{
	String standardmaterial;
	double totalareaofhouse,finalcost;
	String homeautomation;
HouseConstructionCost(String standardmaterial,double totalareaofhouse,String homeautomation)
	{
		this.standardmaterial=standardmaterial;
		this.totalareaofhouse=totalareaofhouse;
		this.homeautomation=homeautomation;
	}
	double estimatingConstructionCost()
	{
		if(standardmaterial.equals("NORMAL"))
		{
			finalcost=1200*totalareaofhouse;
		}
		else if(standardmaterial.equals("ABOVE"))
		{
			finalcost=1500*totalareaofhouse;
		}
		else if(standardmaterial.equals("HIGH"))
		{
			if(homeautomation.equals("YES"))
			{
				finalcost=2500*totalareaofhouse;
			}
			else
			{
				finalcost=1800*totalareaofhouse;
			}
		}
		return finalcost;
	}
}