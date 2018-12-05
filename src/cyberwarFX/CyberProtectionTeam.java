/**
 * 
 */
package cyberwarFX;

import java.util.Iterator;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.util.ContextUtils;
import repast.simphony.util.collections.IndexedIterable;

/**
 * @author johnkostoff
 *
 */
public class CyberProtectionTeam extends Defense implements IndexedIterable<Object> {
	/**
	 * CPT hunts for threats
	 * stops attacks underway and restores assets
	 * hunts down threats and eliminates them
	 */
	
	public CyberProtectionTeam() {
		// TODO Auto-generated constructor stub
	
	}
	
	//the CPT looks around for assets under attack and picks one to inspect
	// if it's under attack, it remediates the attack
	@ScheduledMethod(start = 1, interval = 150)
	public void hunt() {
		Context<?> context = ContextUtils.getContext(this);
		IndexedIterable<?> assetList = context.getObjects(Asset.class);
		//iterate through the list, find a random asset, and check to see if it's under attack
		int listSize = assetList.size();
		int targetNumber = RandomHelper.nextIntFromTo(0, listSize-1);
		for (Object asset : assetList) {
			
			if (asset == assetList.get(targetNumber) && ((Asset) asset).getUnderAttack() == true)
			{
				remediate((Asset) asset);
			}
		}
	}
	
	public void remediate(Asset a) {
		//end attack and reset CIA levels of asset
		a.setUnderAttack(false);
		a.set_availability(true);
		a.set_confidentiality(true);
		a.set_integrity(true);
		//the CPT will look for a threat at the conclusion of this and try to eliminate it 
		double r = getRandom();
		if (r < 0.25)
		{
			seekAndDestroy();
		}
	}

	// this is the method to find and destroy a threat
	public void seekAndDestroy() {
		Context<?> context = ContextUtils.getContext(this);
		IndexedIterable<?> threatList = context.getObjects(Threat.class);
		//iterate through the list and find a random threat
		int listSize = threatList.size();
		int targetNumber = RandomHelper.nextIntFromTo(0, listSize-1);
		//this check avoids an error when the list is only 1 object in size
		for (Object target : threatList)
		{
			if (target == threatList.get(targetNumber)) {
				//mark the threat for removal (can't remove during iteration without crash)
				((Threat) target).set_killSelf(true);
			}
		}
	}
	
	public double getRandom() {
		double random = RandomHelper.nextDouble();
		return random;
	}
	
	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
