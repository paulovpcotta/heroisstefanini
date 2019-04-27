package com.stefanini.heroi.dao;

import java.util.List;

import com.stefanini.heroi.util.BancoMemoriaUtil;

import br.com.bb.big.face.azure.dto.HeroisDto;

public class HeroisDAO {

	public List<HeroisDto> cadastraHerois(HeroisDto heroisDto){
		return BancoMemoriaUtil.getInstance().gravaHerois(heroisDto);
	}
	
	public List<HeroisDto> poderesRandomicos(HeroisDto heroisDto){
		return null;
	}
	
}