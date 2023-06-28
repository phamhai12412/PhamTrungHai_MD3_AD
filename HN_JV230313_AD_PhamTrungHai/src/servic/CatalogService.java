package servic;

import model.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogService {
    private List<Catalog> catalogList;

    public CatalogService() {
        catalogList= new ArrayList<>();
    }



    public List<Catalog> getAll() {
        return catalogList;
    }




    public int getSize() {
        return catalogList.size();
    }

    public void save(Catalog themmoi) {
        if(findById(themmoi.getCatalogId())==null){
            // chức năng thêm mới
            catalogList.add(themmoi);
            System.out.println("thêm mới thành công");
        }else {
            // update
            catalogList.set(catalogList.indexOf(findById(themmoi.getCatalogId())),themmoi);
            System.out.println("sửa thành công");
        }
    }


    public Catalog findById(int id) {

            for (Catalog catalog: catalogList) {
                if(catalog.getCatalogId() == id){
                    // tìm thấy
                    return catalog;
                }
            }
            // không tìm thấy
            return null;

    }


    public  void delete(int idDel){
        if(findById(idDel) == null){
            // không ton tại
            System.err.println("ID không tồn tại");
            return;
        }
        // cho phép xóa
        catalogList.remove(findById(idDel));

    }
    public int getNewId(){
        // id tự tăng
        int max=0;
        for (Catalog catalog : catalogList) {
            if(catalog.getCatalogId()> max){
                max = catalog.getCatalogId();
            }
        }
        return max+1;
    }
}
