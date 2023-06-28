package servic;

import model.Catalog;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList;

    public ProductService() {
        productList= new ArrayList<>();
    }



    public List<Product> getAll() {
        return productList;
    }







    public int getSize() {
        return productList.size();
    }

    public void save(Product themmoi) {
        if(findById(themmoi.getProductid())==null){
            // chức năng thêm mới
            productList.add(themmoi);
            System.out.println("thêm mới thành công");
        }else {
            // update
            productList.set(productList.indexOf(findById(themmoi.getProductid())),themmoi);
            System.out.println("sửa thành công");
        }
    }


    public Product findById(String id) {

        for (Product product: productList) {
            if(product.getProductid().equals(id)){
                // tìm thấy
                return product;
            }
        }
        // không tìm thấy
        return null;

    }


    public  void delete(String idDel){
        if(findById(idDel) == null){
            // không ton tại
            System.err.println("ID không tồn tại");
            return;
        }
        // cho phép xóa
        productList.remove(findById(idDel));

    }


}
