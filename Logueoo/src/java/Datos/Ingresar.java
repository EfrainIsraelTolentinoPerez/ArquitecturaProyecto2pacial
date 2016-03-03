package Datos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author RUBEys
 */
@ManagedBean
@RequestScoped
public class Ingresar {

    private String nombre;
    private String contraseña;
    private String apeido;
    private String domicilio;
    private int hermanos;
    private float salario;
    private String sexo;
    private HttpServletRequest responde;
    private final FacesContext acceder;
    private FacesMessage facesmensaje;

    /**
     * Creates a new instance of Ingresar
     */
    public Ingresar() {
        acceder = FacesContext.getCurrentInstance();
        responde = (HttpServletRequest) acceder.getExternalContext().getRequest();
    }

    public String Login() {
        if (nombre.equals("Arquitectura") && contraseña.equals("12345")) {
            responde.getSession().setAttribute("Sesion Usuario", nombre);
            facesmensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso Correcto", null);
            acceder.addMessage(null, facesmensaje);
            return "formulario";
        } else {
            responde.getSession().setAttribute("Sesion Usuario", nombre);
            facesmensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o Contraseña incorrecto", null);
            acceder.addMessage(null, facesmensaje);
            return "error";
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeido() {
        return apeido;
    }

    public void setApeido(String apeido) {
        this.apeido = apeido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getHermanos() {
        return hermanos;
    }

    public void setHermanos(int hermanos) {
        this.hermanos = hermanos;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getResult() {
        if (nombre != null && apeido != null && domicilio != null) {
            return "Nombre: " + getNombre()
                    + "<br/> Apeido: "
                    + getApeido()
                    + "<br/>Domicilio: "
                    + getDomicilio() + "</p>";
        } else {
            return "";
        }
    }

}
