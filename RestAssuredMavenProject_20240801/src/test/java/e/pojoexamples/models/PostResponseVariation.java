package e.pojoexamples.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonIgnoreProperties({"keyv"})
public class PostResponseVariation {
		
 
		private String id;
	    private String title;
	    
	    @JsonProperty(value="body")
	    private String postBody;
	    
	    private String userId; // assumption: this is mandatory field expected in the response
//	    @JsonIgnore
	    private String keyv; // assumption: this is optional field, which may or may not come in the response

	    // Getters and Setters
	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getPostBody() {
	        return postBody;
	    }

	    public void setPostBody(String body) {
	        this.postBody = body;
	    }

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	    
//	    public String getKeyv() {
//			return keyv;
//		}
//
//		public void setKeyv(String keyv) {
//			this.keyv = keyv;
//		}

}
