package classes;

import java.util.Date;

public class empleados_data
{
    private static String nombreEmp, apellidoEmp, nombreComp;
    private static int EID;
    private static Date fechaSeleccionada;
    
    //Sección #1 - Sección de Nombres del Empleado
    public void setNombreEmp(String set_NombreEmp)
    {
        this.nombreEmp = set_NombreEmp;
    }
    
    public String getNombreEmp()
    {
        return nombreEmp;
    }
    
    public void setApellidoEmp(String set_ApellidoEmp)
    {
        this.apellidoEmp = set_ApellidoEmp;
    }
    
    public String getApellidoEmp()
    {
        return apellidoEmp;
    }
    
    public void setNombreCompleto(String set_NomCompleto)
    {
        this.nombreComp = set_NomCompleto;
    }
    
    public String getNombreCompleto()
    {
        return nombreComp;
    }
    //Sección #2 - Employee ID Section
    public void setEID(int set_EID)
    {
        this.EID = set_EID;
    }
    
    public int getEID()
    {
        return EID;
    }
    
    //Sección #3 - Fecha
    public void setFecha(Date set_Fecha)
    {
        this.fechaSeleccionada = set_Fecha;
    }
    
    public Date getFecha()
    {
        return fechaSeleccionada;
    }
}