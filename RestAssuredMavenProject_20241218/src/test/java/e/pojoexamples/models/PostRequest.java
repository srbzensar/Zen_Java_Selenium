package e.pojoexamples.models;

// private properties
// public methods

public class PostRequest {
	private String title;
	private String body;
	private int userId;
	
//	constructor
	public PostRequest() {}
	
//	parameterized constructor
	public PostRequest(String title, String body, int userId) {
		this.title = title;
		this.body = body;
		this.userId = userId;
	}

//	Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
