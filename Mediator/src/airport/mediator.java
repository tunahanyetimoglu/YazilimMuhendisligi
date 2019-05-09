/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author tuhanan
 */
interface IMediator {
    void Register(Airline airline);
    void SuggestWay(String fligthNumber, String way) throws InterruptedException;
}
class AControl implements IMediator{
    private final HashMap<String, Airline> _planes;
    public AControl(){
        _planes = new HashMap<String, Airline>();
    }
    public void Register(Airline airline){
        if (!_planes.containsValue(airline))
                _planes. put(airline.getFlightNumber(), airline);
        airline.setAirport(this);
    }
    @Override
    public void SuggestWay(String fligthNumber, String way) throws InterruptedException{
        Thread.sleep(250);
        Random rand = new Random();
       
        _planes.get(fligthNumber).GetWay( String.format("%d:%dE:%d:%dW",rand.nextInt(50),rand.nextInt(50),rand.nextInt(50),rand.nextInt(50)));
    }
}
abstract class Airline
{
    private IMediator Airport;
    private String FlightNumber;

    public IMediator getAirport() {
        return Airport;
    }

    public void setAirport(IMediator Airport) {
        this.Airport = Airport;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }
    private String From;
    
    public void RequestNewWay(String myWay) throws InterruptedException{
        Airport.SuggestWay(getFlightNumber(), myWay);
    }
    public  void GetWay(String messageFromAirport){
        System.out.println(messageFromAirport + " rotasına yönelmeniz gerekiyor");
    }
}
class A extends Airline{
    @Override
    public void GetWay(String messageFromAirport){
        System.out.println("A Flight Number : " + getFlightNumber());
        super.GetWay(messageFromAirport);
    }
}
class B extends Airline{
    @Override
    public void GetWay(String messageFromAirport){
        System.out.println("B Flight Number : " + getFlightNumber());
        super.GetWay(messageFromAirport);
    }
}
class C extends Airline{
    @Override
    public void GetWay(String messageFromAirport){
        System.out.println("C Flight Number : " + getFlightNumber());
        super.GetWay(messageFromAirport);
    }
}