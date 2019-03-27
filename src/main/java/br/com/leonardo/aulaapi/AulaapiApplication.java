package br.com.leonardo.aulaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaapiApplication {
	
	//@Autowired
	//private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(AulaapiApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "jonathan");
		Categoria cat2 = new Categoria(null, "joseph");
		Categoria cat3 = new Categoria(null, "jotaro");
		Categoria cat4 = new Categoria(null, "josuke");
		Categoria cat5 = new Categoria(null, "giorno");
		Categoria cat6 = new Categoria(null, "jolyne");
		Categoria cat7 = new Categoria(null, "johnny");
		Categoria cat8 = new Categoria(null, "jojolion");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5,cat6,cat7,cat8));
		
	}*/

}

