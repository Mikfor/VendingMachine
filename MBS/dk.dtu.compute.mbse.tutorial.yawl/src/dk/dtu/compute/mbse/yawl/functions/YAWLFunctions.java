package dk.dtu.compute.mbse.yawl.functions;

import java.util.concurrent.locks.Condition;

import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import dk.dtu.compute.mbse.yawl.AType;
import dk.dtu.compute.mbse.yawl.ArcType;
import dk.dtu.compute.mbse.yawl.PType;
import dk.dtu.compute.mbse.yawl.Place;


public class YAWLFunctions {
	
	public static PType getType(Place place){
		
		if (place instanceof Condition) {
			
			Condition condition = (Condition) place;
			ConditionType type = condition.getType();
			if (type != null) {
				return type.getText();	
			}
			
		}else {
			return PType.NORMAL;
			
		}
		
		
		
	}
	
	public static AType getType(Arc arc){
		
		if (arc.getSource() instanceof TransitionNode) {
			return AType.NORMAL;
		}
		
		if (arc instanceof dk.dtu.compute.mbse.yawl.Arc){
			dk.dtu.compute.mbse.yawl.Arc a = (dk.dtu.compute.mbse.yawl.Arc) arc;
			ArcType type = a.getType();
			if (type != null){
				return type.getText();
				
				
			}
			
			
		}
		
		return AType.NORMAL;
		
		
	}
	
	

}
