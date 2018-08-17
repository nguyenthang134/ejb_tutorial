/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import demo.AccountFacadeLocal;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    @EJB
    private AccountFacadeLocal accountFacade;
    
    @WebMethod(operationName = "servicePayment")
    public String servicePayment(@WebParam(name="accountId") int accountId,
            @WebParam(name="total") double total){
        return accountFacade.Payment(accountId, total);
    }
}
