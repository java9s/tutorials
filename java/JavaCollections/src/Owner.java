import java.util.Random;

public class Owner {
	private String ownerName;
	
	public Owner(String name){
		ownerName = name;
	}
	
	public Owner(){
		final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
	    final int N = alphabet.length();

	    Random r = new Random();
	    StringBuffer name = new StringBuffer();
	    for (int i = 0; i <6; i++) {
	        name.append(alphabet.charAt(r.nextInt(N)));
	    }
	    ownerName = name.toString();
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public String toString(){
		return this.ownerName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Owner){
			Owner owner2 = (Owner)obj;
			if(owner2.getOwnerName() != null && owner2.equals(this.getOwnerName())){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getOwnerName().hashCode();
	}
}
