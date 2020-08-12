package yang.servlet;

import yang.dao.StudentDAO;
import yang.model.Student;
import yang.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student/add")
public class StudentAddServlet extends AbstractBaseServlet {
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Student s = JSONUtil.read(req.getInputStream(), Student.class);
        StudentDAO.insert(s);
        return null;
    }
}

