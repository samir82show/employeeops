package controller;

import entity.Employee;
import entity.EmployeeFacade;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@Named(value = "controller")
@RequestScoped
public class Controller implements Serializable {

    @EJB
    private EmployeeFacade employeeFacade;
    @Inject
    private Employee employee;
    
    public void createEmployee() {
        employeeFacade.create(employee);
    }
    


    
}
