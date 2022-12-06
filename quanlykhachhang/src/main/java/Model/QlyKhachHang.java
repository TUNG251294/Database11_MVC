package Model;

import java.util.ArrayList;
import java.util.List;

public class QlyKhachHang implements quanLy{
    private static QlyKhachHang qlyKhachHang = new QlyKhachHang();
    public static QlyKhachHang getQlyKhachHang(){
        return qlyKhachHang;
    }
    private static List<KhachHang> khachHangList;
    public QlyKhachHang(){
        khachHangList = new ArrayList<>();
        KhachHang c1 = new KhachHang("Tung","tung@gmail","DongNai","avatar/img4.jpg");
        KhachHang c2 = new KhachHang("Trang","trang@gmail","HCM","avatar/img1.jpg");
        KhachHang c3 = new KhachHang("Phuong","phuong@gmail","HaNoi","avatar/img2.jpg");
        KhachHang c4 = new KhachHang("Truc","truc@gmail","LamDong","avatar/img3.jpg");
        khachHangList.add(c1);
        khachHangList.add(c2);
        khachHangList.add(c3);
        khachHangList.add(c4);
    }
    @Override
    public List<KhachHang> display(){
        return khachHangList;
    }
    @Override
    public void add(KhachHang khach){
        khachHangList.add(khach);
    }
@Override
    public void edit(int id, String name,String email,String address,String avatar){
        KhachHang khach = searchById(id);
        if (khach != null){
            khach.setName(name);
            khach.setEmail(email);
            khach.setAddress(address);
            khach.setAvatar(avatar);
        }
    }
@Override
    public void delete(int id){
        KhachHang khach = searchById(id);
        if (khach != null){
            khachHangList.remove(khach);
        }
    }
    @Override
    public KhachHang searchById(int id){
        for(KhachHang c: khachHangList){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }
}

