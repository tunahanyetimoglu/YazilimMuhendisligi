/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author tuhanan
 */
public class main {
    public static void main(String[] args){
      ConcreteMediator m = new ConcreteMediator();
 
      ConcreteColleague1 c1 = new ConcreteColleague1(m);
      ConcreteColleague2 c2 = new ConcreteColleague2(m);
      
      m.setColleague1(c1);
      m.setColleague2(c2);
 
      c1.Send("How are you?");
      c2.Send("Fine, thanks");
    }
}
