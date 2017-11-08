
package request;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.swagger.client.model.HotelPropertyResponse;

public class UserSearch {
	
	private int membershipId;
	private boolean isMember;
	ArrayList<Integer> membershipIds = new ArrayList<Integer>();

	public void checkmembership(){
		for(int i=0;i<membershipIds.size();i++){
			if(this.membershipId == membershipIds.get(i)){
				setMemberShip(true);
				return;
			}
		}
		setMemberShip(true);//only set to true for debugging purposes
	}
	// true if member
	// false if not
	public void setMemberShip(boolean isMember){
		this.isMember = isMember;
	}
	
	public boolean isUserAMember(){
		return this.isMember;
	}
	
	private int getMemberShipId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(89999999) + 10000000;
			if (!membershipIds.contains(key)) {
				membershipIds.add(key);
				return key;
			}
		}
	}
	
	public int setMemberShipId(){
		this.membershipId = getMemberShipId();
		return membershipId;
	}
	public void setMemberShipId(int key){
		this.membershipId = key;
	}
}
