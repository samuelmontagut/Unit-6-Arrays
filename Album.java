
public class Album {
	
	String name;
	String artist;
	int numberOfSongs;
	double playTime;
	
	public Album(String n, String a, int songs, double t) {
		name = n;
		artist = a;
		numberOfSongs = songs;
		playTime = t;
	}
	
	public String getName() {
		return name;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	
	public double getPlayTime() {
		return playTime;
	}

}
