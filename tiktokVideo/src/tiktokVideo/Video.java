package tiktokVideo;

public class Video {

	public int video_id;
	public String title;
	public String decription;
	public String time;

	public Video() {
	}

	public Video(int video_id, String title, String decription, String time) {
		this.video_id = video_id;
		this.title = title;
		this.decription = decription;
		this.time = time;
	}

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Video [video_id=" + video_id + ", title=" + title + ", decription=" + decription + ", time=" + time
				+ "]";
	}
}
