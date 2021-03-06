package com.stefanini.heroi.util;

import java.util.ArrayList;
import java.util.List;

import com.stefanini.heroi.dto.HeroisDto;
import com.stefanini.heroi.dto.PoderesDto;

public class BancoMemoriaUtil {
	
	public static List<PoderesDto> poderesDtos;
	
	public static List<HeroisDto> heroisDtos;
	
	
	public static BancoMemoriaUtil getInstance(){
		return new BancoMemoriaUtil();
	}
	
	/**
	 * Método que grava poderes
	 * @param poderesDto
	 * @return
	 */
	public List<PoderesDto> gravaPoderes(PoderesDto poderesDto){
		if(poderesDtos == null)
			poderesDtos = new ArrayList<PoderesDto>();
		
		poderesDtos.add(poderesDto);
		
		return poderesDtos;
	}
	
	/**
	 * Método que grava herois
	 * @param poderesDto
	 * @return
	 */
	public List<HeroisDto> gravaHerois(HeroisDto heroisDto){
		if(heroisDtos == null)
			heroisDtos = new ArrayList<HeroisDto>();
		
		heroisDtos.add(heroisDto);
		
		return heroisDtos;
	}
	
}