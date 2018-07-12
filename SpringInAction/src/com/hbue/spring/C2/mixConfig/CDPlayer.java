package com.hbue.spring.C2.mixConfig;

public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	@Override
	public void play() {
		cd.play();
	}

}
