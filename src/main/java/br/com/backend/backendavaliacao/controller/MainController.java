package br.com.backend.backendavaliacao.controller;

import br.com.backend.backendavaliacao.message.Response;
import br.com.backend.backendavaliacao.modelo.Agente;
import br.com.backend.backendavaliacao.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.net.URISyntaxException;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@AllArgsConstructor
@RestController
@RequestMapping
public class MainController {

	private FileService fileReaderService;
	
	@PostMapping("/upload")
	public ResponseEntity<Response> upload(@RequestParam("file") MultipartFile file) throws URISyntaxException {

		String message = "";
		try {
			message = "Upload com sucesso do arquivo " + file.getOriginalFilename();
			fileReaderService.execute(file.getInputStream());
			return ResponseEntity.status(HttpStatus.OK).body(new Response(message));
		}catch (Exception e){
			message = "Ocorreu um erro no uploado do arquivo " + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Response(message));
		}
	}

	@GetMapping("/find/{regiao}")
	public ResponseEntity<List<Agente>> findAggregationAgente(@PathVariable String regiao){
		List<Agente>  agentes = fileReaderService.findAggregationAgente(regiao);
		return ResponseEntity.status(HttpStatus.OK).body(agentes);
	}

}
