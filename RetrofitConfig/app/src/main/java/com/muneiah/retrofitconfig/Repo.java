package com.muneiah.retrofitconfig;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class Repo implements Serializable {

	@SerializedName("albumId")
	private int albumId;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("thumbnailUrl")
	private String thumbnailUrl;

	public void setAlbumId(int albumId){
		this.albumId = albumId;
	}

	public int getAlbumId(){
		return albumId;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getThumbnailUrl(){
		return thumbnailUrl;
	}

	@Override
 	public String toString(){
		return 
			"Repo{" + 
			"albumId = '" + albumId + '\'' + 
			",id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			",thumbnailUrl = '" + thumbnailUrl + '\'' + 
			"}";
		}
}