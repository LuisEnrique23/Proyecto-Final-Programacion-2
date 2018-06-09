package com.programaci.n2.viajes.repository;
import java.util.List;

import com.programaci.n2.viajes.model.Viaje;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface ViajeRepository  {

   /* @Select("select * from salary")
    List<Salary> findAll();*/

   /* @Insert("INSERT INTO practica2.viaje (viaje, idpersona) values (#{viaje1},#{nombre})")*/

   @Insert("INSERT INTO practica2.viaje (viaje, idpersona)\n" +
           "    select #{viaje1},max(idsalary) from salary")
    void insert(Viaje viaje);


    @Select("select * from practica2.salary where idsalary in (select max(idsalary) from practica2.salary)")
    List<Viaje> findSpecific();


}