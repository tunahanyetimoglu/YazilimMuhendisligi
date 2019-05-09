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
public class main2 {
    public static void main(String[] args){
        Chatroom chatroom = new Chatroom();
        
        Participant Tunahan = new Man("Tunahan");
        Participant Arda = new Man("Arda");
        Participant Bugra = new Man("Bugra");
        Participant Esra = new Woman("Esra");
        Participant Sema = new Woman("Sema");
        
        chatroom.Register(Tunahan);
        chatroom.Register(Arda);
        chatroom.Register(Bugra);
        chatroom.Register(Esra);
        chatroom.Register(Sema);
        
        Sema.Send("Bugra", "Hi Bugra!");
        Arda.Send("Tunahan", "Adam değilsin!");
        Bugra.Send("Arda","Hav Hav Hav havhavhav");
        Tunahan.Send("Esra", "Bu seni hiç alakadar etmez");
        Arda.Send("Sema","Seri Waffle");
    }
}
