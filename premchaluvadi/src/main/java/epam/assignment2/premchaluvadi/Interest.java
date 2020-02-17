package epam.assignment2.premchaluvadi;
public class Interest 
{
	double p,t,r,in;
	Interest(double principle,double rate,double time)
	{
		this.p=principle;
		this.r=rate;
		this.t=time;
	}
	double SimpleInterest()
	{
		in=(p*t*r)/100;
		return in;
	}
	double CompoundInterest()
	{
		in=p*(Math.pow((1+(r/100)),t))-p;
		return in;
	}
}