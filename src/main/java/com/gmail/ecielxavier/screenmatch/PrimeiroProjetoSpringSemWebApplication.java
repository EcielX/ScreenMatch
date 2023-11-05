package com.gmail.ecielxavier.screenmatch;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import com.gmail.ecielxavier.screenmatch.Model.DadosSerie;
import com.gmail.ecielxavier.screenmatch.Service.ConsumoApi;
import com.gmail.ecielxavier.screenmatch.Service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeiroProjetoSpringSemWebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringSemWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi  = new ConsumoApi();
		var json  = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=b7000c6");
		System.out.println(json);

		ConverteDados converso = new ConverteDados();
		DadosSerie dados = converso.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
