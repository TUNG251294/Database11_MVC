package Model;

public class KhachHang {
    private int id;
    private String name;
    private String email;
    private String address;
    private String avatar;
    private static int count = 0;

    public KhachHang() {
    }

    public KhachHang(String name, String email, String address, String avatar) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.avatar = avatar;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}