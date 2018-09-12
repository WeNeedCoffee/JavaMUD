package coffee.weneed.mud.data;

import org.json.JSONObject;
/**
 *
 * @author Dalethium
 *
 */
public class Item implements IItem {

	/**
	 * The base item name
	 */
	private String name;
	
	/**
	 * The ItemType
	 */
	private EItemType type;
	
	/**
	 * The density of the item
	 * Used to determin mass
	 */
	private float density;
	
	/**
	 * The volume of the item
	 * Used to determin mass
	 */
	private float volume;
	
	/**
	 * The initial durability
	 */
	private int durability;
	
	/**
	 * The rate at which the volume of this item decreases for each durability point lost
	 * <br>Example:<pre>
	 * 	Durability = 250, volume = 10, Rate = 1;<br>
	 * 	Increment = Volume / (Durability / Rate) = 0.04;<br>
	 * 	Durability -= 30;<br>
	 * 	Volume = Volume - (Durability * Increment) = 8.8;<br></pre>
	 */
	private double durability_volume_reduction_rate;
	
	private long timelimit;
	
	@Override
	public void fromJSON(JSONObject arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JSONObject toJSON() {
		// TODO Auto-generated method stub
		return null;
	}

}
