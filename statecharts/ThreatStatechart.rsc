<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns="http://repast.sf.net/statecharts" xmlns:notation="http://www.eclipse.org/gmf/runtime/1.0.2/notation">
  <StateMachine xmi:id="_-gbJUPZ3EeipuOADhlr5og" agentType="cyberwarFX.Threat" package="cyberwarFX.chart" className="threatStatechart" nextID="42" id="Threat Statechart" uuid="_-gaiQPZ3EeipuOADhlr5og">
    <states xmi:type="PseudoState" xmi:id="_QwIbAPZ4EeipuOADhlr5og" id="Entry State Pointer" type="entry"/>
    <states xmi:type="State" xmi:id="_dyQNgPZ4EeipuOADhlr5og" id="Look for Targets" onEnter="" uuid="_dyVGAPZ4EeipuOADhlr5og"/>
    <states xmi:type="State" xmi:id="_k38d0PZ4EeipuOADhlr5og" id="Attack the Target" onEnter="agent.selectTarget();" uuid="_k38d0fZ4EeipuOADhlr5og" onEnterImports=""/>
    <states xmi:type="State" xmi:id="_zkgbQPasEeipuOADhlr5og" id="look for a new target" uuid="_zkhpYPasEeipuOADhlr5og"/>
    <transitions xmi:type="Transition" xmi:id="_iDARAPZ4EeipuOADhlr5og" from="_QwIbAPZ4EeipuOADhlr5og" to="_dyQNgPZ4EeipuOADhlr5og" id="Transition 1" uuid="_iDARAfZ4EeipuOADhlr5og"/>
    <transitions xmi:type="Transition" xmi:id="_uNkJYPZ4EeipuOADhlr5og" from="_dyQNgPZ4EeipuOADhlr5og" to="_k38d0PZ4EeipuOADhlr5og" triggerType="timed" messageCheckerClass="Object" id="Attack" triggerTimedCode="agent.getDelay()" uuid="_uNkJYfZ4EeipuOADhlr5og"/>
    <transitions xmi:type="Transition" xmi:id="_3lXooPasEeipuOADhlr5og" from="_k38d0PZ4EeipuOADhlr5og" to="_zkgbQPasEeipuOADhlr5og" triggerType="timed" messageCheckerClass="Object" id="Transition 39" triggerTimedCode="agent.getDelay();" uuid="_3lXoofasEeipuOADhlr5og"/>
    <transitions xmi:type="Transition" xmi:id="_4S6EEPasEeipuOADhlr5og" from="_zkgbQPasEeipuOADhlr5og" to="_dyQNgPZ4EeipuOADhlr5og" triggerType="timed" messageCheckerClass="Object" id="Transition 40" triggerTimedCode="agent.getDelay();" uuid="_4S6rIPasEeipuOADhlr5og"/>
  </StateMachine>
  <notation:Diagram xmi:id="_-gieEPZ3EeipuOADhlr5og" type="Statechart" element="_-gbJUPZ3EeipuOADhlr5og" name="threatstatechart.rsc" measurementUnit="Pixel">
    <children xmi:type="notation:Shape" xmi:id="_QwUoQPZ4EeipuOADhlr5og" type="2007" element="_QwIbAPZ4EeipuOADhlr5og" fontName=".AppleSystemUIFont">
      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_QwUoQfZ4EeipuOADhlr5og" x="136" y="121"/>
    </children>
    <children xmi:type="notation:Shape" xmi:id="_dyW7MPZ4EeipuOADhlr5og" type="2003" element="_dyQNgPZ4EeipuOADhlr5og" fontName=".AppleSystemUIFont">
      <children xmi:type="notation:DecorationNode" xmi:id="_dyW7MvZ4EeipuOADhlr5og" type="5001"/>
      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_dyW7MfZ4EeipuOADhlr5og" x="104" y="216"/>
    </children>
    <children xmi:type="notation:Shape" xmi:id="_k39E4PZ4EeipuOADhlr5og" type="2003" element="_k38d0PZ4EeipuOADhlr5og" fontName=".AppleSystemUIFont">
      <children xmi:type="notation:DecorationNode" xmi:id="_k39E4vZ4EeipuOADhlr5og" type="5001"/>
      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_k39E4fZ4EeipuOADhlr5og" x="300" y="216"/>
    </children>
    <children xmi:type="notation:Shape" xmi:id="_zkiQcPasEeipuOADhlr5og" type="2003" element="_zkgbQPasEeipuOADhlr5og" fontName=".AppleSystemUIFont">
      <children xmi:type="notation:DecorationNode" xmi:id="_zkiQcvasEeipuOADhlr5og" type="5001"/>
      <layoutConstraint xmi:type="notation:Bounds" xmi:id="_zkiQcfasEeipuOADhlr5og" x="187" y="312"/>
    </children>
    <styles xmi:type="notation:DiagramStyle" xmi:id="_-gieEfZ3EeipuOADhlr5og"/>
    <edges xmi:type="notation:Edge" xmi:id="_iDDUUPZ4EeipuOADhlr5og" type="4001" element="_iDARAPZ4EeipuOADhlr5og" source="_QwUoQPZ4EeipuOADhlr5og" target="_dyW7MPZ4EeipuOADhlr5og">
      <styles xmi:type="notation:RoutingStyle" xmi:id="_iDD7YPZ4EeipuOADhlr5og"/>
      <styles xmi:type="notation:FontStyle" xmi:id="_iDD7YfZ4EeipuOADhlr5og" fontName=".AppleSystemUIFont"/>
      <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_iDD7YvZ4EeipuOADhlr5og" points="[0, 0, -1, -85]$[1, 85, 0, 0]"/>
      <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_iDFwkPZ4EeipuOADhlr5og" id="CENTER"/>
      <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_iDGXoPZ4EeipuOADhlr5og" id="(0.5119047619047619,0.0)"/>
    </edges>
    <edges xmi:type="notation:Edge" xmi:id="_uNlXgPZ4EeipuOADhlr5og" type="4001" element="_uNkJYPZ4EeipuOADhlr5og" source="_dyW7MPZ4EeipuOADhlr5og" target="_k39E4PZ4EeipuOADhlr5og">
      <styles xmi:type="notation:RoutingStyle" xmi:id="_uNlXgfZ4EeipuOADhlr5og"/>
      <styles xmi:type="notation:FontStyle" xmi:id="_uNlXgvZ4EeipuOADhlr5og" fontName=".AppleSystemUIFont"/>
      <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_uNlXg_Z4EeipuOADhlr5og" points="[0, -4, -112, 0]$[112, -4, 0, 0]"/>
      <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_uNmloPZ4EeipuOADhlr5og" id="(1.0,0.55)"/>
      <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_uNmlofZ4EeipuOADhlr5og" id="(0.0,0.45)"/>
    </edges>
    <edges xmi:type="notation:Edge" xmi:id="_3lXoovasEeipuOADhlr5og" type="4001" element="_3lXooPasEeipuOADhlr5og" source="_k39E4PZ4EeipuOADhlr5og" target="_zkiQcPasEeipuOADhlr5og">
      <styles xmi:type="notation:RoutingStyle" xmi:id="_3lXoo_asEeipuOADhlr5og"/>
      <styles xmi:type="notation:FontStyle" xmi:id="_3lXopPasEeipuOADhlr5og" fontName=".AppleSystemUIFont"/>
      <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_3lXopfasEeipuOADhlr5og" points="[0, 0, 82, -61]$[-73, 57, 9, -4]"/>
      <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_3lY2wPasEeipuOADhlr5og" id="(0.7272727272727273,1.0)"/>
      <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_3lY2wfasEeipuOADhlr5og" id="(0.9134615384615384,0.125)"/>
    </edges>
    <edges xmi:type="notation:Edge" xmi:id="_4S6rIfasEeipuOADhlr5og" type="4001" element="_4S6EEPasEeipuOADhlr5og" source="_zkiQcPasEeipuOADhlr5og" target="_dyW7MPZ4EeipuOADhlr5og">
      <styles xmi:type="notation:RoutingStyle" xmi:id="_4S6rIvasEeipuOADhlr5og"/>
      <styles xmi:type="notation:FontStyle" xmi:id="_4S6rI_asEeipuOADhlr5og" fontName=".AppleSystemUIFont"/>
      <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="_4S6rJPasEeipuOADhlr5og" points="[0, 0, 82, 59]$[-81, -56, 1, 3]"/>
      <sourceAnchor xmi:type="notation:IdentityAnchor" xmi:id="_4S7SMPasEeipuOADhlr5og" id="(0.125,0.075)"/>
      <targetAnchor xmi:type="notation:IdentityAnchor" xmi:id="_4S75QPasEeipuOADhlr5og" id="(0.5714285714285714,0.925)"/>
    </edges>
  </notation:Diagram>
</xmi:XMI>
