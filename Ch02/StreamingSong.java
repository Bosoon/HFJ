public class StreamingSong{
	String title;
	String artist;
	int duration;

	void play(){
		System.out.println("Playing song : " + this.title);
	}

	void printDetails(){
		System.out.println("This is " + this.title + " by " + this.artist);
	}
}
