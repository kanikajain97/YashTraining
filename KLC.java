

interface Calculater
{
	public double calculateInterest(double principal, double time, double rate);
	public double calculateCompundInterest(double principal, double time, double rate);
}

class CalImpl implements Calculater
{
	 public  double calculateInterest(double principal, double time, double rate) 
	    {
	        double result = principal * time * rate / 100;
	        return result;
	    }

	
	public double calculateCompundInterest(double principal, double time, double rate) {
		double result = principal * Math.pow(1.0+rate/100.0,time) - principal;
        return result;
	}
}
class Main
{
	public static void main(String[] args)
	{
		double pr, rate, t, sim,com;
	    Scanner sc=new Scanner (System. in);
	    System.out.println("Enter the amount:");
	    pr=sc.nextDouble();
	    System. out. println("Enter the No.of years:");
	    t=sc.nextDouble();
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    CalImpl c= new CalImpl();
	    sim = c.calculateInterest(pr, time, rate);
	    com = c.calculateCompundInterest(pr, time, rate);
	    System.out.println("Simple Interest="+sim);
	    System.out. println("Compound Interest="+com);
	}
}