package usmp.com.edu.dashboard.repository;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import usmp.com.edu.dashboard.model.Correo;
import usmp.com.edu.dashboard.model.Salary;

import java.util.List;

@Mapper
public interface DashboardRepository {



    @Select("SELECT count(distinct dni) FROM practica2.salary ")
    int personas();

    @Select("SELECT count(*) FROM practica2.viaje")
    int viajes();


    @Select("SELECT count(flagcorreo) FROM practica2.salary where flagcorreo <> '1'")
    int correos();


    @Select("SELECT count(total_neta) FROM practica2.salary where total_neta is not null")
    int calculos();


    @Select("SELECT count(*) FROM practica2.viaje where viaje = 'Brasil'")
    int brasil();

    @Select("SELECT count(*) FROM practica2.viaje where viaje = 'Tarma'")
    int tarma();

    @Select("SELECT count(*) FROM practica2.viaje where viaje = 'Cusco'")
    int cusco();

    @Select("SELECT count(*) FROM practica2.viaje where viaje = 'Rusia'")
    int rusia();

    @Select("select * from salary")
    List<Salary> findAll();


    @Select("SELECT a.idsalary as pk ,a.correo FROM (select idsalary,correo from practica2.salary where flagcorreo <> '1') a ORDER BY RAND()  LIMIT 1")
    List<Correo> correo();

@Update("UPDATE practica2.salary SET flagcorreo = '1' where idsalary = #{idsalary} ")
    void actualizar(@Param("idsalary") int idsalary);

}
