
package mediator;

import java.util.HashMap;

/**
 *
 * @author tuhanan
 */
interface  AbstractChatroom{
    void Register(Participant participant);
    void Send(String from, String to, String message);
}
class Chatroom implements AbstractChatroom{

    private HashMap<String, Participant> _participants = new HashMap<String, Participant>();
    
    @Override
    public void Register(Participant participant) {
        if(!_participants.containsValue(participant)){
            _participants.put(participant.getName(),participant);
        }
        participant.setChatroom(this);
    }

    @Override
    public void Send(String from, String to, String message) {
       Participant participant = _participants.get(to);
 
      if (participant != null)
      {
        participant.Receive(from, message);
      }
    }
}
class Participant{
    private AbstractChatroom _chatroom;

    private String _name;
    
    public Participant(String name){
        this._name = name;
    }
    
      public AbstractChatroom getChatroom() {
        return _chatroom;
    }
    public void Send(String to, String message)
    {
      _chatroom.Send(_name, to, message);
    }
      public  void Receive(
      String from, String message)
    {     
        System.out.println(String.format("%s to %s: '%s'",
        from, getName(), message));
    }
    public void setChatroom(Chatroom _chatroom) {
        this._chatroom = _chatroom;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }
}
class Man extends Participant{
    
    public Man(String name) {
        super(name);
    }
    @Override
    public void Receive(String from, String message){
        System.out.println("To a Man : ");
        super.Receive(from, message);
    }
}
class Woman extends Participant{
    
    public Woman(String name) {
        super(name);
    }
     @Override
    public void Receive(String from, String message){
        System.out.println("To a Woman : ");
        super.Receive(from, message);
    }
}
