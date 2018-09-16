public class BStats {
/* prompt player to enter name */
/* inputs: AB (at bats), H (hits), 2B (doubles) 3B (triples), HR (home runs), R (runs), BB (walks)  */
/* outputs: BA (batting average), OBP (on base percentage), SLG (slugging percentage), OPS (on base + slugging percentage), TB (total bases) */
	
	private String PlayerName;
	private int AB;
	private int H;
	private int HR;
	private int R;
	private int BB;
	private int TwoB;
	private int ThreeB;
	
	public BStats(int aB, int h, int hR, int r, int bB, int oneB, int twoB, int threeB) {
		super();
		AB = aB;
		H = h;
		HR = hR;
		R = r;
		BB = bB;
		this.TwoB = twoB;
		this.ThreeB = threeB;
	}
	
	// setters and getters for all inputs
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	
	public int getAtBats() {
		return AB;
	}
	public void setAtBats(int aB) {
		AB = aB;
	}
	
	public int getHits() {
		return H;
	}
	public void setHits(int h) {
		H = h;
	}
	
	public int getHomeRuns() {
		return HR;
	}
	public void setHomeRuns(int hR) {
		HR = hR;
	}
	
	public int getRuns () {
		return R;
	}
	public void setRuns (int r) {
		R = r;
	}
	
	public int getWalks () {
		return BB;
	}
	public void setWalks (int bB) {
		BB = bB;
	}
		
	public int getDoubles () {
		return TwoB;
	}
	public void setDoubles (int twoB) {
		this.TwoB = twoB;
	}
	
	public int getTriples () {
		return ThreeB;
	}
	public void setTriples (int threeB) {
		this.ThreeB = threeB;
	}
	
	//calculate Batting Average
	double BA = H/AB;
	//calculate On Base Percentage
	double OBP = (H + BB)/(AB + BB);
	//calculate Slugging Percentage
	int OneB = H - (TwoB + ThreeB + HR);
	double SLG = (OneB + TwoB + ThreeB + HR)/AB;
	//calculate On Base + Slugging Percentage
	double OPS = OBP + SLG;
	//calculate Total Bases
	double TB = OneB + (TwoB * 2) + (ThreeB * 3) + (HR * 4);
	
	public void printBStats () {
		System.out.println(PlayerName + " stats: ");
		System.out.println("Batting Average: " + BA);
		System.out.println("On Base Percentage: " + OBP);
		System.out.println("Slugging Percentage: " + SLG);
		System.out.println("On Base Percentage and Slugging Percentage: " + OPS);
		System.out.println("Total Bases: " + TB);
	}
	
}

