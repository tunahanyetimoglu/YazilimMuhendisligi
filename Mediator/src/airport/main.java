/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

/**
 *
 * @author tuhanan
 */
public class main {
   public static void main(String[] args) throws InterruptedException{
        AControl  control = new AControl();
   
        A oh101 = new A();
        B oh132 = new B();
        C kf1500 = new C();
        oh101.setAirport(control);
        oh101.setFlightNumber("oh101");
        oh101.setFrom("Ankara");
        oh132.setAirport(control);
        oh132.setFlightNumber("oh132");
        oh132.setFrom("Samsun");
        kf1500.setAirport(control);
        kf1500.setFlightNumber("kf1500");
        kf1500.setFrom("Gora");
        control.Register(oh101);
        control.Register(oh132);
        control.Register(kf1500);
        
        kf1500.RequestNewWay("Request");
        oh132.RequestNewWay("Request");
        oh101.RequestNewWay("Request");
   }
}
