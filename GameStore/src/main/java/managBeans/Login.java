/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managBeans;


import facades.ClienteFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpSession;

/**
 *
 * @author david-pc
 */
@ManagedBean(name="Login")
@SessionScoped
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user = "";
    private String password = "";
    @EJB
    private ClienteFacade clientFacade = new ClienteFacade();

    /**
     * Creates a new instance of Login
     */
    public Login() {

    }

    public String loginProject() {
        System.out.println(this.getUser() + "  " + this.getPassword());

        if (clientFacade.validLogin(this.getUser(), this.getPassword())) {

            HttpSession session = Session.getSession();
            session.setAttribute("username", this.getUser());
            return "index";
        }
        return "index";
    }

    public String getLoggedUser(){
        
        if (Session.getUserName() == null)
            return "";
        
        return Session.getUserName();
    }
    
    public String logout() {
        HttpSession session = Session.getSession();
        session.invalidate();
        return "login";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
