/**
 * 
 */
package cyberwarFX;

/**
 * @author johnkostoff
 * this class is the class which represents all C2 network assets 
 * defense classes inherit from it 
 * assets represent that various data systems that comprise the network
 * as well as defense systems (firewalls, IPS, etc.)
 * every asset is rated for Confidentiality, Integrity and Availability
 * all assets begin the simulation with those attributes at 100% true
 * if an attack compromises them, they set to false (0%)
 * Assets have no behaviors in the simulation apart from reporting their CIA status
 */
public class Asset {
	private boolean underAttack;
	private boolean _confidentiality;
	private boolean _integrity;
	private boolean _availability;
	private boolean _underRemediation;
	
	public Asset() {
		underAttack = false;
		_confidentiality = true;
		_integrity = true;
		_availability = true;
		set_underRemediation(false);
	}
	
//	public Asset() {
//		
//	}
	
	public boolean getUnderAttack() {
	
		return underAttack; 
	}
	
	public void setUnderAttack(boolean b) {
		underAttack = b;
	}
	
	public boolean get_confidentiality() {
		
		return _confidentiality;
	}
	
	public void set_confidentiality(boolean c) {
		
		_confidentiality = c;
	}
	
	public boolean get_integrity() {
		
		return _integrity;
	}
	
	public void set_integrity(boolean i) {
		
		_integrity = i;
	}
	
	public boolean get_availability() {
		
		return _availability;
	}
	
	public void set_availability(boolean a) {
		
		_availability = a;
	}

	public boolean get_underRemediation() {
		return _underRemediation;
	}

	public void set_underRemediation(boolean _underRemediation) {
		this._underRemediation = _underRemediation;
	}
	
}
	
