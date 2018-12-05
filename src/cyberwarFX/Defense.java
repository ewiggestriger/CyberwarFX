/**
 * 
 */
package cyberwarFX;

import repast.simphony.engine.schedule.ScheduledMethod;

/**
 * @author johnkostoff
 * parent class for all the cyber defenses in the C2 network
 * extends Asset
 * my basic behavior:
 * (1) I look for attacks
 * (2) if I am attacked I remove the attack against me
 */

public class Defense extends Asset {
	

	public Defense() {
		
	}
	
	//this method stops attacks once they've been detected. Logic checks to trigger method are in the statechart for this class
	@ScheduledMethod(start = 1, interval = 100)
	public void remediateAttack() {
		
		//stops attack and resets all conditions to true
		this.setUnderAttack(false);
		this.set_availability(true);
		this.set_confidentiality(true);
		this.set_integrity(true);
		
	}
}
