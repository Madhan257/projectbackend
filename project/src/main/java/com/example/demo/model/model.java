package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MUSIC")
public class model 
{
	@Id
	private int artistid;
	private String artistname;
	private String song;
	private String releasedate;
	public int getArtistid() {
		return artistid;
	}
	public void setArtistid(int artistid) {
		this.artistid = artistid;
	}
	public String getArtistname() {
		return artistname;
	}
	public void setArtistname(String artistname) {
		this.artistname = artistname;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	
	public model(int artistid, String artistname, String song, String releasedate) {
		super();
		this.artistid = artistid;
		this.artistname = artistname;
		this.song = song;
		this.releasedate = releasedate;
	}
	public model()
	{
		
	}
	public String toString()
	{
		return "artist_id="+artistid+"artist_name="+artistname+"song="+song+"release_date="+releasedate;
	}
}