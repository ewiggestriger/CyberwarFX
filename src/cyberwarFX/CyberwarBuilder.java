/**
 * 
 */
package cyberwarFX;

import java.util.Vector;

import repast.simphony.context.Context;
import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;

/**
 * @author johnkostoff
 * this class builds the simulation context(s) that the agents will operate in
 */
public class CyberwarBuilder implements ContextBuilder<Object> {
	
	/** this method builds the "context" which is a container that contains all the agents and is
	 * the necessary precondition to building structures that represent space that the agents can
	 * operate in, which in Repast S are called projections. The builder will build all the agents 
	 * and then the projections they operate in.
	 */
	
	@Override 
	public Context<?> build(Context<Object> context) {
		context.setId("CyberwarFX");
		
		//create a vector to hold all agents prior to their being added to different contexts
		Vector<Object> assets = new Vector<Object>();
		Vector<Object> defenses = new Vector<Object>();
		Vector<Object> DDOS = new Vector<Object>();
		Vector<Object> dataEx = new Vector<Object>();
		Vector<Object> dataMan = new Vector<Object>();
				
		//add agents to vector, first get parameters from file
		Parameters params = RunEnvironment.getInstance().getParameters();
		// populate with assets
		int assetCount = params.getInteger("Asset_Count");
		int defenseCount = params.getInteger("Defense_Count");
		int DDOSCount = params.getInteger("DDOS_Count"); 
		int dataExCount = params.getInteger("dataEx_Count");
		int dataManCount = params.getInteger("dataMan_Count");
		
		for (int i = 0; i < assetCount; i++) {
			assets.add(new Asset());
		}
		for (int i2 = 0; i2 < defenseCount; i2++) {
			defenses.add(new Defense());
		}
		for (int i3 = 0; i3 < DDOSCount; i3++) {
			DDOS.add(new DDOS());
		}
		for (int i5 = 0; i5 < DDOSCount; i5++) {
			dataEx.add(new DataExfiltration());
		}
		for (int i6 = 0; i6 < DDOSCount; i6++) {
			dataMan.add(new DataManipulation());
		}
		
		//this procedure will create all the agents in the simulation, params are in an initialization file
		//first is the global context, all agents from the vector lists will be added to it
		for (int i4 = 0; i4 < assetCount; i4++) {
			context.add(assets.elementAt(i4));
		}
		for (int d = 0; d < defenseCount; d++) {
			context.add(defenses.elementAt(d));
		}
		for (int dd = 0; dd < DDOSCount; dd++) {
			context.add(DDOS.elementAt(dd));
		}
		for (int x = 0; x < dataExCount; x++) {
			context.add(dataEx.elementAt(x));
		}
		for (int m = 0; m < dataManCount; m++) {
			context.add(dataMan.elementAt(m));
		}
		
		// add the Cyber Protection Team
		context.add(new CyberProtectionTeam());
		
		return context;
	}
	
}
