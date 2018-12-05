/**
 * 
 */
package cyberwarFX;

import repast.simphony.random.RandomHelper;

/**
 * @author johnkostoff
 *
 */
public class DataExfiltration extends Threat {

	/**
	 * this threat attacks Asset confidentiality
	 */
	public DataExfiltration() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attackTarget(Asset a) {
		//assess effects if attack is successful
		double ra = RandomHelper.nextDouble();
		if (ra < 0.45)
		{
			a.setUnderAttack(true);
			a.set_confidentiality(false);
		}
		
	}

}
