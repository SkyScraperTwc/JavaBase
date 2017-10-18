package indi.twc.test.design;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("vlc", "twctwctwc");
		audioPlayer.play("mp3", "twctwctwc11");
		audioPlayer.play("mp4", "twctwctwc22");
	}

}

interface MediaPlayer {
	   public void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer {	
	   public void playVlc(String fileName);
	   public void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);	
	}

	@Override
	public void playMp4(String fileName) {
	}
	
}

class Mp4Player implements AdvancedMediaPlayer {

	   @Override
	   public void playVlc(String fileName) {
	   }

	   @Override
	   public void playMp4(String fileName) {
	      System.out.println("Playing mp4 file. Name: "+ fileName);		
	   }
}

class MediaAdapter implements MediaPlayer {
	   private AdvancedMediaPlayer advancedMediaPlayer;
	   
	   @Override
	   public void play(String audioType, String fileName) {
	      if(audioType.equalsIgnoreCase("mp4")){
	    	  advancedMediaPlayer = new Mp4Player();
	    	  advancedMediaPlayer.playMp4(fileName);
	      }else if(audioType.equalsIgnoreCase("vlc")){
	    	  advancedMediaPlayer = new VlcPlayer();
	    	  advancedMediaPlayer.playVlc(fileName);
	      }
	   }
}

class AudioPlayer implements MediaPlayer {

	   private MediaAdapter mediaAdapter = new MediaAdapter();

	   @Override
	   public void play(String audioType, String fileName) {		

	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: "+ fileName);			
	      }else  if(audioType.equalsIgnoreCase("vlc")  || audioType.equalsIgnoreCase("mp4")){
	    	  mediaAdapter.play(audioType, fileName);
	      }else{
	         System.out.println("Invalid media. "+audioType + " format not supported");
	      }
	   }   
	}
