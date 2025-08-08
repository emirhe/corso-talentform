package com.corso.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Negozio {

	@GetMapping("/api/negozio")
	public List<NegozioModel> getProductos() {
		return Arrays.asList(
				new NegozioModel(1, "camisa", Arrays.asList("algodón", "manga larga", "cuello clásico"), 49.99, 30,
						"Zara"),
				new NegozioModel(2, "pantalones", Arrays.asList("denim", "slim fit", "talle medio"), 59.99, 25,
						"Levi's"),
				new NegozioModel(3, "t-shirt", Arrays.asList("algodón", "manga corta", "estampado minimal"), 19.99, 50,
						"H&M"),
				new NegozioModel(4, "zapatillas", Arrays.asList("lona", "suela de goma", "cordones"), 74.99, 15,
						"Nike"),
				new NegozioModel(5, "chaqueta", Arrays.asList("cuero sintético", "corte biker", "forro interior"),
						99.99, 10, "Adidas"),
				new NegozioModel(6, "falda", Arrays.asList("gasa", "plisada", "cintura alta"), 39.99, 20, "Mango"),
				new NegozioModel(7, "vestido", Arrays.asList("lino", "sin mangas", "largo midi"), 54.99, 18, "Zara"),
				new NegozioModel(8, "sudadera", Arrays.asList("algodón orgánico", "capucha", "bolsillo canguro"), 45.00,
						22, "Puma"),
				new NegozioModel(9, "jeans", Arrays.asList("denim", "straight fit", "talle alto"), 65.00, 28, "Levi's"),
				new NegozioModel(10, "sandalias", Arrays.asList("cuero", "tira ajustable", "suela antideslizante"),
						29.99, 35, "Birkenstock"),
				new NegozioModel(11, "bolso", Arrays.asList("piel sintética", "asa larga", "cierres metálicos"), 69.99,
						12, "Guess"),
				new NegozioModel(12, "gorro", Arrays.asList("lana", "tejido a mano", "unisex"), 24.99, 40, "H&M"),
				new NegozioModel(13, "bufanda", Arrays.asList("cachemira", "tejido fino", "tamaño grande"), 34.99, 30,
						"Gucci"),
				new NegozioModel(14, "calcetines", Arrays.asList("algodón", "puño elástico", "paquete de 3"), 12.99, 60,
						"Adidas"),
				new NegozioModel(15, "cinturón", Arrays.asList("cuero", "hebilla metálica", "ajustable"), 27.50, 25,
						"Calvin Klein"));

	}
}
