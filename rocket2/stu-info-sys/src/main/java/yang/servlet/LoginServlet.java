package yang.servlet;

import yang.dao.UserDAO;
import yang.model.User;
import yang.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("user/login")
public class LoginServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User u= JSONUtil.read(req.getInputStream(),User.class);
        User query= UserDAO.query(u);
        if(query==null){
            throw new RuntimeException("");
        }
        return null;
    }
}
