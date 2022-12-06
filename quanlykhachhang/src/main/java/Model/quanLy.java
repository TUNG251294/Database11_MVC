package Model;

import java.util.List;

public interface quanLy {

    List<KhachHang> display();

    void add(KhachHang khach);

    void edit(int id, String name, String email, String address, String avatar);

    void delete(int id);

    KhachHang searchById(int id);
}
