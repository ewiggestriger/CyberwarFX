package cyberwarFX.chart;

import repast.simphony.statecharts.*;
import repast.simphony.parameter.Parameters;
import repast.simphony.statecharts.generator.GeneratedFor;

import cyberwarFX.*;

/**
 * Action for Attack the Target.
 */
@GeneratedFor("_-gaiQPZ3EeipuOADhlr5og")
public class SC1OnEnterAction2 implements StateAction<Threat> {
	@Override
	public void action(Threat agent, AbstractState<Threat> state, Parameters params) throws Exception {
		agent.selectTarget();

	}
}
