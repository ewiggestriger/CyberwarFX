/**
 * 
 */
package cyberwarFX;

import repast.simphony.random.RandomHelper;

/**
 * @author johnkostoff
 *
 */
public class DDOS extends Threat {

	/**
	 * this threat attacks Asset availability
	 * parameters as per Kaur/Sangal/Kumar paper
	 */
	
	private char attackSize;
	
	public DDOS() {
		
		attackSize = attackSizeChooser();
	}
	
	@Override
	public void attackTarget(Asset a) {
		//determine successful attack by probabilities depending on size of attack
		double ra = RandomHelper.nextDouble();
		if (this.attackSize == 's')
		{
			if (ra <= 0.5)
			{
				a.setUnderAttack(true);
				a.set_availability(false);
			}
		}
		else if (this.attackSize == 'm')
		{
			if (ra <= 0.7)
			{
				a.setUnderAttack(true);
				a.set_availability(false);
			}
		}
		else
		{
			if (ra <= 0.9)
			{
				a.setUnderAttack(true);
				a.set_availability(false);
			}
		}
	}
	
	public char attackSizeChooser() {
		//determine size of DDOS attack at random
		double ra = RandomHelper.nextDouble();
		char as;
		
		if (ra < 0.34) {
			as = 's';
		}
		else if (ra < 0.67)
		{
			as = 'm';
		}
		else 
		{
			as = 'l';
		}
		
		return as;
	}
	
}
