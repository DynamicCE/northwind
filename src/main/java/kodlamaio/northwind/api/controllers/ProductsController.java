package kodlamaio.northwind.api.controllers;


import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // sen bir controller'sın
@RequestMapping("/api/products") // kodlamaio/api/controllers'dan istek gelirse bu controller çalışacak
public
class ProductsController { // dış dünyanın sistemimizle iletişim kurduğu yer controller

    @Autowired // springde injection yaparken Autowired kullanırız ve newlememize gerek kalamz. constructor otomatik oluşur.
    private ProductService productService;

    public
    ProductsController ( ProductService productService ) {
        this.productService = productService;
    }
    @GetMapping("/getall") // veri istendiği zaman bu isteklere getRequest denir, bu yüzden @GetMapping
    //kodlama.io/api/getall isteği gelirse bu çalışacak
    public
    List<Product> getAll(){
        return this.productService.getAll ();
    }
}

// frontend'den backende şu veriyi getir ya da değiştir istekleri gelebiliyor, bunlar HTTP request
//kodlama.io/api/controllers