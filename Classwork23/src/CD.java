
public class CD {
	private String artist;
	private int numberOftracks;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOftracks() {
		return numberOftracks;
	}

	public void setNumberOftracks(int numberOftracks) {
		this.numberOftracks = numberOftracks;
	}

	public void print() {
		System.out.println(getArtist());
	}
}



