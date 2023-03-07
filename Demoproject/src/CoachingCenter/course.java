package CoachingCenter;

public class course {
	public String CourseName;
	public int Duration;
	public int fee;
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "course [CourseName=" + CourseName + ", Duration=" + Duration + ", fee=" + fee + "]";
	}
	

}
