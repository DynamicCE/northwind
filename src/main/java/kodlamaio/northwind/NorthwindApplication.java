package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}

}
//*Spring initilazr'dan kullanacağımız paketleri koyduk
//*entity katmanında, dedik ki benim tablolarım var postqre'de , product class'ını products * *tablosu ile eşleştirdik,  fieldları kolonlarla eşleştirdik
//*dataAccess'e gittik, productDao'da,  JpaRepository<Product ,Integer> ' i extend ettik (jpa'nın hibernate implementasyonu, concretes'a bir şey yazmaya gerek yok)
//*Business'a gittik, service'ın operasyonlarını yaptık.
//*Business concretes'da dependency injection için @Autowired kullanıyoruz, newlemeye gerek kalmıyor?
//*Controller'da @RestController anotasyonu girdik böylese android de ios'da senle çalışabilir, yani restfulsun dedik.
//*@RequestMapping("/api/products") domainin sonuna bu gelirse sen karşıla diyoruz class'a
//*Aynı şeyi servise de yaptık, @GetMapping("getall") dendiği zaman productService'ın getall metodu çalışsın dedik.