/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentbasew13_ex1_client;

/**
 *
 * @author Theerakan
 */
public class ComponentBaseW13_Ex1_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(calArea(10));
        System.out.print(String.format("%.2f", calRound(10)));
    }
    
    private static double calArea(double radius){
        servicesclient.CalAreaCiecle_Service service = new servicesclient.CalAreaCiecle_Service();
        servicesclient.CalAreaCiecle port = service.getCalAreaCieclePort();
        return port.calArea(radius);
    }
    
    private static double calRound(double radius){
        services.CalRoundCircle_Service service = new services.CalRoundCircle_Service();
        services.CalRoundCircle port = service.getCalRoundCirclePort();
        return port.calRound(radius);
    }
}
