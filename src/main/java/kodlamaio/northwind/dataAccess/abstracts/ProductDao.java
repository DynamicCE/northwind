package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface ProductDao extends JpaRepository<Product,Integer> { // JpaRepository'i extend ettik (interface interface'i extend eder)
    // hangi tabloya hangi id veri tipiyle sorguların hazırlanması gerektiğini söylüyoruz
// şu an crud operasyonları hazır, sadece JpaRepository<Product,Integer> extend ettik
}
