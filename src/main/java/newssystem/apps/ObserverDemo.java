package newssystem.apps;

import newssystem.layer.AbstractionLayer;
import newssystem.model.Receiver;
import newssystem.model.ReceiverImpl;
import newssystem.port.RegisterPort;
import newssystem.model.Chef;
import newssystem.model.News;
import newssystem.model.Newssystem;
import newssystem.port.AddNewsPort;

public class ObserverDemo {
    public static void main(String[] args) {
//        Newssystem newsSystem = new Newssystem();
//        Receiver receiverA = new ReceiverImpl();
//        Receiver receiverB = new ReceiverImpl();
//
//        newsSystem.addCategory("Sport");
//        newsSystem.addCategory("Politik");
//        newsSystem.addCategory("Wirtschaft");
//
//        AbstractionLayer abstractionLayer = new AbstractionLayer(newsSystem);
//        RegisterPort registerPort = abstractionLayer;
//        AddNewsPort addNewsPort = abstractionLayer;
//
//        registerPort.register(receiverA, "Sport");
//        registerPort.register(receiverB, "Sport");
//        registerPort.register(receiverB, "Politik");
//
//        //newsSystem.newNews("Nachricht: Der FC ... hat gewonnen", "Sport");
//        addNewsPort.newNews(new News("Nachricht: Der FC ... hat gewonnen", "Sport"));
//        addNewsPort.newNews(new News("Nachricht: XYZ ist neuer Bundeskanzler", "Politik"));
//
//        Chef chef = new Chef(newsSystem);
//        chef.manageNews();
//
//        registerPort.unregister(receiverB, "Sport");
//        addNewsPort.newNews(new News("Nachricht: Der FC ... hat gewonnen", "Sport"));
//        addNewsPort.newNews(new News("Nachricht: XYZ ist neuer Bundeskanzler", "Politik"));
//
//        chef.manageNews();
    }
}
