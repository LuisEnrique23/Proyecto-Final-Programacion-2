package com.programaci.n2.viajes.repository;


import com.programaci.n2.viajes.model.Pago;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PagoRepository {


    @Insert("INSERT INTO practica2.viaje (viaje,numtarjeta,fechavencimiento,codigocvc,nombretarjeta,idpersona) values (" +
            " #{viaje1},#{numeroTarjeta},#{fechaVencimiento},#{codigoCVC},#{nombreTarjeta}, #{value})")
    void insert(Pago pago);


    @Select("select  idsalary from practica2.salary where flagcorreo = '1'")
    int valuepk();

}
