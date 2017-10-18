import java.time.LocalDateTime;


import java.applet.*;
import java.net.MalformedURLException;
import java.net.URL;



public class GrandfatherClock {
	
	
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	
	LocalDateTime now = LocalDateTime.now();

	
	int hour = now.getHour();
	
	int minute = now.getMinute();
	
	AudioClip clip = null;
	
	URL path = GrandfatherClock.class.getProtectionDomain().getCodeSource().getLocation();
	System.out.println(path);

	clip = Applet.newAudioClip(new URL(path + "EpicSaxGuy.wav"));

	AudioClip ending = null;
	ending = Applet.newAudioClip(new URL(path + "EpicSaxGuyEnding.wav"));
	
	
	if(hour > 12){
		hour = hour - 12;
	}
	
	if (minute == 0){
		
		for(int x = 0; x <hour; x++){
			System.out.println(x);
			if(hour == 1){
				
				ending.play();
				Thread.sleep(7340);
				
			}
			else{
				if(x == (hour-1)){
					
					ending.play();
					Thread.sleep(7340);
				}
				else{
				
					clip.play();
					Thread.sleep(7340);
					
				}
			}
		}
	}
			
			
		
		
	}
			 
}
	

