package domain;

public class Region {

	private int regionId;
	private String regionDescription;

	public int getRegionId() {
		return regionId;
	}
	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	public String getRegionDescription() {
		return regionDescription;
	}
	public void setRegionDescription(String regionDescription) {
		this.regionDescription = regionDescription;
	}
	public Region(int regionId, String regionDescription) {
		super();
		this.regionId = regionId;
		this.regionDescription = regionDescription;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Region [getRegionId()=");
		builder.append(getRegionId());
		builder.append(", getRegionDescription()=");
		builder.append(getRegionDescription());
		builder.append("]");
		return builder.toString();
	}


}
