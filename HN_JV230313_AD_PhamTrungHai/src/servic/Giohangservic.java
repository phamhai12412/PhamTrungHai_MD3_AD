package servic;

import model.Catalog;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Giohangservic {

    Map<String,Integer> listgiohang;


    public Giohangservic() {
        listgiohang= new HashMap<>();
    }



    public Map<String,Integer> getAll() {
        return listgiohang;
    }



    public int getSize() {
        return listgiohang.size();
    }

    public void themspvaogiohang(Product themmoi, List<Product> listsp) {
if (listgiohang.size()==0){
    listgiohang.put(themmoi.getProductName(), 1);

    System.out.println("test list");
    System.out.println(listsp);
    for (Product p:listsp
    ) {
        System.out.println("tetp");
        System.out.println(p);
        if(p.getProductName().equals(themmoi.getProductName())){
            int value=p.getStock();
            p.setStock(value-1);

        }
    }
    return;
}
       if(listgiohang.containsKey(themmoi.getProductName())){
           listgiohang.put(themmoi.getProductName(), listgiohang.get(themmoi.getProductName())+1);

           for (Product p:listsp
           ) {
               if(p.getProductName().equals(themmoi.getProductName())){
                   p.setStock(p.getStock()-1);

               }
           }
           System.out.println("thêm vào gio hàng thành công");
        }else {
           listgiohang.put(themmoi.getProductName(), 1);

           for (Product p:listsp
           ) {
               if(p.getProductName().equals(themmoi.getProductName())){
                   p.setStock(p.getStock()-1);
                   System.out.println("dã tru");
               }
           }
        }
    }





    public  void xoatungsanphamgh(String tensp,List<Product> listsp ){
        if(listgiohang.size()==0){
            System.out.println("gio hàng trống");
            return;
        }

        if(listgiohang.containsKey(tensp)){
            if(listgiohang.get(tensp)>1){
                listgiohang.put(tensp, listgiohang.get(tensp)-1);

                for (Product p:listsp
                ) {
                    if(p.getProductName().equals(tensp)){
                        p.setStock(p.getStock()+1);
                    }
                }
            }
            if(listgiohang.get(tensp)==1){
                listgiohang.remove(tensp);

                for (Product p:listsp
                     ) {
                    if(p.getProductName().equals(tensp)){
                        p.setStock(p.getStock()+1);
                    }
                }

            }

        }else {
            // update
            System.out.println("không có sản phâmr nào trong giỏ hàng");
        }

    }

public void xoatoanbogiohang(List<Product> listsp){

if(listgiohang.size()==0){
    System.out.println("gio hàng trống");
    return;
}
        List<String> liskeygiohang= (List<String>) listgiohang.keySet();
    for (int i = 0; i <liskeygiohang.size() ; i++) {
       int value=listgiohang.get( liskeygiohang.get(i));

        for (Product p:listsp
        ) {
            if(p.getProductName().equals(liskeygiohang.get(i))){
                p.setStock(p.getStock()+value);
            }
        }
listgiohang.remove(liskeygiohang.get(i));
    }
}
public void thaydoisoluongspgh(String tensp,int soluong,List<Product> listsp){



    for (Product p:listsp
    ) {
        if(p.getProductName().equals(tensp)){
          if(p.getStock()<soluong){
              System.out.println("số lượng lớn hơn hàng hiện có");
              System.out.println("thay đổi không thành công");
          }
          else {
              listgiohang.put(tensp, listgiohang.get(tensp)+soluong);
            p.setStock(p.getStock()-soluong);
              System.out.println("thay đổi thành công");
              return;
          }
        }
        System.out.println("thay đổi không thành công");
    }

}
}
