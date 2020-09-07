public interface RemoteControl
{
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();		// public abstract 키워드가 생략됨 !(컴파일시 자동으로 붙여줌)
	void turnOff();	
	void setVolume(int volume);
	
	default void setMute(boolean mute)	// default 명시 안할 시 public으로 컴파일시 자동 명시됨 !
	{
		if(mute)
		{
			System.out.println("무음 처리합니다!");
		}
		else
		{
			System.out.println("무음 해제합니다!");
		}
	}
}
//----------------------------------------

public class RemoteControlExample {	

	public static void main(String[] args) 
	{
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		Searchable searchable = tv;
		searchable.search("http://naver.com");
	}
}
