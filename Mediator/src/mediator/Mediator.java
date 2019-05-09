/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

abstract class Mediator{
    public abstract void Send(String message, Colleague colleague);
}

class ConcreteMediator extends Mediator{
    private ConcreteColleague1 _colleague1;
    private ConcreteColleague2 _colleague2;

    public void setColleague1(ConcreteColleague1 _colleague1) {
        this._colleague1 = _colleague1;
    }

    public void setColleague2(ConcreteColleague2 _colleague2) {
        this._colleague2 = _colleague2;
    }

    @Override
    public void Send(String message, Colleague colleague) {
        if (colleague == _colleague1)
      {
        _colleague2.Notify(message);
      }
      else

      {
        _colleague1.Notify(message);
      }
    } 
}
abstract class Colleague{
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}

class ConcreteColleague1 extends Colleague

  {  
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    public void Send(String message)
    {
      mediator.Send(message, this);
    }
 
    public void Notify(String message)
    {
      System.out.println("Colleague1 gets message: " + message);
    }
  }
class ConcreteColleague2 extends Colleague

  {  
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    public void Send(String message)
    {
      mediator.Send(message, this);
    }
 
    public void Notify(String message)
    {
      System.out.println("Colleague1 gets message: " + message);
    }
  }

