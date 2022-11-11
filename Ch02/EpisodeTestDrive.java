class Episode{
	int serialNumber;
	int episodeNumber;

	void skipIntro(){
		System.out.println("Skipping intro ...");
	}

	void play(){
		System.out.println("Playing ...");
	}
	void skipToNext(){
		System.out.println("Loading next episode...");
	}
}

public class EpisodeTestDrive{
	public static void main(String[] args){

		Episode episode = new Episode();
		episode.serialNumber = 4;
		episode.play();
		episode.skipIntro();

	}
}