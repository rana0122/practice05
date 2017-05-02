package prob2;

public class SmartPhone extends MusicPhone {
	public void execute( String function ) {
		if ( function.equals("음악") ) {
			playMusic();
			return;
		}else if(function.equals("통화")){
			super.execute( function );
			return;
		}else if(function.equals("앱")){
			playApp();
			return;
		}else System.out.println("입력값이 잘못 되었습니다. 확인해주세요.");
	}

	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	private void playApp(){
		System.out.println("앱실행");
	}

}
