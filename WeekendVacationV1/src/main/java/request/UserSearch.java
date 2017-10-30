
package request;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.swagger.client.model.HotelPropertyResponse;

public class UserSearch {
	
	private int membershipId;
	private boolean isMember;
	
	// true if member
	// false if not
	public void setMemberShip(boolean isMember){
		this.isMember = isMember;
	}
	
	public boolean isUserAMember(){
		return this.isMember;
	}
	
	
	ArrayList<Integer> membershipIds = new ArrayList<Integer>();
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
}
