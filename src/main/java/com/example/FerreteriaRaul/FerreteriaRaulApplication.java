package com.example.FerreteriaRaul;

import com.example.FerreteriaRaul.modelos.Inventario;
import com.example.FerreteriaRaul.modelos.Producto;
import com.example.FerreteriaRaul.repositorios.IinventarioRepositorio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import reactor.core.publisher.Flux;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

@SpringBootApplication
public class FerreteriaRaulApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(FerreteriaRaulApplication.class);

	@Autowired
	private IinventarioRepositorio repositorioInventario;

	public static void main(String[] args) {
		SpringApplication.run(FerreteriaRaulApplication.class, args);
	}

	public void flux() {
		/*repositorioInventario.findById("30")
				.flatMap(p -> {
					p.setCantidad(p.getCantidad() + 2);
					return repositorioInventario.save(p);
				})
				.subscribe(e -> log.info(e.toString()));

		 */
		/*
		Producto producto = new Producto("20","pintura",10000);

		Predicate<Inventario> predicado = new Predicate<Inventario>() {
			@Override
			public boolean test(Inventario t) {

				return t.getProducto().getNombreProducto().equals("pintura");
			}
		};

		repositorioInventario.findAll()
				.filter(predicado)
				.flatMap(p -> {
					p.setCantidad(p.getCantidad()+2);
					return repositorioInventario.save(p);
				})
				.subscribe(e -> log.info(e.toString()));
		*/

	}
		/*
		repositorioInventario.findAll()
				.filter(e ->e.getProducto().getNombreProducto().equals("pintura"))
				.map(p -> {
					p.setIdInventario(p.getIdInventario());
					p.setProducto(p.getProducto());
					p.setCantidad(p.getCantidad()+2);
					p.setProveedor(p.getProveedor());

					//repositorioInventario.save(p);
					return p;
				})
				.collectMap(p -> {
					return repositorioInventario.save(p);
				})
				.subscribe(e -> log.info(e.toString()));
*/

	@Override
	public void run(String... args) throws Exception {
		//flux();

	}
}
