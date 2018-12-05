package cyberwarFX;

import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.random.RandomHelper;
import repast.simphony.util.ContextUtils;
import repast.simphony.util.collections.IndexedIterable;
import cyberwarFX.chart.ThreatStatechart;
import repast.simphony.ui.probe.ProbedProperty;

/**
 * @author johnkostoff
 * parent class to model cyber threats
 * child classes implement specific attacks
 * Threat behavior scheduling is implemented via statecharts
 * my basic behavior as a threat: 
 * (1) I look for targets
 * (2) when I find one, I attack it 
 * (3) when I am stopped by the CPT, I get removed from the simulation
 * 
 */

public class Threat {
	
	private boolean killSelf;
	
	private int numberOfAttacks;
	
	//these methods implement the statechart that schedules the agent behavior
	@ProbedProperty(displayName="Threat Statechart")
	ThreatStatechart threatStatechart = ThreatStatechart.createStateChart(this, 0);
	
	public String getthreatStatechartState(){
		if (threatStatechart == null) return "";
		Object result = threatStatechart.getCurrentSimpleState();
		return result == null ? "" : result.toString();
	}

	//this variable is a flag that is set if the CPT finds it and marks it for destruction
	public Threat() {
		killSelf = false;
		numberOfAttacks = 0;
	}
	
	//selectTarget() method gets a list of all Assets in the context (simulation) and selects a target at random
	public void selectTarget() {
		//select a target from the list
		Context<?> context = ContextUtils.getContext(this);
		IndexedIterable<?> assetList = context.getObjects(Asset.class);
		// attack a random asset, first we need the size
		int listSize = assetList.size();
		int targetNumber = RandomHelper.nextIntFromTo(0, listSize-1);
		for (Object target : assetList)
		{
			if (target == assetList.get(targetNumber)) {
				this.attackTarget((Asset) target);
			}
		}
		
	}
	
	//attackTarget() method is called by selectTarget and applies the attack to the target
	public void attackTarget(Asset a) {
		a.setUnderAttack(true);
		setNumberOfAttacks();
		// specific effects depend on child classes and thus this method is extended in those classes
	}
	
	//method to return delay times simulating how long actions take, time is in ticks
	//delay is implemented in the statechart
	public double getDelay() {
		double delay = RandomHelper.nextDoubleFromTo(15, 45);
		return delay;
	}
	
	//setter for killSelf flag
	public void set_killSelf(boolean b) {
		this.killSelf = b;
	}
	
	//getter for killSelf flag
	public boolean get_killSelf() {
		return killSelf;
	}
	
	//check and see if the threat is scheduled for removal due to CPT action, remove if true
	@ScheduledMethod(start = 100, interval = 500)
	public void suicide() {
		if (killSelf = true)
		{
			Context<?> context = ContextUtils.getContext(this);
			context.remove(this);
		}
	}

	public int getNumberOfAttacks() {
		return numberOfAttacks;
	}

	public void setNumberOfAttacks() {
		numberOfAttacks = numberOfAttacks++;
	}

}
