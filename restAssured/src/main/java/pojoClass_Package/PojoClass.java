package pojoClass_Package;

public class PojoClass {
	
	
	private String createdBy;
	private String projectName;
	private String status;
    private	float teamSize;
	
	public PojoClass(String createdBy, String projectName, String status, float teamSize) {
		
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
		
	}
	
	
	
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the teamSize
	 */
	public float getTeamSize() {
		return teamSize;
	}
	/**
	 * @param teamSize the teamSize to set
	 */
	public void setTeamSize(float teamSize) {
		this.teamSize = teamSize;
	}
	
	

}
