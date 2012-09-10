/**
 * 
 */
package org.chamerling.heroku.service;

import javax.xml.ws.Holder;

/**
 * @author chamerling
 * 
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHi(String input) {
        System.out.println("Hello invoked : " + input);
        return String.format("Hello '%s'", input);
    }

    @Override
    public void SayByeBye(Holder<String> output1, Holder<String> output2) {
        output1 = new Holder<String> ("Bye");
        output2 = new Holder<String> ("Bye");
    }
}
