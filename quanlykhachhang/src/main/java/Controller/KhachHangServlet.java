package Controller;

import Model.KhachHang;
import Model.QlyKhachHang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;



@WebServlet(name = "Controller.KhachHangServlet", value = "/dskhach")
public class KhachHangServlet extends HttpServlet {
    private QlyKhachHang qlyKhachHang = QlyKhachHang.getQlyKhachHang();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "add":
                showaddKhachHang(request,response);
                break;
            case "edit":
                showeditKhachHang(request, response);
                break;
            case "view":
                viewListKhachHang(request, response);
                break;
            case "delete":
                showdeleteKhachHang(request, response);
                break;
            default:
                listKhachHang(request,response);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "add":
                addKhachHang(request,response);
                break;
            case "edit":
                editKhachHang(request, response);
                break;
            case "delete":
                deleteKhachHang(request,response);
            default:
                break;
        }
    }

    private void listKhachHang(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        List<KhachHang> dsKhachHang = qlyKhachHang.display();
        request.setAttribute("dsKhachHang", dsKhachHang);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void addKhachHang(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String avatar = request.getParameter("avatar");

        KhachHang khach = new KhachHang(name,email,address,avatar);
        qlyKhachHang.add(khach);

//        rút gọn đoạn code bên dưới thành 2 dòng như sau
        request.setAttribute("message", "New customer was created");
        showaddKhachHang(request,response);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/add.jsp");
//        request.setAttribute("message", "New customer was created");
//        try{
//            dispatcher.forward(request,response);
//        } catch (ServletException e){
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }
    }

    private void showaddKhachHang(HttpServletRequest request,HttpServletResponse response){
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/add.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void editKhachHang(HttpServletRequest request,HttpServletResponse response){
    int id = Integer.parseInt(request.getParameter("id"));
    Model.KhachHang khach = qlyKhachHang.searchById(id);

    request.setAttribute("khach",khach);

    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String address = request.getParameter("address");
    String avatar = request.getParameter("avatar");

    qlyKhachHang.edit(id,name,email,address,avatar);

    showeditKhachHang(request,response);
    }
    private void showeditKhachHang(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        KhachHang khach = qlyKhachHang.searchById(id);

        request.setAttribute("khach",khach);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");

        try {
        dispatcher.forward(request,response);
    }catch (ServletException e){
        e.printStackTrace();
    }catch (IOException e){
        e.printStackTrace();
    }
    }

    private void viewListKhachHang(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        KhachHang khach = qlyKhachHang.searchById(id);

        request.setAttribute("khach",khach);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/view.jsp");

        try {
            dispatcher.forward(request,response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void deleteKhachHang(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));

        KhachHang khach = qlyKhachHang.searchById(id);
        qlyKhachHang.delete(id);
        try {
            response.sendRedirect("/dskhach");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void showdeleteKhachHang(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        KhachHang khach = qlyKhachHang.searchById(id);
        request.setAttribute("khach",khach);
        RequestDispatcher dispatcher= request.getRequestDispatcher("customer/delete.jsp");
    try {
        dispatcher.forward(request,response);
    } catch (ServletException e){
        e.printStackTrace();
    }catch (IOException e){
        e.printStackTrace();
    }
    }
}
