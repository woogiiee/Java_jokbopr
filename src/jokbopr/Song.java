package jokbopr;

public class Song {
	String title = null;
	String artist = null;
	int year = 0;
	String country = null;
	
	
	 Song(){ }
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist =artist;
		this.year = year;
		this.country = country;
	}
	void show() {
		System.out.println(year+"��"+country+"������"+artist+"�� �θ�"+title);
	}
}
