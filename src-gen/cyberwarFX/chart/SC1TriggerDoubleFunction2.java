package cyberwarFX.chart;

import repast.simphony.statecharts.*;
import repast.simphony.parameter.Parameters;
import repast.simphony.statecharts.generator.GeneratedFor;

import cyberwarFX.*;

/**
 * Trigger Function for Transition 39, from = Attack the Target, to = look for a new target.
 */
@GeneratedFor("_-gaiQPZ3EeipuOADhlr5og")
public class SC1TriggerDoubleFunction2 implements TriggerDoubleFunction<Threat> {
	@Override
	public double value(Threat agent, Transition<Threat> transition, Parameters params) throws Exception {
		return agent.getDelay();

	}
}
