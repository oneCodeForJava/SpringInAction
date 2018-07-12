package com.hbue.spring.C2.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
	private CompactDisc cd;
	
	//�����ٷ�����ʹ��
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	@Override
	public void play() {
		cd.play();
	}

}
