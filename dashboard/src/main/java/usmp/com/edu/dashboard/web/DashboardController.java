package usmp.com.edu.dashboard.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import usmp.com.edu.dashboard.Correo.sendMail;
import usmp.com.edu.dashboard.model.Correo;
import usmp.com.edu.dashboard.model.Dashboard;
import usmp.com.edu.dashboard.model.Salary;
import usmp.com.edu.dashboard.repository.DashboardRepository;

import java.util.List;
import java.util.Map;

@Controller
public class DashboardController {


    @Autowired
    private DashboardRepository dashRepository;



    @GetMapping("/dashboard/menu")
    public String list(Map<String, Object> model) {
        List<Salary> salary =dashRepository.findAll();

         int cantidadviajes = dashRepository.viajes();
         int cantidadcorreos = dashRepository.correos();
         int cantidadCalculo = dashRepository.calculos();
         int cantidadPerson = dashRepository.personas();
         int cantidadBrasil = dashRepository.brasil();
         int cantidadTarma = dashRepository.tarma();
         int cantidadRusia = dashRepository.rusia();
         int cantidadCusco = dashRepository.cusco();


        model.put("viajes",cantidadviajes);
        model.put("correos",cantidadcorreos);
        model.put("calculos",cantidadCalculo);
        model.put("personas",cantidadPerson);
        model.put("rusia",cantidadRusia);
        model.put("cusco",cantidadCusco);
        model.put("tarma",cantidadTarma);
        model.put("brasil",cantidadBrasil);



       model.put("salary", salary);
        return "index";
    }


    @Scheduled(fixedRate = 60000)
    public void reportCurrentTime() {

        List<Correo> destinatario= dashRepository.correo();
         String destinatarioCorreo=destinatario.get(0).getCorreo();
        int pk =  destinatario.get(0).getPk();
        System.out.println("pk -------->: " + pk );
        System.out.println("correo -------->: " + destinatarioCorreo );
        String asunto = "[COMPRE USTED SU BOLETOS DE VIAJE]";
        String cuerpo = "http://localhost:9095/viaje/new";
        sendMail send = new sendMail();
        sendMail.enviarConGMail(destinatarioCorreo, asunto, cuerpo);
        /*Actualizar el flag*/
        dashRepository.actualizar(pk);

    }

}
