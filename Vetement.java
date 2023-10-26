package ds2021;

public class Vetement {
	//String Format("%3f","pht");
	protected String code;
	protected String lib;
	protected String couleur;
	protected float pht;
	protected int qtStock;
	
	protected static final float tva=18;
	public Vetement (String lib, float pht, String code, String c) {
		this.lib=lib;
		this.pht=pht;
		this.code=code;
		this.couleur=c;
	}
	public int getQtStock() {
		return this.qtStock;
	}
	public void setQtStock(int stock) {
		this.qtStock=stock;
	}
	@Override 
	public String toString() {
		return(this.code+" "+this.lib+" "+this.couleur+" : prixHT="+String.format("%.3f", pht)+" DT et qte="+this.qtStock);
	}
	public float prixTTC() {
		return pht*(1+tva/100);
	}
	public float prixTTC(int remise) {
		return prixTTC()*(1-remise/100);
	}

	
}
