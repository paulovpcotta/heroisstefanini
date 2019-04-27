package com.stefanini.heroi.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.heroi.dao.HeroisDAO;
import com.stefanini.heroi.util.BancoMemoriaUtil;

import br.com.bb.big.face.azure.dto.HeroisDto;
import br.com.bb.big.face.azure.dto.PoderesDto;

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
//	
//	@RequestMapping(method=RequestMethod.POST, value="/add-face-detect", consumes=MediaType.APPLICATION_JSON_VALUE)
//	public List<DetectDto> adicionaFaceGroupDetect(@RequestBody AddFaceDto addFaceDto) throws ClientProtocolException, IOException, URISyntaxException, NoSuchAlgorithmException {
//		return AddFaceLargeGroupSDK.getInstancia().sendImageDetect(addFaceDto.getNameGroup(), addFaceDto.getKey(), addFaceDto.getBody(),
//				addFaceDto.getTypeImage(), addFaceDto);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST, value="/add-face-identify", consumes=MediaType.APPLICATION_JSON_VALUE)
//	public String adicionaFaceGroupIdentify(@RequestBody IdentifyDto identifyDto) throws ClientProtocolException, IOException, URISyntaxException, NoSuchAlgorithmException {
//		return AddFaceLargeGroupSDK.getInstancia().sendImageIdentify(identifyDto);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST, value="/add-face-verify", consumes=MediaType.APPLICATION_JSON_VALUE)
//	public String adicionaFaceGroupVerify(@RequestBody VerifyDto verifyDto) throws ClientProtocolException, IOException, URISyntaxException, NoSuchAlgorithmException {
//		return AddFaceLargeGroupSDK.getInstancia().sendImageVerify(verifyDto);
//	}
	
}