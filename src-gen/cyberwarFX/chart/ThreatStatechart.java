
package cyberwarFX.chart;

import java.util.Map;
import java.util.HashMap;

import repast.simphony.statecharts.*;
import repast.simphony.statecharts.generator.GeneratedFor;

import cyberwarFX.*;

@GeneratedFor("_-gaiQPZ3EeipuOADhlr5og")
public class ThreatStatechart extends DefaultStateChart<cyberwarFX.Threat> {

	public static ThreatStatechart createStateChart(cyberwarFX.Threat agent, double begin) {
		ThreatStatechart result = createStateChart(agent);
		StateChartScheduler.INSTANCE.scheduleBeginTime(begin, result);
		return result;
	}

	public static ThreatStatechart createStateChart(cyberwarFX.Threat agent) {
		threatStatechartGenerator generator = new threatStatechartGenerator();
		return generator.build(agent);
	}

	private ThreatStatechart(cyberwarFX.Threat agent) {
		super(agent);
	}

	private static class MyStateChartBuilder extends StateChartBuilder<cyberwarFX.Threat> {

		public MyStateChartBuilder(cyberwarFX.Threat agent, AbstractState<cyberwarFX.Threat> entryState,
				String entryStateUuid) {
			super(agent, entryState, entryStateUuid);
			setPriority(0.0);
		}

		@Override
		public ThreatStatechart build() {
			ThreatStatechart result = new ThreatStatechart(getAgent());
			setStateChartProperties(result);
			return result;
		}
	}

	private static class threatStatechartGenerator {

		private Map<String, AbstractState<Threat>> stateMap = new HashMap<String, AbstractState<Threat>>();

		public ThreatStatechart build(Threat agent) {
			SimpleStateBuilder<Threat> ssBuilder1 = new SimpleStateBuilder<Threat>("Look for Targets");
			SimpleState<Threat> s1 = ssBuilder1.build();
			stateMap.put("_dyVGAPZ4EeipuOADhlr5og", s1);
			MyStateChartBuilder mscb = new MyStateChartBuilder(agent, s1, "_dyVGAPZ4EeipuOADhlr5og");

			SimpleStateBuilder<Threat> ssBuilder2 = new SimpleStateBuilder<Threat>("Attack the Target");
			ssBuilder2.registerOnEnter(new SC1OnEnterAction2());
			SimpleState<Threat> s2 = ssBuilder2.build();
			stateMap.put("_k38d0fZ4EeipuOADhlr5og", s2);
			mscb.addRootState(s2, "_k38d0fZ4EeipuOADhlr5og");
			SimpleStateBuilder<Threat> ssBuilder3 = new SimpleStateBuilder<Threat>("look for a new target");
			SimpleState<Threat> s3 = ssBuilder3.build();
			stateMap.put("_zkhpYPasEeipuOADhlr5og", s3);
			mscb.addRootState(s3, "_zkhpYPasEeipuOADhlr5og");
			createTransitions(mscb);
			return mscb.build();

		}

		private void createTransitions(MyStateChartBuilder mscb) {
			// creates transition Attack
			createTransition1(mscb);
			// creates transition Transition 39
			createTransition2(mscb);
			// creates transition Transition 40
			createTransition3(mscb);

		}

		// creates transition Attack, from = Look for Targets, to = Attack the Target
		private void createTransition1(MyStateChartBuilder mscb) {
			TransitionBuilder<Threat> tb = new TransitionBuilder<Threat>("Attack",
					stateMap.get("_dyVGAPZ4EeipuOADhlr5og"), stateMap.get("_k38d0fZ4EeipuOADhlr5og"));
			tb.addTrigger(new TimedTrigger<Threat>(new SC1TriggerDoubleFunction2()));
			tb.setPriority(0.0);
			mscb.addRegularTransition(tb.build(), "_uNkJYfZ4EeipuOADhlr5og");
		}

		// creates transition Transition 39, from = Attack the Target, to = look for a new target
		private void createTransition2(MyStateChartBuilder mscb) {
			TransitionBuilder<Threat> tb = new TransitionBuilder<Threat>("Transition 39",
					stateMap.get("_k38d0fZ4EeipuOADhlr5og"), stateMap.get("_zkhpYPasEeipuOADhlr5og"));
			tb.addTrigger(new TimedTrigger<Threat>(new SC1TriggerDoubleFunction2()));
			tb.setPriority(0.0);
			mscb.addRegularTransition(tb.build(), "_3lXoofasEeipuOADhlr5og");
		}

		// creates transition Transition 40, from = look for a new target, to = Look for Targets
		private void createTransition3(MyStateChartBuilder mscb) {
			TransitionBuilder<Threat> tb = new TransitionBuilder<Threat>("Transition 40",
					stateMap.get("_zkhpYPasEeipuOADhlr5og"), stateMap.get("_dyVGAPZ4EeipuOADhlr5og"));
			tb.addTrigger(new TimedTrigger<Threat>(new SC1TriggerDoubleFunction3()));
			tb.setPriority(0.0);
			mscb.addRegularTransition(tb.build(), "_4S6rIPasEeipuOADhlr5og");
		}

	}
}
