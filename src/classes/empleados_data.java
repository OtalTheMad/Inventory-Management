package classes;

public class empleados_data
{
    private static String nombreEmp;
    private static int EID;
    
    //Sección #1 - Sección de nombreEmp
    public void setNombreEmp(String set_NombreEmp)
    {
        this.nombreEmp = set_NombreEmp;
    }
    
    public String getNombreEmp()
    {
        return nombreEmp;
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
}