package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.*;
import lombok.Data; // getter-setter ve constructor getiriyor

@Entity // spring bu classın hangi katman olduğunu soruyor (anotasyon)
//anotasyon, class veya metodun çalışma anında bilgi toplamaya yarar?
@Table(name = "products") // tablo ismini belirttik
@Data
public
class Product {
     @Id
     @GeneratedValue // id'nin nasıl artırıldığını belirtmemiz gerekiyor(muş) . bizimki bir bir artıyor , GeneratedValue
    @Column(name = "product_id")
    private int Id;

    @Column(name = "category_id")
    private int CategoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    public
    Product ( int id, int categoryId, String productName, double unitPrice, short unitsInStock, String quantityPerUnit ) {
        Id = id;
        CategoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
    }

    public
    Product () {

    }

    public
    int getId () {
        return Id;
    }

    public
    void setId ( int id ) {
        Id = id;
    }

    public
    int getCategoryId () {
        return CategoryId;
    }

    public
    void setCategoryId ( int categoryId ) {
        CategoryId = categoryId;
    }

    public
    String getProductName () {
        return productName;
    }

    public
    void setProductName ( String productName ) {
        this.productName = productName;
    }

    public
    double getUnitPrice () {
        return unitPrice;
    }

    public
    void setUnitPrice ( double unitPrice ) {
        this.unitPrice = unitPrice;
    }

    public
    short getUnitsInStock () {
        return unitsInStock;
    }

    public
    void setUnitsInStock ( short unitsInStock ) {
        this.unitsInStock = unitsInStock;
    }

    public
    String getQuantityPerUnit () {
        return quantityPerUnit;
    }

    public
    void setQuantityPerUnit ( String quantityPerUnit ) {
        this.quantityPerUnit = quantityPerUnit;
    }
}
// hangi tablo, hangi kolonlar yazdık
//tablodaki id alanını ne olduğunu söylememiz gerekiyor