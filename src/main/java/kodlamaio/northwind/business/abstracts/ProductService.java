package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

import java.util.List;





public
interface ProductService {
    List<Product> getAll();
}
