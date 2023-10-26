package ds2021;

public class VetementEnfant extends Vetement {
	private float age;
	
	public VetementEnfant(String lib, float pht, String code, String c) {
		super(lib, pht, code, c);
		
	}
	void setAge(float age) {
		this.age=age;
	}
	@Override
	public String toString() {
		return (super.toString()+" et age: "+this.age);
	}
	@Override
	public float prixTTC(int remise) {
		if (remise<50) {
			return super.prixTTC(remise);
			}
			else 
				return super.prixTTC();
		}
	}

	

