package com.stefanini.heroi.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.heroi.dao.HeroisDAO;
import com.stefanini.heroi.dto.HeroisDto;
import com.stefanini.heroi.dto.PoderesDto;
import com.stefanini.heroi.util.BancoMemoriaUtil;

/**
 * Classe adicionar face
 * @author c1297467
 *
 */

@RestController
@RequestMapping(value="/cadastro-heroi")
public class HeroisController {

	@RequestMapping(method=RequestMethod.POST, value="/cadastra-poderes", consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<PoderesDto> cadastraPoderes(@RequestBody PoderesDto poderesDto) {
		return BancoMemoriaUtil.getInstance().gravaPoderes(poderesDto);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cadastra-herois", consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<HeroisDto> cadastraHerois(@RequestBody HeroisDto heroisDto) {
		HeroisDAO heroisDAO = new HeroisDAO();
		return heroisDAO.cadastraHerois(heroisDto);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/randomico")
	public List<HeroisDto> randomico() {
		HeroisDAO heroisDAO = new HeroisDAO();
		return heroisDAO.poderesRandomicos(BancoMemoriaUtil.heroisDtos);
	}

	
}