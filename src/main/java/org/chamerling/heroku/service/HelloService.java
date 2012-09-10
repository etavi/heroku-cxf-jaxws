/**
 * 
 */
package org.chamerling.heroku.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author chamerling
 * 
 */
@WebService
public interface HelloService {

    String sayHi(String input);

    void SayByeBye(@WebParam(name = "output_param1", mode= WebParam.Mode.OUT) String output1, @WebParam(name = "output_param1", mode= WebParam.Mode.OUT) String output2);
}
